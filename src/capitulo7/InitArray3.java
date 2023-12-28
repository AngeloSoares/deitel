package capitulo7;

public class InitArray3
{
    public static void main(String[] args)
    {
        if(args.length != 3)
            System.out.println("Erro, por favor entre com argumento de linha de comando");
        else
        {
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            for (int counter = 0; counter < array.length; counter++)
                array[counter] = initialValue + increment * counter;

            System.out.printf("%s%8s%n", "Índice", "Valor");

            for(int couter = 0; couter < array.length; couter++)
                System.out.printf("%5d%8d%n", couter, array[couter]);
        }
    }
}
