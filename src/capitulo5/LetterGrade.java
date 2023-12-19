package capitulo5;

import java.util.Scanner;

public class LetterGrade
{
    public static void main(String[] args)
    {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n    %s%n",
                "Insira uma nota no intervalo entre 0-100",
                "Insira o sinal de fim de entra:",
                "<Ctrl> D e Enter");

        while (input.hasNext())
        {
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;




            switch (grade / 10)
            {
                case 9:
                case 10:
                    ++aCount;
                    break;

                case 8:
                    ++bCount;
                    break;

                case 7:
                    ++cCount;
                    break;

                case 6:
                    ++dCount;
                    break;

                default:
                    ++fCount;
                    break;
            }
        }


        System.out.printf("%nRelatório de Notas:%n");


        if (gradeCounter != 0)
        {

            double average = (double) total / gradeCounter;


            System.out.printf("Total de %d nota inseridas é %d%n", gradeCounter, total);

            System.out.printf("A Média da Classe é: %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Número de estudantes que receberam cada nota",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        }
        else
            System.out.println("Não houve entrada de notas!");
    }
}
