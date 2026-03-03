import java.util.Scanner;

public class SimpleInterest {

    private Scanner scanner;

    public SimpleInterest(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startLogic() {
        System.out.println("SIMPLE INTEREST CALCULATOR\n");
        float capital = returnValue("INITIAL CAPITAL");
        float rate = returnValue("INTEREST RATE");
        float months = returnValue("NUMBER OF MONTHS");
        float finalValue = capital * (1 + (rate / 100) * months);
        System.out.println("THE FINAL CAPITAL IS: " + finalValue);
    }

    private float returnValue(String str) {
        System.out.print("INSERT THE " + str + " VALUE: ");
        while (true) {
            float input = scanner.nextFloat();
            if (input > 0) {
                return input;
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER A POSITIVE NUMBER: ");
                continue;
            }
        }
    }
}