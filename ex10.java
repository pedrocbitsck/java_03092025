package aula.pkg4;

import java.util.Scanner;
import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(100) + 1; // número entre 1 e 100
        int tentativas = 0;
        int chute;

        System.out.println("=== Jogo da Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu chute: ");
            chute = sc.nextInt();
            tentativas++;

            if (chute < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (chute > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("🎉 Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (chute != numeroSecreto);
    }
}
