package com.example.dev;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //Calendar cal = Calendar.getInstance();
        //System.out.println(cal.getTime());

        Sucursal s = new Sucursal(60, "Cede", "Temuco", "asdasd");
        Maquina m = new Maquina(1, s );
        Miembro persona = new Miembro(ModelosVehiculos.SUV, "Francisca", "206440627");

    }
}
