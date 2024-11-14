/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex01;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex01 {

    public static void main(String[] args) throws IOException {
        DataInputStream data = null;
        String input;
        String msg = "nao funciona";
        int[] idade = new int[4]; 
        
        try {
            for (int i = 0; i < 3; i++) {
                switch (i) {
                    case 0 -> msg = "Escreva suas anos completos de vida: ";
                    case 1 -> msg = "Agora escreva seus meses completos de vida: ";
                    case 2 -> msg = "Por ultimo escreva seus dias completos de vida: ";
                }

                System.out.printf(msg);
                data = new DataInputStream(System.in);
                idade[i] = Integer.parseInt(input = data.readLine());
                switch (i) {
                    case 0 -> idade[3] += idade[i] * 365;
                    case 1  -> idade[3] += idade[i] * 30;
                }
            } 
            System.out.println("Sua idade em dias: " + idade[3]);
            data.close();
        }
        catch (Exception erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
