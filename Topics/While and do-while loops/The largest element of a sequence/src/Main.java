import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = 0;
        int endOfSequence = 1;
        while (endOfSequence != 0) {
            int number = scanner.nextInt();
            if (number == 0) {
                endOfSequence = 0;
            } else if (number > max) {
                max = number;
            }

        }
        System.out.println(max);
    }

}