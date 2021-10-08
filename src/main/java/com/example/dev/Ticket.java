package com.example.dev;

import java.util.Calendar;

public class Ticket {

    public String id;
    public double descuento; //Descuento por dia de la semana
    public Maquina maquina;
    public String estadia; //tiempo de ingreso y salida en un sout
    public int horaIngreso;
    public int horaSalida;
    public int valor;


    public Ticket(Maquina maquina) {
        this.maquina = maquina;
        generadorId();

    }

    public void generadorId() {

        //anteponer una T al inicio
    }

    public int calcularValor() {
        return 5;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public String getEstadia() {
        return estadia;
    }

    public void setEstadia(String estadia) {
        this.estadia = estadia;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
