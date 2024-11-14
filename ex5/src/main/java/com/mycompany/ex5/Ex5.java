/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex5;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex5 {

    public static void main(String[] args) throws IOException {
        DataInputStream data = null;
        String input = "";
        int valor;
        
        int contaNum = 0;
        int[] valores;
        float media = 0;
        int somaNum = 0;
        
        do{
            while (true){
                try{
                    System.out.println("Informe um numero: ");
                    data = new DataInputStream(System.in);
                    valor = Integer.parseInt(input = data.readLine());
                    contaNum++;
                    somaNum  += valor;
                    media = somaNum/contaNum;

                    System.out.println("Deseja continuar: sim | nao");
                    data = new DataInputStream(System.in);
                    input = data.readLine();
                    break;
                }
                catch(Exception erro){
                    System.out.println("Erro: " + erro.getMessage());
                }
            }
        } while(input.equals("sim"));
        data.close();
        System.out.printf("Media: %f \nsSoma de valores: %d \nQtd valores: %d", media, somaNum, contaNum);
    }
}
