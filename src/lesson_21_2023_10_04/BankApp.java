package lesson_21_2023_10_04;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(757847828484844L, "USD", "Ivan Petrov", "SwedBank");
        System.out.println(bankAccount.toString());
        System.out.println("stringBuilder --> " + bankAccount.info());

        BankAccount bankAccount1 = new BankAccount(12344424234134L, "USD", "Vlad Yama", "SwedBank");
        System.out.println(bankAccount1.toString());
        System.out.println("stringBuilder --> " + bankAccount1.info());


        BankAccount bankAccount2 = new BankAccount(345565467756767L, "USD", "Hii Owner", "SwedBank");
        System.out.println(bankAccount2.toString());
        System.out.println("stringBuilder --> " + bankAccount2.info());


    }
}
