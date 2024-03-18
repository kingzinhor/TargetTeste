package org.example;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // A lógica por trás desse código é bem simples, não há necessidade de comentários

        while (true){
            System.out.print("Digite algo:");
            String texto = scanner.nextLine(), textoInvertido = "";

            for (char c : texto.toCharArray()){
                textoInvertido = c + textoInvertido;
            }

            System.out.println(textoInvertido);
            System.out.println();
        }
    }
}
