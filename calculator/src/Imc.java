import java.util.Scanner;

public class Imc {

    public Scanner d_scanf = new Scanner(System.in);
    public void entryPoint() {
        boolean bool = true;
        startLogic(bool);
    }

    private void startLogic(boolean x) {
        if (!(x)) {System.exit(0);}
        float height = getValue("HEIGHT(cm)") / 100;
        float weight = getValue("WEIGHT");
        float imc = weight / (height * height);
        System.out.println("YOUR IMC IS: " + imc);
    }

    private float getValue(String str) {
        System.out.print("ENTER YOUR " + str + ": ");
        while (true) {
            float input = d_scanf.nextFloat();
            if (input > 0) {
                return input;
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER A POSITIVE NUMBER: ");
                continue;
            }
        }
    }
}
