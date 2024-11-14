/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex02 {

    public static void main(String[] args) throws IOException {
        DataInputStream data = null;
        String input;
        int opcao;
        float[][] opcoes = new float[3][2]; 
        String msg = """
                         [1] Café Expresso
                         [2] Café Capuccino
                         [3] Leite c/ Café
                         [4] Totalizar Vendas
                         """;
        try {
            do {
                System.out.println(msg);
                data = new DataInputStream(System.in);
                opcao = Integer.parseInt(input = data.readLine());

                switch (opcao){
                    case 1 -> {
                        opcoes[0][0] += 0.75;
                        opcoes[0][1] ++;
                                }
                    case 2 -> {
                        opcoes[1][0] += 0.75;
                        opcoes[1][1] ++;
                                }
                    case 3 -> {
                        opcoes[2][0] += 0.75;
                        opcoes[2][1] ++;
                                }
                    case 4 -> {
                        System.out.println("Total de de cafés vendidos: " + opcoes[1][1] + opcoes[2][1] + opcoes[0][1]);
                        System.out.printf("café expresso: R$%.2f | %.0f unidades \n", opcoes[0][0], opcoes[0][1]);
                        System.out.printf("café capuccino: R$%.2f | %.0f unidades \n", opcoes[1][0], opcoes[1][1]);
                        System.out.printf("leite com café: R$%.2f | %.0f unidades", opcoes[2][0], opcoes[2][1]);
                    }
                }
            } while (opcao != 4);
        }
        catch (Exception erro){
            System.out.println("erro: " + erro.getMessage());
        }
        
        data.close();
    }
}
