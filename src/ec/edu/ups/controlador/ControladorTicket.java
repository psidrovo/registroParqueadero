/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class ControladorTicket {
    private IClienteDAO clienteDAO;
    private ITicketDAO ticketDAO;
    private IVehiculoDAO vehiculoDAO;
    
    private Cliente cliente;
    private Ticket ticket;
    private Vehiculo vehiculo;

    public ControladorTicket(IClienteDAO clienteDAO, ITicketDAO ticketDAO, IVehiculoDAO vehiculoDAO) {
        this.clienteDAO = clienteDAO;
        this.ticketDAO = ticketDAO;
        this.vehiculoDAO = vehiculoDAO;
    }
    
    
    public void ingresoVehiculoTicket(Date fechaDeIngreso, String placa){
        int numero = ticketDAO.obtenerUltimoCodigo()+1;
        vehiculo=vehiculoDAO.read(placa);
        ticket=new Ticket(numero, fechaDeIngreso, null, 0.00, vehiculo);
        ticketDAO.create(ticket);
    }
    
    public void salidaVehiculoTicket(int numero, Date fechaDeSalida){
        //vehiculo=vehiculoDAO.read(placa);
        ticket=ticketDAO.read(numero);
        ticket.setFechaHoraSalida(fechaDeSalida);
        ticket.CalcularTotal();
        ticketDAO.update(ticket);
        //ticketDAO.delete(ticket);
    }
    
    public Ticket verTicketPorCodigo(int numero){
        ticket=ticketDAO.read(numero);
        
        if(ticket!=null){
            return ticket;
        }else{
         return null;   
        }
  
    }
    
    public List<Ticket> listaIngresoDeTickets(){
        
        return ticketDAO.listaDeTicketSegunTipo("Ingreso");
    }
    
    public List<Ticket> listaSalidaDeTickets(){
        return ticketDAO.listaDeTicketSegunTipo("Salida");
    }
    
    public int obtenerSiguienteCodigo(){
        int codigo=ticketDAO.obtenerUltimoCodigo();
        return ++codigo;
    }

    public Ticket calcularPago(int codigo, Date fechaDeSalida) {
        ticket=ticketDAO.read(codigo);
        ticket.setFechaHoraSalida(fechaDeSalida);
        ticket.CalcularTotal();
        return ticket;
    }
    
    public List<Ticket> listaGeneralDeTickets(){
        return ticketDAO.findAll();
    }
   
}
