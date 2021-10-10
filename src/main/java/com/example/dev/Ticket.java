package com.example.dev;

import java.util.Calendar;
import java.util.Locale;

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
        this.id = Gen_Id_Ticket();

    }

    public static String Gen_Id_Ticket(){
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = mayus.toLowerCase(Locale.ROOT);
        String nums = "0123456789";
        String alphanums = mayus+minus+nums;

        StringBuilder contra = new StringBuilder(8);

        contra.append("T-"); //i=2 then alfa

        int i;
        for (i=2; i<8;i++){
            contra.append(alphanums.charAt((int)(Math.random()*alphanums.length())));
        }

        return contra.toString();
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
