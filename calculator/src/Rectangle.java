import java.util.Scanner;

/* Mensagem padrão de erro de input:
System.out.println("PLEASE, INSERT A VALID INPUT!\nENTRY: ");
 */
public class Rectangle {

    public Scanner d_scanf = new Scanner(System.in);

    // This is the entry point from the main function
    public void entryPoint() {
        startLogic(true);
    }

    private void startLogic(boolean x) {
        // Here the _Logic_ checks if _Entry_point is activated, mostly for testing
        if (!x) {
            System.exit(0);
        }

        double valueHeight = getDouble("HEIGHT");
        double valueWidth = getDouble("WIDTH");
        drawDouble(valueHeight, valueWidth, valueHeight * valueWidth);

    }

    // A dynamic function that can get both the values for height and width
    private double getDouble(String placeholder) {
        System.out.print("ENTER THE " + placeholder + " VALUE: ");
        double var;
        while (true) {
            var = d_scanf.nextDouble();
            if (!(var > 0)) {
                System.out.print("\nPLEASE, INSERT A VALID INPUT!\nENTRY: ");
                continue;
            }
            break;
        }
        return var;
    }

    // The function that will draw the rectangle
    private void drawDouble(double drawHeight, double drawWidth, double showArea) {
        System.out.print("\nA ÁREA TOTAL DO RETÂNGULO É: " + showArea + "\n\n\n");
        for (int i = 0; i < drawHeight ; i++) {
            for (int j = 0; j < drawWidth ; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n\n\n");
    }
}
