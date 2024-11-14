/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex4 {

    public static void main(String[] args) throws IOException {
        DataInputStream data = null;
        String input = "";
        String[] user = {"1234", "9999"};
        boolean[] isValid = {false,false};
        
        do {
            System.out.printf("Codigo de usuario: ");
            data = new DataInputStream(System.in);
            input = data.readLine();
            if (!input.equals(user[0])){
                System.out.println("Usuario invalido!");
            } else {
                isValid[0] = true;
            }
        } while(!isValid[0]);
        do {
            System.out.printf("Senha de acesso: ");
            data = new DataInputStream(System.in);
            input = data.readLine();
            if (!input.equals(user[1])){
                System.out.println("Senha incorreta!");
            } else {
                isValid[1] = true;
            }
        } while(!isValid[1]);
        data.close();
        if (isValid[0] && isValid[1]){
            System.out.println("Acesso permitido");
        }
    }
}
