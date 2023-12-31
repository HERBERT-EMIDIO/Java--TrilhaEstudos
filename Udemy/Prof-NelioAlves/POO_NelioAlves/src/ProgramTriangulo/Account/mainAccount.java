package ProgramTriangulo.Account;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class mainAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Account account = new Account();
        Account account;


        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there  an initial deposit (y/n): ");
        char response = sc.next().charAt(0);

        if (response == 'y' || response == 'Y') {
            System.out.print("Is there  an initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, response);
        } else {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Accoount data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Update account data:");
        System.out.println(account);

        sc.close();
    }
}
