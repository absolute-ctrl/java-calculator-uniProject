import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Navigator navigator = new Navigator(scanner);
        navigator.access();
        scanner.close();
    }
}