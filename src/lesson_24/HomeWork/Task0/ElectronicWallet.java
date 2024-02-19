package lesson_24.HomeWork.Task0;

class ElectronicWallet implements PaymentSystem {
    private double balance;

    public ElectronicWallet(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " transferred from Electronic Wallet.");
        } else {
            System.out.println("Sorry you don't have money in your Electronic Wallet account.");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Electronic Wallet.");
        } else {
            System.out.println("Sorry you don't have money in your Electronic Wallet account.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Electronic Wallet Balance: " + balance);
    }
}