import java.util.Scanner;

public class TriploNumero {

    public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);

       //entrada do número
       System.out.print("Digite um número: ");
       int numero = entrada.nextInt();

     System.out.println("O triplo do número é " + numero * 3);

    entrada.close();
}
}
