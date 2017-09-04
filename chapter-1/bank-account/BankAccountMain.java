
public class BankAccountMain {
    public static void main(String[] args) {
        // Question: Is it better to invest $100 over 10 years at 5%,
        // or to invest $100 over 20 years at 2.5% interest?

        BankAccount investmentOne = new BankAccount("Investment One", 100.00);
        BankAccount investmentTwo = new BankAccount("Investment Two", 100.00);
        int years;

        for (years = 0; years < 10; years += 1) {
            investmentOne.deposit(investmentOne.getBalance() * 0.05);
        }

        for (years = 0; years < 20; years += 1) {
            investmentTwo.deposit(investmentTwo.getBalance() * 0.025);
        }

        System.out.println(investmentOne.toString());
        System.out.println(investmentTwo.toString());
    }
}