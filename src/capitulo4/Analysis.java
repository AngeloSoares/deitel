package capitulo4;
import java.util.Scanner;
public class Analysis
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10)
        {
            System.out.print("Insira o resultado (1 - Aprovado, 2 - Reprovado): ");
            int result = input.nextInt();

            if(result == 1)
                passes++;
            else
                failures++;

            studentCounter++;
        }

        System.out.printf("Aprovados: %d%nReprovados: %d%n", passes, failures);

        if(passes > 8)
            System.out.printf("Bônus para o Instrutor!!!");
    }
}
