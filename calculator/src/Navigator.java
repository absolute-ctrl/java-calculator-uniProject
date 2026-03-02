import java.util.Scanner;

public class Navigator {

    private Scanner scanner;
    public void access () {
        System.out.println("'1' FOR AVERAGE;\n'2' FOR IMC;\n'3' FOR RECTANGLE AREA.");
        System.out.print("WHAT OPERATION WOULD YOU LIKE TO DO?\nENTRY: ");

        // Hub para acessar os outros arquivos .java
        while (true) {
            short path = scanner.nextShort();

            switch (path) {
                case 1 -> {
                    Average AverageObj = new Average();
                    AverageObj.startLogic();
                }
                case 2 -> {
                    Imc ImcObj = new Imc();
                    ImcObj.startLogic();
                }
                case 3 -> {
                    Rectangle RectangleObj = new Rectangle();
                    RectangleObj.startLogic();
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                default -> {
                    System.out.print("\nPLEASE, INSERT A VALID INPUT!\nENTRY: ");
                    continue;
                }
            }
            scanner.close();
            break;
        }
    }
}