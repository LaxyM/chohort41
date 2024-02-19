package lesson_24.HomeWork.Task0;

class ElectronicWallet implements PaymentSystem {
    private double balance;

    public ElectronicWallet(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        balance -= amount;
        System.out.println(amount + " transferred from Electronic Wallet.");
    }

    @Override
    public void withdrawMoney(double amount) {
        balance -= amount;
        System.out.println(amount + " withdrawn from Electronic Wallet.");
    }

    @Override
    public void checkBalance() {
        System.out.println("Electronic Wallet Balance: " + balance);
    }
}