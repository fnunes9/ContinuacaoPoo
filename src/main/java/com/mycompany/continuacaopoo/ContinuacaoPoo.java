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
        //Time tempo=new Time(10,20,30);
        
        boolean teste = MetodosHora.VerificaHora(23, 0,0);
        if(teste == false){
            System.out.println("Digite um formato válido: 0-23 / 0-59 / 0-59");
        }else{
            System.out.println("Hora válida");
        }
        
    }
    public void MostraHora(Time tempo){
        // teste=MetodosHora.VerificaHora(0, 0, 0)
      // if(temp.){
       //}
        
    }
}
