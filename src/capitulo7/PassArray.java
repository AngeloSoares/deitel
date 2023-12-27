package capitulo7;
//Passando arrays e elementos do arrays individuais aos métodos.
public class PassArray
{
    public static void main(String[] args)
    {
        int[] array = { 1, 2, 3, 4, 5};

        System.out.printf("Efeitos de passar referência para todo array: %n" +
                "Os valores originais do array são: %n");

        for(int value : array)
            System.out.printf("  %d", value);

        modifyArray(array);
        System.out.printf("%n%nOs valores do array modificados são: %n");

        for(int value : array)
            System.out.printf("  %d", value);

        System.out.printf("%n%nEfeitos de passar um elemento do array: %n" +
                "O valor original do array[3] é: %d%n", array[3]);

        modifyElement(array[3]);

        System.out.printf("%nArray[3] modificado é: %d%n%n", array[3]);

        for(int value : array)
            System.out.printf("  %d", value);

    }

    public static void modifyArray(int[] array2)
    {
        for (int counter = 0; counter < array2.length; counter++)
            array2[counter] *= 2;
    }

    public static void modifyElement(int element)
    {
        element *= 2;
        System.out.printf("Valor do elemento modificado em modifyElement: %d%n", element);
    }
}
