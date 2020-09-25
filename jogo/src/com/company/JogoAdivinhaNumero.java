package com.company;

public class JogoAdivinhaNumero {
    public static void dica(int palpite, int numero, int tentativas){
        if(palpite > numero){
            System.out.println("Seu palpite é maior que o número sorteado.");
        } else {
            if(palpite < numero){
                System.out.println("Seu palpite é menor que o número sorteado.");
            } else {
                System.out.println("Parabéns, você acertou! O número era " + numero);
                System.out.println("Você tentou " + tentativas + " vezes antes de acertar!");
            }
        }

    }
}
