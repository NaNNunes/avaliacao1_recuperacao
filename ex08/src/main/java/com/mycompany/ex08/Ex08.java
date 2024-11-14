/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex08;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author r.nunes
 */
public class Ex08 {

    public static void main(String[] args) throws IOException {
        DataInputStream data = null;
        String input = "";
        String msg = "";
        String[] lutador = new String[3];
        float peso;
        
        while(true){
            try{
                for (int i = 0; i < 2; i++) {
                    switch (i) {
                        case 0 -> msg = "Nome do lutador: ";
                        case 1 -> msg = "Peso do lutador: ";
                    }
                    System.out.println(msg);
                    data = new DataInputStream(System.in);
                    lutador[i] = input = data.readLine();
                }

                peso = Integer.parseInt(lutador[1]);

                if(peso < 65){
                    lutador[2] = "Pena";
                }
                else if (peso < 72){
                    lutador[2] = "Leve";
                }
                else if (peso < 79){
                    lutador[2] = "Ligeiro";
                }
                else if (peso < 86){
                    lutador[2] = "Meio Médio";
                }
                else if (peso < 93){
                    lutador[2] = "Médio";
                }
                else if (peso < 100){
                    lutador[2] = "Meio Pesado";
                }
                else{
                    lutador[2] = "Pesado";
                }
                toFile(lutador);
                break;
            }
            catch(Exception erro){
                System.out.println("Erro: " + erro.getMessage());
            }
        }
        data.close();
    }
    
    public static void toFile(String[] lutador) throws IOException{
        
        FileWriter file = new FileWriter(".\\UFC Cachaça.txt");
        PrintWriter record = new PrintWriter(file);
        
        String msg = ""
                + "Nome fornecido: " + lutador[0] 
                + "\nPeso fornecido: " + lutador[1] 
                + "\nO lutador "+lutador[0] +" pesa "+ lutador[1] +"kg e se enquadra na categoria "+ lutador[2];
        record.printf(msg);
        record.close();
        
    }
}
