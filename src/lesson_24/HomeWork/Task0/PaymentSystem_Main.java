package lesson_24.HomeWork.Task0;

public class PaymentSystem_Main {
    public static void main(String[] args) {
        PaymentSystem bankAccount = new BankAccount(500);
        bankAccount.checkBalance();
        bankAccount.transferMoney(600);
        bankAccount.checkBalance();

        System.out.println("\n ====================== \n");

        PaymentSystem electronicWallet = new ElectronicWallet(800);
        electronicWallet.checkBalance();
        electronicWallet.withdrawMoney(1000);
        electronicWallet.checkBalance();

    }
}
