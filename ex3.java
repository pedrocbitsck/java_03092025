package aula_4;

import java.util.Scanner;

public class ex3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);

        sc.close();
    }
}