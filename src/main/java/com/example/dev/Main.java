package com.example.dev;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Calendar cal = Calendar.getInstance();
        //System.out.println(cal.getTime());


        //Instanciar una sucursal:
        Sucursal temuco = new Sucursal(60, "Cede", "Temuco", "ST-01");

        //Instanciar una maquina:
        Maquina maquinaTemuco = new Maquina("sdasd", temuco);

        //Instanciar un miembro:
        Miembro juan = new Miembro(ModelosVehiculos.SUV, "Juan Lagos", "18644062-7"); //Crear clase validadora de RUT


        System.out.println("Es usted miembro?");
        System.out.println("1. Si\n2. No");

        int opcion = teclado.nextInt();

        //PRUEBA: Si se ingresa un dato no numerico
        //Metodo de entrada
        if (opcion == 1) {   //MIEMBRO
            Ticket ticketMiembro1 = new Ticket(maquinaTemuco);
            maquinaTemuco.addTicket(ticketMiembro1);
            maquinaTemuco.calcularDisponible();

            Ticket ticketMiembro2 = new Ticket(maquinaTemuco);
            maquinaTemuco.addTicket(ticketMiembro2);
            maquinaTemuco.calcularDisponible();

            Ticket ticketMiembro3 = new Ticket(maquinaTemuco);
            maquinaTemuco.addTicket(ticketMiembro3);
            maquinaTemuco.calcularDisponible();

            Ticket ticketMiembro4 = new Ticket(maquinaTemuco);
            maquinaTemuco.addTicket(ticketMiembro4);
            maquinaTemuco.calcularDisponible();



            System.out.println("**TARJETA ESCANEADA EXITOSAMENTE**");
            //getTime(saber cuando se escanea la entrada)

        } else if (opcion == 2) { //NO MIEMBRO

            Ticket t = new Ticket(maquinaTemuco);

        } else {
            System.out.println("OPCION NO VALIDA!");
        }

        System.out.println(maquinaTemuco.getConteoTickets());
    }



}
