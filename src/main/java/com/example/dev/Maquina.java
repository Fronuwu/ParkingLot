package com.example.dev;

public class Maquina {

    public int id;
    public Sucursal sucursal;
    public int conteoTickets;

    public Maquina(int id, Sucursal sucursal) {
        this.id = id;
        this.sucursal = sucursal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
