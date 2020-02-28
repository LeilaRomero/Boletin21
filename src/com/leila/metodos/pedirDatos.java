/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leila.metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Leila
 */
public class pedirDatos {
    
    private final int numero = 0;
    private final float numeros=0;

    public static float pedirFloat(String mensaje) {
        
        float numeros = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
        return numeros;
    }

    public static int pedirInt(String mensaje) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return numero;
    }

    public static String pedirString(String mensaje) {

        String datos = (JOptionPane.showInputDialog(mensaje));
        return datos;
    }
    
}
