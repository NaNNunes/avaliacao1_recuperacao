/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex03;

import javax.swing.JOptionPane;

/**
 *
 * @author r.nunes
 */
public class Ex03 {

    public static void main(String[] args) {
        String strVal;
        String msg;
        int valor;
        try{
            valor = Integer.parseInt(strVal = JOptionPane.showInputDialog(null, "Informe um valor:"));
            JOptionPane.showMessageDialog(null, "Antecessor: " + (valor-1) +"\nSucessor: " + (valor+1));
        }
        catch (Exception erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }
}
