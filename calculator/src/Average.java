import java.util.Scanner;

public class Average {
    private Scanner scanner;
    public void startLogic () {
        int numGrades = nGrades();

        float[] individualGrade = new float[numGrades];
        float bruteAverage = 0;
        for (int i = 0; i < numGrades; i++) {
            System.out.println("ENTER THE GRADE " + (i + 1) + ": ");
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
            char grade_y_n = scanner.next().charAt(0);
            if (grade_y_n == 'Y') {
                float final_average = average_grades(numGrades, individualGrade);
                System.out.println("THE WEIGHTED AVERAGE IS: " + final_average);
                break;
            } else if (grade_y_n == 'N') {
                System.out.println("THE AVERAGE IS: " + bruteAverage / numGrades);
                System.exit(0);
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER 'Y' OR 'N': ");
                continue;
            }
        }
    }

    private int nGrades () {
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

    private float average_grades (int num_grades, float[] individual_grade) {
        float true_average = 0;
        float total_weight = 0;
        for (int j = 0; j < num_grades; j++) {
            while (true) {
                System.out.print("ENTER THE WEIGHT OF THE GRADE " + (j + 1) + ": ");
                float input = scanner.nextFloat();
                if (input > 0) {
                    true_average += individual_grade[j] * input;
                    total_weight += input;
                    break;
                } else {
                    System.out.println("INVALID INPUT. PLEASE ENTER A POSITIVE NUMBER: ");
                    continue;
                }
            }
        }
        return true_average / total_weight;
    }
}