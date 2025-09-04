package aula.pkg4;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            soma += sc.nextDouble();
        }

        double media = soma / 5;
        System.out.println("A média é: " + media);
    }
}


