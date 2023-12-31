package capitulo6;

import java.util.Scanner;

public class MaximumFinder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira três números separados por espaços: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("O maior valor é: " + result);
    }

    public static double maximum(double x, double y, double z)
    {
        return Math.max(x, Math.max(y,z));
    }
}
