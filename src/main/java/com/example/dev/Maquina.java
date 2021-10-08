package com.example.dev;

import java.util.ArrayList;

public class Maquina {

    public String id;
    public Sucursal sucursal;
    public int conteoTickets;
    public ArrayList<Ticket> tickets = new ArrayList<>();

    public Maquina(String id, Sucursal sucursal) {
        this.id = id;
        this.sucursal = sucursal;
    }

    public void calcularDisponible(){
        if (conteoTickets==sucursal.getCapacidad()){
            System.out.println("Estacionamiento repleto");
        }
        else {
            System.out.println("Aun quedan "+(sucursal.getCapacidad()-conteoTickets)+" espacios disponibles");
        }
    }

    public void generadorId() {
//anteponer una M al inicio
    }

    public void addTicket(Ticket newTicket) {
        tickets.add(newTicket);
        conteoTickets+=1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public int getConteoTickets() {
        return conteoTickets;
    }

    public void setConteoTickets(int conteoTickets) {
        this.conteoTickets = conteoTickets;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
}
