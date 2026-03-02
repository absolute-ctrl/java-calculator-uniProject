import java.util.Scanner;

public class SimpleInterest {
    private Scanner scanner;
    public void startLogic () {
        System.out.println("SIMPLE INTEREST CALCULATOR\n");
        float C = returnValue("INITIAL CAPITAL");
        float i = returnValue("INTEREST RATE");
        float t = returnValue("NUMBER OF MONTHS");
        float V = C * (1 + (i / 100)) * t;
        System.out.println("THE FINAL CAPITAL IS: " + V);
    }

    private float returnValue (String str) {
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
