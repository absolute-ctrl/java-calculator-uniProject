import java.util.Scanner;

import java.util.Scanner;

public class Navigator {

    private Scanner scanner;

    public Navigator(Scanner scanner) {
        this.scanner = scanner;
    }

    public void access() {
        System.out.println("'1' FOR AVERAGE;\n'2' FOR IMC;\n'3' FOR RECTANGLE AREA;\n'4' FOR SIMPLE INTEREST;\n'5' FOR EXCHANGE RATE.");
        System.out.print("WHAT OPERATION WOULD YOU LIKE TO DO?\nENTRY: ");

        while (true) {
            short path = scanner.nextShort();

            switch (path) {
                case 1 -> {
                    Average average = new Average(scanner);
                    average.startLogic();
                }
                case 2 -> {
                    Imc imc = new Imc(scanner);
                    imc.startLogic();
                }
                case 3 -> {
                    Rectangle rectangle = new Rectangle(scanner);
                    rectangle.startLogic();
                }
                case 4 -> {
                    SimpleInterest simpleInterest = new SimpleInterest(scanner);
                    simpleInterest.startLogic();
                }
                case 5 -> {
                    ExchangeRate exchangeRate = new ExchangeRate(scanner);
                    exchangeRate.startLogic();
                }
                default -> {
                    System.out.print("\nPLEASE, INSERT A VALID INPUT!\nENTRY: ");
                    continue;
                }
            }
            break;
        }
    }
}