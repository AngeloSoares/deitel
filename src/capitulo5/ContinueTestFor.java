package capitulo5;

public class ContinueTestFor
{
    public static void main(String[] args)
    {
        for(int count = 1; count <= 10; count++)
        {
            if(count == 5)
                continue;

            System.out.printf("%d ",count);
        }

        System.out.printf("%nUsei CONTINUE para pular o número 5!%n");
    }
}
