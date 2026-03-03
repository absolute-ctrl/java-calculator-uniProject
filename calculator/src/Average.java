import java.util.Scanner;

public class Average {

    private Scanner scanner;

    public Average(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startLogic() {
        int numGrades = nGrades();

        float[] individualGrade = new float[numGrades];
        float bruteAverage = 0;
        for (int i = 0; i < numGrades; i++) {
            System.out.print("ENTER THE GRADE " + (i + 1) + ": ");
            while (true) {
                float input = scanner.nextFloat();
                if (input >= 0) {
                    individualGrade[i] = input;
                    bruteAverage += input;
                    break;
                } else {
                    System.out.println("INVALID INPUT. PLEASE ENTER A POSITIVE NUMBER: ");
                    continue;
                }
            }
        }

        System.out.print("DOES EACH GRADE HAVE AN INDIVIDUAL WEIGHT? (Y/N): ");
        while (true) {
            char gradeYN = scanner.next().charAt(0);
            if (gradeYN == 'Y') {
                float finalAverage = averageGrades(numGrades, individualGrade);
                System.out.println("THE WEIGHTED AVERAGE IS: " + finalAverage);
                break;
            } else if (gradeYN == 'N') {
                System.out.println("THE AVERAGE IS: " + bruteAverage / numGrades);
                break;
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER 'Y' OR 'N': ");
                continue;
            }
        }
    }

    private int nGrades() {
        System.out.print("ENTER THE NUMBER OF GRADES: ");
        while (true) {
            int input = (int) scanner.nextFloat();
            if (input > 0) {
                return input;
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER A POSITIVE NUMBER: ");
                continue;
            }
        }
    }

    private float averageGrades(int numGrades, float[] individualGrade) {
        float trueAverage = 0;
        float totalWeight = 0;
        for (int j = 0; j < numGrades; j++) {
            while (true) {
                System.out.print("ENTER THE WEIGHT OF THE GRADE " + (j + 1) + ": ");
                float input = scanner.nextFloat();
                if (input > 0) {
                    trueAverage += individualGrade[j] * input;
                    totalWeight += input;
                    break;
                } else {
                    System.out.println("INVALID INPUT. PLEASE ENTER A POSITIVE NUMBER: ");
                    continue;
                }
            }
        }
        return trueAverage / totalWeight;
    }
}