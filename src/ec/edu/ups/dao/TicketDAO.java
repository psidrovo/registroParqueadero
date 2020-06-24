/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;
import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.modelo.Ticket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public class TicketDAO implements ITicketDAO {
   
    private List<Ticket> listaTicket;
    private int codigo;

    public TicketDAO() {
        listaTicket = new ArrayList<Ticket>();
        codigo=0;
    }
    
    @Override
    public void create(Ticket ticket) {
        listaTicket.add(ticket);
    }

    @Override
    public Ticket read(int codigo) {
            for (Ticket ticket : listaTicket) {
            if(ticket.getNumero()==codigo){
                return ticket;
            }  
        }
        return null;
    }

    @Override
    public void update(Ticket ticket) {
            for (int i = 0; i < listaTicket.size(); i++) {
            Ticket t=listaTicket.get(i);
            if(t.getNumero()==ticket.getNumero()){
                listaTicket.set(i, ticket);
                break;
            }
        }
    }

    @Override
    public void delete(Ticket ticket) {
        Iterator<Ticket> it =listaTicket.iterator();
        while (it.hasNext()) {
            Ticket t = it.next();
            if(t.getNumero()==ticket.getNumero()){
                it.remove();
                break;
            }  
        }
    }

    @Override
    public List<Ticket> findAll() {
        return listaTicket;
    }

    @Override
    public int obtenerUltimoCodigo() {
        return codigo;
    }
}
