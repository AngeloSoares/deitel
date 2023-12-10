package capitulo3.objetos;
import capitulo3.classes.Account;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account("Angelo", 50.00);
        Account account2 = new Account("Soares", -7.35);

        System.out.printf("%s saldo: $%.2f %n", account1.getName(),account1.getBalance());
        System.out.printf("%s saldo: $%.2f %n%n", account2.getName(),account2.getBalance());

        System.out.print("Entre com o deposito na conta 1: ");
        double depositAmout = input.nextDouble();
        System.out.printf("%nadicionado %.2f para conta 1%n%n", depositAmout);
        account1.deposit(depositAmout);

        System.out.printf("%s saldo: $%.2f %n", account1.getName(),account1.getBalance());
        System.out.printf("%s saldo: $%.2f %n%n", account2.getName(),account2.getBalance());

        System.out.print("Entre com o deposito na conta 2: ");
        depositAmout = input.nextDouble();
        System.out.printf("%nadicionado %.2f para conta 2%n%n", depositAmout);
        account2.deposit(depositAmout);

        System.out.printf("%s saldo: $%.2f %n", account1.getName(),account1.getBalance());
        System.out.printf("%s saldo: $%.2f %n%n", account2.getName(),account2.getBalance());

    }
}
