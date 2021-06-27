package Loan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NationalBank firstBank = new NationalBank();
        SecondTierBank secondBank = new SecondTierBank();

        System.out.println("Choose your bank:  (1) - NationalBank  (2) - SecondTierBank");
        int amountOfDeposit, termOfDeposit;
        String typeOfCustomer;
        switch (scan.nextInt()){
            case 1:
                System.out.println("Amount of deposit:");amountOfDeposit=scan.nextInt();
                System.out.println("Term of deposit");termOfDeposit=scan.nextInt();
                System.out.println("Choose: 'individual' or 'legalEntity'");typeOfCustomer=scan.next();
                System.out.println(firstBank.calculateDeposit(amountOfDeposit, termOfDeposit, typeOfCustomer));
                break;
            case 2:
                System.out.println("Enter salary");amountOfDeposit=scan.nextInt();
                System.out.println("Enter duration");termOfDeposit=scan.nextInt();
                System.out.println("Enter type 'individual' or 'legalEntity'");typeOfCustomer=scan.next();
                System.out.println(secondBank.calculateDeposit(amountOfDeposit, termOfDeposit, typeOfCustomer));
                break;
            default: System.out.println("error!");
        }
    }
}
