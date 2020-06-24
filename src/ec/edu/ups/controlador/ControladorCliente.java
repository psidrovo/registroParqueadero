/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.idao.*;
import ec.edu.ups.modelo.*;
/**
 *
 * @author Paul Idrovo
 */
public class ControladorCliente {
    
    
    private IClienteDAO clienteDAO;
    private ITicketDAO ticketDAO;
    private IVehiculoDAO vehiculoDAO;
    
    private Cliente cliente;
    private Ticket ticket;
    private Vehiculo vehiculo;

    public ControladorCliente(IClienteDAO clienteDAO, ITicketDAO ticketDAO, IVehiculoDAO vehiculoDAO) {
        this.clienteDAO = clienteDAO;
        this.ticketDAO = ticketDAO;
        this.vehiculoDAO = vehiculoDAO;

    }
    
    public void crearCliente(String cedula, String nombre, String apellido, String direccion, String telefono){
        cliente=new Cliente(cedula, nombre, apellido, direccion, telefono);
        clienteDAO.create(cliente);
    }
    
    public void editarCliente(String cedula, String nombre, String apellido, String direccion, String telefono){
        cliente= new Cliente(cedula, nombre, apellido, direccion, telefono);
        clienteDAO.update(cliente);
    }
    
    public void eliminarCliente(String cedula){
        cliente=new Cliente(cedula, null, null, null, null);
        clienteDAO.delete(cliente);
    }
    
    public Cliente verCliente(String cedula){
        cliente =clienteDAO.read(cedula);
        
        return cliente;
    }
    
    //public void listarClientes(){
        
    //}
    
    
    
    
}
