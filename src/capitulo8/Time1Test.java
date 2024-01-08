package capitulo8;
//Objeto Time1 utilizando um aplicativo.

public class Time1Test
{
    public static void main(String[] args)
    {
        Time1 time = new Time1();
        displayTime("Depois do objeto time for criado",time);
        System.out.println();

        time.setTime(13,27,6);
        displayTime("Depois de chamar setTime", time);
        System.out.println();

        try
        {
            time.setTime(99,99,99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Exceção: %s%n%n", e.getMessage());
        }

        displayTime("Depois de chamar setTime com valores invalidos", time);
    }

    private static void displayTime(String header, Time1 t)
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header,t.toUniversalString(),t.toString());
    }
}
