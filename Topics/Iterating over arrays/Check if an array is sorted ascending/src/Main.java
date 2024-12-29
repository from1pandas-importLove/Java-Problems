import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];
        boolean isSorted = true;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                isSorted = false;
            }
        }
        System.out.printf(String.valueOf(isSorted));
    }
}