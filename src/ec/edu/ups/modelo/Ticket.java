/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Paul Idrovo
 */
public class Ticket {

    private int numero;
    private Date fechaHoraIngreso;
    private Date fechaHoraSalida;
    private double total;
    private Vehiculo vehiculoTicket;

    public Ticket() {
    }

    public Ticket(int numero, Date fechaHoraIngreso, Date fechaHoraSalida, double total, Vehiculo vehiculoTicket) {
        this.numero = numero;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.fechaHoraSalida = fechaHoraSalida;
        this.total = total;
        this.vehiculoTicket = vehiculoTicket;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public void setFechaHoraIngreso(Date fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
    }

    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Vehiculo getVehiculoTicket() {
        return vehiculoTicket;
    }

    public void setVehiculoTicket(Vehiculo vehiculoTicket) {
        this.vehiculoTicket = vehiculoTicket;
    }

}
