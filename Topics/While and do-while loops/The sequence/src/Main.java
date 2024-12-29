import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberOfInputs = scanner.nextInt();
        int max = 0;
        while (numberOfInputs != 0) {
            int number = scanner.nextInt();
            if ((number % 4 == 0) && (number > max)) {
                max = number;
            }
            numberOfInputs--;
        }
        System.out.println(max);
    }
}