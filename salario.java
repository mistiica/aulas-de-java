//Faça um programa que recebe o salário de uma pessoa e caracterize entre alta> 20.000 media entre 5.000 e 20.000 e renda baixa < 5.000

import java.util.Scanner;

public class CalculoDeSalario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada do salário
        System.out.print("Digite o seu salário: ");
        float salario = scanner.nextFloat();

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
}
