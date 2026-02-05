import java.util.Scanner;

class CalculoDenumeros {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numero1 = numero.nextFloat();

        System.out.print("Digite outro número: ");
        float numero2 = numero.nextFloat();

        System.out.println("\nMenu");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");

        System.out.print("Escolha uma das opções: ");
        int opcao = numero.nextInt();

        switch (opcao) {

            case 1:
                float soma = numero1 + numero2;
                System.out.println("Resultado: " + soma);
                break;

            case 2:
                float subtrair = numero1 - numero2;
                System.out.println("Resultado: " + subtrair);
                break;

            case 3:
                float multiplicar = numero1 * numero2;
                System.out.println("Resultado: " + multiplicar);
                break;

            case 4:
                if (numero2 != 0) {
                    float dividir = numero1 / numero2;
                    System.out.println("Resultado: " + dividir);
                } else {
                    System.out.println("Não é possível dividir por zero");
                }
                break;

            case 5:
                System.out.println("Programa encerrado.");
                break;

            default:
                System.out.println("Opção inválida");
        }
        

        numero.close();
    }

}


