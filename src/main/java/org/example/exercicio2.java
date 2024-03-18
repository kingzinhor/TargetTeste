package org.example;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, indice, indiceAnterior, proximoIndice;

        while (true) { // Este while permite a execução repetida do sistema
            System.out.print("Insira um valor numérico:");
            try { // Caso não seja possível converter o valor inserido para um valor numérico, vamos tentar novamente
                valor = Integer.parseInt(scanner.next());

                if (valor == 0) { // 0 e 1 são os dois algarismos iniciais da sequência, então começo por eles
                    System.out.println("Zero está na sequência de Fibonacci");
                    continue; // Se realmente foi zero, então já podemos passar pro próximo loop sem problemas.
                }

                /*
                * Perceba que eu faço a comparação com zero, mas não faço com 1.
                * Isso acontece por que a sequência de Fibonacci começa com {0, 1, 1..}
                * onde o zero e 1 iniciais não fazem parte de um RESULTADO da lógica
                * por trás da sequência de Fibonacci, dando a perceber que a sequência
                * lógica começa a partir do segundo 1 que é proveniente da soma do
                * último valor com o penúltimo. O sistema abaixo identifica valor por
                * valor da sequência de Fibonacci e o compara com o valor inserido
                * pelo usuário para ver se eles são iguais, e essa sequência
                * do while começa pelo segundo 1. Por isso comparamos apenas o 0 sozinho.
                */

                indice = 1; // Começando pelo primeiro 1
                indiceAnterior = 0;

                // Se passarmos do valor que estamos procurando, então quer dizer que ele não está presente na sequência
                while (indice <= valor){
                    if (indice == valor) {
                        System.out.println(valor + " está incluso na sequência de Fibonacci");
                        break; // Se eu já achei, não tem por que continuar.
                    }

                    proximoIndice = indice + indiceAnterior;
                    indiceAnterior = indice;
                    indice = proximoIndice;
                }

                // Se passamos pelo loop e o valor foi encontrado, não há necessidade de terminar o bloco do While
                if (indice == valor) {continue;}

                // Se não foi encontrado, então ele não existe na sequência
                else {
                    System.out.println("O valor não está incluso na sequência de Fibonacci.");
                }

            } catch (Exception e) {
                System.out.println("O valor inserido não é válido. Tente novamente");
            }
        }
    }
}