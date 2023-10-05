package lesson_21_2023_10_04;

import java.util.Arrays;

public class BankAccount {
    private final int id;

    private long accountNumber;
    private double amount;

    private String currency;
    private String owner;
    private String bank;
    private int bankBranch;
    static final int BALANCEACCOUNT = 2600;

    private static int counter;

    public BankAccount(long accountNumber, String currency, String owner, String bank) {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.owner = owner;
        this.bank = bank;
        this.bankBranch = 1;
        this.id = counter++;
        System.out.println(generateAccountNumber());

    }

    private String generateAccountNumber() {
        StringBuilder sb = new StringBuilder(BALANCEACCOUNT);
        // 2600
        // 00000 - id
        int [] ints = new int[5];
        int temp = 2345;
        for (int i = ints.length - 1; i>=0; i --) {
            int digit = temp % 10;
            ints[i] = digit;
            temp /=10;

        }
        for (int value: ints) {
            sb.append(value);

        }

        // преобразование числа в строку заданной длины
        String strNumberToString = String.format("%05d", id);
        System.out.println(strNumberToString);
        return "";
    }

    public String toString() {
        return "{Account id: "
                + id
                + "; amount: "
                + amount
                + " "
                + currency
                + "; owner: "
                + owner
                + "; bank: "
                + bank
                + "}";
    }

    public String info() {
        StringBuilder stringBuilder = new StringBuilder();
//        StringBuffer stringBuffer = new StringBuffer();

        stringBuilder.append("{Account id: ")
                            .append(id)
                            .append("; amount: ")
                            .append(amount)
                            .append(" ")
                            .append(currency)
                            .append("; owner: ")
                            .append(owner)
                            .append("; bank: ")
                            .append(bank)
                            .append("}");

        return stringBuilder.toString();
    }

}
