package com.company;
import java.util.Random;
import java.util.Scanner;

import static com.company.JogoAdivinhaNumero.dica;

public class Main {

    public static void main(String[] args) {
        int palpite,
                sorteado,
                tentativas=0;

        Scanner entrada = new Scanner(System.in);

        Random geradorDeAleatorios = new Random();
        sorteado = geradorDeAleatorios.nextInt(100) + 1;
        System.out.println("Número entre 1 e 100 sorteado");

        do{
            System.out.print("\n\n\n\n-----------------\n");
            System.out.println("Número de tentativas: " + tentativas);

            System.out.print("Qual seu palpite: ");
            palpite = entrada.nextInt();

            tentativas++;

            dica(palpite,sorteado, tentativas);
        }while (palpite != sorteado);

    }

}
