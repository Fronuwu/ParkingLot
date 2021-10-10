package com.example.test;
import com.example.dev.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.example.dev.Maquina.*;
import static com.example.dev.Ticket.Gen_Id_Ticket;


public class MaquinaTest {
    static String idChek = null;
    static String ticketChek = null;

    @BeforeAll
    public static void setUp(){idChek = Gen_Id_Maquina(); ticketChek = Gen_Id_Ticket();}


    @Test
    public void id_length(){
        //String pass = Gen_Pass();
        int largo = idChek.length();

        Assertions.assertTrue(largo==12);
    }

    @Test
    public void ticket_length(){
        //String pass = Gen_Pass();
        int largo = ticketChek.length();

        Assertions.assertTrue(largo==8);
    }



}
