package aula.pkg4;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um caractere: ");
        char c = sc.next().charAt(0);
                
        System.out.print("Digita um número: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
    
}
