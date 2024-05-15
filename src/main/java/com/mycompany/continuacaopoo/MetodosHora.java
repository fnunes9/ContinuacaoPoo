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
    public static boolean VerificaHorario(Time tempo){       
        return tempo.GetHora()<=24 && tempo.GetHora()>=0  && tempo.GetMinuto()<60 && tempo.GetMinuto()>=0 && tempo.GetSegundo()<60 && tempo.GetSegundo()>=0;
    }
}
