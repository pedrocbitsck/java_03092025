package aula.pkg4;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int num = sc.nextInt();
        int maior = num;
        int menor = num;

        for (int i = 2; i <= 7; i++) {
            System.out.print("Digite o " + i + "º número: ");
            num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
