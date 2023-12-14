package capitulo4;
import java.util.Scanner;

public class ClassAverage2 // Repetição controlada por Sentinela (Flag, Sinal, valor fictício)
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;

        System.out.print("Digite uma nota ou -1 para encerrar: ");
        int grade = input.nextInt();

        while (grade != -1) // Sentinela - Flag - Sinal - Valor Fictício
        {
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Digite uma nota ou -1 para encerrar: ");
            grade = input.nextInt();
        }

        if (gradeCounter != 0)
        {
            double average = (double) total / gradeCounter;

            System.out.printf("Total de %d notas inseridas somando %d no Total%n", gradeCounter, total);
            System.out.printf("Média da classe é %.2f%n", average);
        }
        else
            System.out.println("Nenhuma nota foi inserida!");

    }
}
