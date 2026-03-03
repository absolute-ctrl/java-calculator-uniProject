import java.util.Scanner;

public class Imc {

    private Scanner scanner;

    public Imc(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startLogic() {
        float height = getValue("HEIGHT (cm)") / 100;
        float weight = getValue("WEIGHT");
        float imc = weight / (height * height);
        System.out.println("YOUR IMC IS: " + imc);
    }

    private float getValue(String str) {
        System.out.print("ENTER YOUR " + str + ": ");
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