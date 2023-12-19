package capitulo5;

public class BreakTest
{
    public static void main(String[] args)
    {
        int count;

        for (count = 1; count <= 10; count++)
        {

            if(count == 5)
                break;

            System.out.printf("Cont: %d%n", count);
        }
        System.out.printf("Quebra de loop na contagem = %d%n", count);
    }
}
