/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.continuacaopoo;

/**
 *
 * @author fernanda.nunes
 */
public class Time {

    int hora, minuto, segundo;

    public Time() {

    }

    public void SetTime(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return hora + "h " + minuto+"min " +  segundo+"s";
    }

    public int GetHora() {
        return hora;
    }

    public int SetHora(int NovoHorario) {
        return NovoHorario;
    }

    public int GetMinuto() {
        return minuto;
    }

    public int SetMinuto(int NovoMinuto) {
        return NovoMinuto;
    }

    public int GetSegundo() {
        return segundo;
    }

    public int SetSegundo(int NovoSegundo) {
        return NovoSegundo;
    }
}
