package capitulo7;
//Classe GradeBook2 utilizando array bidirecional para armazenar notas.

public class GradeBook2
{
    private String courseName;
    private int[][] grades;

    public GradeBook2(String courseName, int[][] grades)
    {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void processGrades()
    {
        outputGrades();

        System.out.printf("%n%s %d%n%s %d%n%n", "A menor nota é: ", getMinumum(),
                "A maior nota é: ", getMaximum());

        outputBarChart();
    }

    public int getMinumum()
    {
        int lowGrade = grades[0][0];

        for(int row = 0; row < grades.length; row ++)
        {
            for(int colum = 0; colum < grades[row].length; colum++)
            {
                if(grades[row][colum] < lowGrade)
                    lowGrade = grades[row][colum];
            }

        }

        return lowGrade;
    }

    public int getMaximum()
    {
        int highGrade = grades[0][0];

        for(int row = 0; row < grades.length; row ++)
        {
            for(int colum = 0; colum < grades[row].length; colum++)
            {
                if(grades[row][colum] > highGrade)
                    highGrade = grades[row][colum];
            }

        }

        return highGrade;
    }

    public double getAverage(int[] setOfGrades)
    {
        int total = 0;

        for(int grade: setOfGrades)
            total += grade;

        return (double) total / setOfGrades.length;
    }

    public void outputBarChart()
    {
        System.out.println("Distribuição de notas gerais:");

        int[] frequency =  new int[11];

        for (int[] studentGrades : grades)
        {
            for(int grade : studentGrades)
                ++frequency[grade / 10];
        }

        for(int count = 0; count < frequency.length; count++)
        {
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void outputGrades()
    {
        System.out.println("As notas são: %n%n");
        System.out.print("          ");

        for(int test = 0; test < grades[0].length; test++)
            System.out.printf("Teste %d", test + 1);

        System.out.println("Média");

        for(int student = 0; student < grades.length; student++)
        {
            System.out.printf("Estudante %2d", student + 1);

            for(int test : grades[student])
                System.out.printf("%8d", test);

            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);

        }
    }
}
