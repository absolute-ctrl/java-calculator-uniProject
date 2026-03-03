import java.util.Scanner;

public class ExchangeRate {

    private Scanner scanner;

    public ExchangeRate(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startLogic() {
        System.out.println("EXCHANGE RATE CALCULATOR\n");
        System.out.println("[BRL] TO [USD] SELL VALUE AS OF (03.01.2026): 5.1642");
        double amount = registerAmount();
        double exchangeRate = calculateExchangeRate(amount);
        System.out.println("THE EXCHANGE RATE IS: " + exchangeRate);
    }

    private double registerAmount() {
        System.out.println("ENTER THE AMOUNT TO BE CONVERTED:");
        while (true) {
            double amount = scanner.nextDouble();
            if (amount > 0) {
                return amount;
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER A POSITIVE NUMBER: ");
                continue;
            }
        }
    }

    private double calculateExchangeRate(double amount) {
        return amount / 5.1642;
    }
}