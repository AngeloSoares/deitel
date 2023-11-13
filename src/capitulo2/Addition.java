package capitulo2;
//2.7. Programa de adição que insere dois números, então exibe a soma deles.

import java.util.Scanner;
public class Addition {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Digite um número inteiro: ");
        number1 = input.nextInt();

        System.out.print("Digite outro número inteiro: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("A soma é %d%n", sum);
    }

}
