package aula.pkg4;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número inicial: ");
        int inicio = sc.nextInt();
        
        System.out.print("Digite o número final: ");
        int fim =sc.nextInt();
        
        System.out.print("Digite o incremento: ");
        int inc = sc.nextInt();
        
        System.out.print("Contagem: ");
        for (int i = inicio; i <= fim; i += inc ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
