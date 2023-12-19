package capitulo5;

public class Interest //Calculo de juros compostos com For
{
    public static void main(String[] args)
    {
        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%25s %n","Ano", "Valor em depósito");

        for (int year = 1; year <= 15; ++year)
        {
            amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%3d%,20.2f%n", year, amount);
        }
    }
}
