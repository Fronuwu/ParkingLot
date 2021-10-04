package com.example.dev;

import java.util.Calendar;

public class Ticket {

    public boolean esMiembro;
    public double descuento;
    public Miembro miembro;
    public Maquina maquina;
    public Calendar horaIngreso;
    public Calendar horaSalida;

    public Ticket(boolean esMiembro, double descuento, Miembro miembro, Maquina maquina, Calendar horaIngreso, Calendar horaSalida) {
        this.esMiembro = esMiembro;
        this.descuento = descuento;
        this.miembro = miembro;
        this.maquina = maquina;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
    }

    public boolean isEsMiembro() {
        return esMiembro;
    }

    public void setEsMiembro(boolean esMiembro) {
        this.esMiembro = esMiembro;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Calendar getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Calendar horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Calendar getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Calendar horaSalida) {
        this.horaSalida = horaSalida;
    }
}
