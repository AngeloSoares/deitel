package capitulo6;

//Declarações de métodos sobrecarregados ou sobrecarga de métodos.
//São simplesmente métodos que contem o mesmo nome, mas com argumentos diferentes, sejam ordem, tipo ou em números.
public class MethodOverLoad
{
    public static void main(String[] args)
    {
        System.out.printf("Quadrado do inteiro é %d%n", square(7));
        System.out.printf("Quadrado do double é %.2f%n", square(7.5));
    }


    public static int square(int intValue)
    {
        System.out.printf("%nChamada square com argumento int: %d%n", intValue);

        return intValue * intValue;
    }

    public static double square(double doubleValue)
    {
        System.out.printf("%nChamada square com argumento double: %.2f%n", doubleValue);

        return doubleValue * doubleValue;
    }
}
