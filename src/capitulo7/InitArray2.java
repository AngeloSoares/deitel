package capitulo7;
//Inicializando arrays bidirecionais.
public class InitArray2
{
    public static void main(String[] args)
    {
        int[][] array1 = {{1,2,3}, {4,5,6}};
        int[][] array2 = {{1,2}, {3}, {4,5,6}};

        System.out.println("Valores no array1 por linha são: ");
        outputArray(array1);
        System.out.printf("%n%nValores no array2 por linha são: %n");
        outputArray(array2);
    }

    public static void outputArray(int[][] array)
    {
        for(int row = 0; row < array.length; row++)
        {
            for(int colum = 0; colum < array[row].length; colum++)
                System.out.printf("%d ",array[row][colum]);

            System.out.println();
        }
    }
}
