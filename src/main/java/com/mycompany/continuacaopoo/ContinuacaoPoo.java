/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.continuacaopoo;

/**
 *
 * @author fernanda.nunes
 */
public class ContinuacaoPoo {

    public static void main(String[] args) {
        Time horario = new Time();
        horario.SetTime(10,20,30); 
        MostraHorario(horario);

    }

    public static  void MostraHorario(Time tempo) {
        boolean horarioCorreto = MetodosHora.VerificaHorario(tempo);
        if(horarioCorreto== false)
        {
                System.out.println("Digite um formato válido: 0-23 / 0-59 / 0-59");
        } else
        {
            System.out.println("Hora válida");
        }
    }
}
