import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        PersonalAcc acc1 = new PersonalAcc("Koby");
        int choice = 0;
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello " + acc1.getName());
        while (choice != 4) {
            System.out.println("""
                    Choose an option you would like to do
                    1. Check Balance
                    2. Deposit
                    3. Withdraw
                    4. Quit""");
            choice = sc.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Those are not options. Try again.");
            }

            switch (choice) {
                case 1:
                    System.out.println("You have $" + acc1.getBalance());
                    break;
                case 2:
                    System.out.println("How much would you like to deposit?");
                    amount = sc.nextInt();
                    acc1.depositBalance(amount);
                    System.out.println("You now have $" + acc1.getBalance());
                    break;
                case 3:
                    System.out.println("How much would you like to withdraw?");
                    amount = sc.nextInt();
                    acc1.withdrawBalance(amount);
                    System.out.println("You now have $" + acc1.getBalance());
                    break;

            }
        }
        System.out.println("Goodbye!");
    }
}
