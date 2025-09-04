package aula.pkg4;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa "+i+": ");
            soma += sc.nextInt();
        }
        double media = soma / 5.0;
        System.out.println("A média das idades é: " + media);
    }
    
}
