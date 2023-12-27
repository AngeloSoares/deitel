package capitulo7;
//Utilizando for aprimorada para somar inteiros em um array.

public class EnhancedForTest
{
    public static void main(String[] args)
    {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        for(int number : array) // for aprimorado
            total += number;

        System.out.printf("Total dos elementos de array é: %d%n", total);
    }
}
