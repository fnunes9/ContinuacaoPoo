/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.continuacaopoo;

/**
 *
 * @author fernanda.nunes
 */
public class MetodosHora {
    public static boolean VerificaHora(int hora,int minuto,int segundo){       
        return hora<=24 && hora>=0  && minuto<60 && minuto>=0 && segundo <60 && segundo>=0;
    }
}
