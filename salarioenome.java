import java.util.Scanner;

import javax.sound.sampled.Line;

public class CalculoDeSalario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner pessoa = new Scanner(System.in);

        // Entrada do salário
        System.out.print("Digite o seu salário: ");
        float salario = scanner.nextFloat();
        System.out.println("Digite seu Nome: ");
        String nome = pessoa.nextLine();
        
        
                // Verificação do salário
                if (salario > 20000) {
                    System.out.println("Seu salário é alto");
                } else if (salario >= 5000) {
                    System.out.println("Seu salário é médio");
                } else {
                    System.out.println("Seu salário é baixo");
                }
        
                scanner.close();
            }
        
            private static String nextline() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'nextline'");
            }
}

