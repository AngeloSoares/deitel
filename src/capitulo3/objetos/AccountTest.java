package capitulo3.objetos;
import capitulo3.classes.Account;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account("Angelo", 50.00);

        displayAccount(account1);

        System.out.print("Entre com o deposito na conta 1: ");
        double depositAmout = input.nextDouble();
        System.out.printf("%nadicionado %.2f para conta 1%n%n", depositAmout);
        account1.deposit(depositAmout);

        displayAccount(account1);

        System.out.print("Entre com o desconto na conta 1: ");
        depositAmout = input.nextDouble();
        System.out.printf("%nadicionado %.2f para conta 1%n%n", depositAmout);
        account1.withdraw(depositAmout);

        displayAccount(account1);
    }


    public static void displayAccount(Account accountToDisplay)
    {
        System.out.printf("%s saldo: $%.2f %n%n", accountToDisplay.getName(),accountToDisplay.getBalance());
    }
}
