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
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class ControladorVehiculo {
    private IClienteDAO clienteDAO;
    private ITicketDAO ticketDAO;
    private IVehiculoDAO vehiculoDAO;
    
    private Cliente cliente;
    private Ticket ticket;
    private Vehiculo vehiculo;

    public ControladorVehiculo(IClienteDAO clienteDAO, ITicketDAO ticketDAO, IVehiculoDAO vehiculoDAO) {
        this.clienteDAO = clienteDAO;
        this.ticketDAO = ticketDAO;
        this.vehiculoDAO = vehiculoDAO;
    }
    
    public Vehiculo buscarVehiculo(String placa){
        vehiculo=vehiculoDAO.read(placa);
        return vehiculo;
    }
    
}
