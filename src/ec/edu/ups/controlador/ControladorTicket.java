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
    
    
    public void ingresoVehiculoTicket(int numero, Date fechaDeIngreso, String placa){
        vehiculo=vehiculoDAO.read(placa);
        ticket=new Ticket(numero, fechaDeIngreso, null, numero, vehiculo);
    }
    
    public void salidaVehiculoTicket(int numero, Date fechaDeSalida, String placa){
        vehiculo=vehiculoDAO.read(placa);
        ticket=new Ticket(numero, null, fechaDeSalida, numero, vehiculo);
        ticketDAO.delete(ticket);
    }
    
    public Ticket verTicketPorCodigo(int numero){
        ticket=ticketDAO.read(numero);
        
        if(ticket!=null){
            return ticket;
        }else{
         return null;   
        }
  
    }
    
    public int obtenerSiguienteCodigo(){
        int codigo=ticketDAO.obtenerUltimoCodigo();
        return ++codigo;
    }
    
    
}
