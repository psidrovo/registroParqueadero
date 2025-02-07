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
    private int fracciones;
    private int minutos;
    private Vehiculo vehiculoTicket;

    public Ticket() {
    }

    public Ticket(int numero, Date fechaHoraIngreso, Date fechaHoraSalida, double total, Vehiculo vehiculoTicket) {
        this.numero = numero;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.fechaHoraSalida = fechaHoraSalida;
        this.total = total;
        this.fracciones = 0;
        this.minutos=0;
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

    public int getFracciones() {
        return fracciones;
    }

    public void setFracciones(int fracciones) {
        this.fracciones = fracciones;
    }

    public Vehiculo getVehiculoTicket() {
        return vehiculoTicket;
    }

    public void setVehiculoTicket(Vehiculo vehiculoTicket) {
        this.vehiculoTicket = vehiculoTicket;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getMinutos() {
        return minutos;
    }

    
    public void CalcularTotal() {
        
        long millisIngreso = fechaHoraIngreso.getTime();
        long millisSalida = fechaHoraSalida.getTime();
        long milisDiferencia = millisSalida-millisIngreso;
        milisDiferencia = milisDiferencia/60000;
        milisDiferencia=milisDiferencia+1;
        this.setMinutos(Integer.parseInt(milisDiferencia+""));
        milisDiferencia = (milisDiferencia/10)+1;         
        this.setFracciones(Integer.parseInt(milisDiferencia+""));
        this.setTotal(this.getFracciones()*0.25);

    }

}
