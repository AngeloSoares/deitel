package capitulo7;
//Métodos da classe Arrays e System.arraycopy.
import java.util.Arrays;

public class ArrayManipulations
{
    public static void main(String[] args)
    {
        double[] doubleArray = {8.4,9.3,0.2,7.9,3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");



        for (double value: doubleArray)
            System.out.printf("%.1f ", value);

        int[] filledArray = new int[10];
        Arrays.fill(filledArray, 7);
        displayArray(filledArray, "filledArray");

        int[] intArray = {1,2,3,4,5,6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray,0,intArrayCopy,0,intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        boolean b =  Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%nintArray %s intArrayCopy%n", b ? "==": "!=");

        b =  Arrays.equals(intArray, filledArray);
        System.out.printf("%nintArray %s filledArray%n", b ? "==": "!=");

        int location = Arrays.binarySearch(intArray, 5);

        if(location >= 0)
            System.out.printf("Achei o 5 no elemento %d do intArray%n", location);
        else
            System.out.println("Não Achei valor 5 em intArray");


        location = Arrays.binarySearch(intArray, 8763);

        if(location >= 0)
            System.out.printf("Achei o 8763 no elemento %d do intArray%n", location);
        else
            System.out.println("Não Achei valor 8763 em intArray");

    }

    public static void displayArray(int[] array, String description)
    {
        System.out.printf("%n%s: ", description);

        for(int value : array)
            System.out.printf("%d ", value);
    }
}
