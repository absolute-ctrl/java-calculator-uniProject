import java.util.Scanner;

public class Rectangle {

    private Scanner scanner;

    public Rectangle(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startLogic() {
        double valueHeight = getDouble("HEIGHT");
        double valueWidth = getDouble("WIDTH");
        drawDouble(valueHeight, valueWidth, valueHeight * valueWidth);
    }

    private double getDouble(String placeholder) {
        System.out.print("ENTER THE " + placeholder + " VALUE: ");
        double var;
        while (true) {
            var = scanner.nextDouble();
            if (!(var > 0)) {
                System.out.print("\nPLEASE, INSERT A VALID INPUT!\nENTRY: ");
                continue;
            }
            break;
        }
        return var;
    }

    private void drawDouble(double drawHeight, double drawWidth, double showArea) {
        System.out.print("\nTOTAL RECTANGLE AREA: " + showArea + "\n\n\n");
        for (int i = 0; i < drawHeight; i++) {
            for (int j = 0; j < drawWidth; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n\n");
    }
}