package capitulo7;

// Inicializando os elementos de um array como valores padrã de zero.
public class InitArray
{
    public static void main(String[] args)
    {
        int[] array = new int[10]; // cria o objeto array

        System.out.printf("%s%8s%n", "Índice", "Valor");

        for(int counter = 0; counter < array.length; counter++)
            System.out.printf("%-3d%8d%n", counter, array[counter]);

        System.out.println("\n\n\n===============Inicializando Array com valores=======================\n\n\n");

        int[] array2 = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37}; // cria o objeto array

        System.out.printf("%s%8s%n", "Índice", "Valor");

        for(int counter = 0; counter < array2.length; counter++)
            System.out.printf("%-3d%8d%n", counter, array2[counter]);

        System.out.println("\n\n\n============Calculando valores para armazenar em array=================\n\n\n");

        final int ARRAY_LENGTH = 10;
        int[] array3 = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < array3.length; counter++)
            array3[counter] = 2 + 2 * counter;

        System.out.printf("%s%8s%n", "Índice", "Valor");

        for (int counter = 0 ; counter < array3.length; counter++)
            System.out.printf("%-3d%8d%n", counter, array3[counter]);
    }
}
