package lesson_24.HomeWork.Task0;

class BankAccount implements PaymentSystem {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        balance -= amount;
        System.out.println(amount + " transferred from Bank Account.");
    }

    @Override
    public void withdrawMoney(double amount) {
        balance -= amount;
        System.out.println(amount + " withdrawn from Bank Account.");
    }

    @Override
    public void checkBalance() {
        System.out.println("Bank Account Balance: " + balance);
    }
}