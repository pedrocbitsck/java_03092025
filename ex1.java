public class ex1 {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) { // vai de 1 até 10
            System.out.println("Tabuada do " + i + ":");
            
            for (int j = 1; j <= 10; j++) { // multiplicador também de 1 até 10
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            System.out.println(); // linha em branco para separar
        }
    }
}