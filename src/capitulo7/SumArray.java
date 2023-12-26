package capitulo7;

//Calculando a soma dos elementos array.
public class SumArray
{
    public static void main(String[] args)
    {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        for(int counter = 0; counter < array.length; counter++)
            total += array[counter];

        System.out.printf("Total das notal no array é: %d%n", total);
    }
}
