public class PersonalAcc {
    private static int balance;
    private static String name;

    PersonalAcc(String name){
        this.name = name;
    }

    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        PersonalAcc.balance = balance;
    }

    public static String getName() {
        return name;
    }

    public static void depositBalance(int amount) {
        balance += amount;
    }

    public static void withdrawBalance(int amount) {
        balance -= amount;
    }
}
