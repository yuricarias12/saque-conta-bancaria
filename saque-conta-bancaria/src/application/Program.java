package application;


import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = ler.nextInt();
            ler.nextLine();
            System.out.print("Holder: ");
            String holder = ler.nextLine();
            System.out.print("Initial balance: ");
            Double balance = ler.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = ler.nextDouble();

            Account account = new Account(number, holder,balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double amount = ler.nextDouble();

            try {

                account.withdraw(amount);
                System.out.printf("New balance: %.2f%n", account.getBalance());


            }
            catch(BusinessException e) {
                System.out.println(e.getMessage());
        }


    }
}
