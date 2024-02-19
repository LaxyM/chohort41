package lesson_24.HomeWork.Task0;

class BankAccount implements PaymentSystem {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void transferMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " transferred from Bank Account.");
        } else {
            System.out.println("Sorry you don't have money in your Bank account.");
        }
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Bank Account.");
        } else {
            System.out.println("Sorry you don't have money in your Bank account.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Bank Account Balance: " + balance);
    }
}