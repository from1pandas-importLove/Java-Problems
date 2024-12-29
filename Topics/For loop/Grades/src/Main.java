import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberOfInputs = scanner.nextInt();
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;

        for (int i = 0; i <= numberOfInputs; i++) {
            String grade = scanner.nextLine();
            if (grade.equals("A")) {
                aCounter++;
            } else if (grade.equals("B")) {
                bCounter++;
            } else if (grade.equals("C")) {
                cCounter++;
            }  else if (grade.equals("D")) {
                dCounter++;
            }
        }
        System.out.printf(dCounter + " " + cCounter + " " + bCounter + " " + aCounter);
    }
}