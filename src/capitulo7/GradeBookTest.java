package capitulo7;
//GradeBookTest cria um objeto da classe Gradebook utilizando um array de notas.

public class GradeBookTest
{

    public static void main(String[] args)
    {

        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook myGradeBook = new GradeBook("Introdução a programação JAVA", gradesArray);

        System.out.printf("Bem-vindo ao livro de notas para %n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();

    }
}

