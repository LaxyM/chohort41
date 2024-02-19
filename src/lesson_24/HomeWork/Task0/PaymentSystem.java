package lesson_24.HomeWork.Task0;

/*
Создайте интерфейс PaymentSystem с методами transferMoney, withdrawMoney и checkBalance.
Реализуйте классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */

public interface PaymentSystem {
    void transferMoney(double amount);
    void withdrawMoney(double amount);
    void checkBalance();
}