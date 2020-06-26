/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.idao.*;
import ec.edu.ups.modelo.*;
import java.util.List;
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
    
    public void crearCliente(String cedula, String nombre, String direccion, String telefono){
        cliente=new Cliente(cedula, nombre, direccion, telefono);
        clienteDAO.create(cliente);
    }
    
    public void editarCliente(String cedula, String nombre, String direccion, String telefono){
        cliente= new Cliente(cedula, nombre, direccion, telefono);
        clienteDAO.update(cliente);
    }
    
    public void eliminarCliente(String cedula){
        cliente=new Cliente(cedula, null, null, null);
        clienteDAO.delete(cliente);
    }
    
    public Cliente verCliente(String cedula){
        cliente =clienteDAO.read(cedula);        
        return cliente;
    }
    
    public Cliente verClientePlaca(String placa){
        cliente =clienteDAO.encontrarPlaca(placa);        
        return cliente;
    }
    
    public void crearVehiculo(String placa, String marca, String modelo, String cedula){
        cliente=clienteDAO.read(cedula);
        vehiculo=new Vehiculo(placa, marca, modelo,cliente);
        vehiculoDAO.create(vehiculo);
        cliente.agregarVehiculo(vehiculo);
        clienteDAO.update(cliente);
    }
    
    public void editarVehiculo(String placa, String marca, String modelo){
        vehiculo=new Vehiculo(placa, marca, modelo, cliente);
        vehiculoDAO.update(vehiculo);
        cliente.editarVehiculo(vehiculo);
        clienteDAO.update(cliente);
    }
    
    public void eliminarVehiculo(String placa){
        vehiculo=vehiculoDAO.read(placa);
        vehiculoDAO.delete(vehiculo);
        cliente.eliminarVehiculo(vehiculo);
        clienteDAO.update(cliente);
    }
    
    public Vehiculo buscarVehiculo(String placa){
        vehiculo=cliente.verVehiculo(placa);
        return vehiculo;
    }
    
    public List<Vehiculo> listarVehiculos(){
        return cliente.listarVehiculos();
    }
      
}
