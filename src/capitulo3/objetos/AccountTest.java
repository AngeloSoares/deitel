package capitulo3.objetos;
import capitulo3.classes.Account;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.printf("Nome  Inicial: %s%n%n", myAccount.getName());

        System.out.println("Insira o nome da Conta: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Nome da conta é: %n%s%n", myAccount.getName());
    }
}
