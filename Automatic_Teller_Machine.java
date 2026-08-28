import java.util.Scanner;

public class Automatic_Teller_Machine {

    public static String greeting(String userName) {

        return "Welcome " + " " + userName;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int MINIMUM_BALANCE = 500;
        int moneyInAccount = 10000;
        int atmPin = 5555;

        System.out.println("Welcome to Indian Bank");
        System.out.print("Enter Your Name:");
        String userName = scan.nextLine();
        String message = greeting(userName);
        System.out.println(message);
        System.out.print("Enter Your Pin:");
        int pin = scan.nextInt();

        if (pin == atmPin) {

            System.out.println("Enter Your choice For 1 Deposite.");
            System.out.println("Enter Your choice For 2 Withdraw.");
            System.out.println("Enter Your choice For 3 Balance Check.");
            System.out.print("Enter The Choice:");

        } else {
            System.out.println("Invalid Pin");

        }

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You can able only 50000 only at a time");
                System.out.print("Enter the amount: ");
                int userDeposite = scan.nextInt();
                int AMOUNT_DEPOSITE_LIMIT = 50000;

                if (AMOUNT_DEPOSITE_LIMIT >= userDeposite) {

                    moneyInAccount = moneyInAccount + userDeposite;

                    System.out.println("Balance" + " " + moneyInAccount);

                    break;

                }
            case 2:
                System.out.print("Enter Your Amount:");

                int withdrawalAmount = scan.nextInt();

                if (withdrawalAmount >= moneyInAccount) {

                    System.out.println("Invalid");

                    System.out.println("Your Balance is:" + moneyInAccount);
                } else if (withdrawalAmount <= moneyInAccount - MINIMUM_BALANCE) {

                    moneyInAccount = moneyInAccount - withdrawalAmount;
                    System.out.println("Your Balance is:" + moneyInAccount);

                } else {
                    System.out.println("You need to Maintain minimum balance of " + MINIMUM_BALANCE);
                }
                break;

            case 3:

                System.out.println("Your Balance Is" + " " + moneyInAccount);

            default:
                System.out.println("ThankYou" + " " + userName + " " + "Have a Nice Day!!");
                break;
        }
        scan.close();
    }

}
