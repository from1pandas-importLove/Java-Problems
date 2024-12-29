import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int sum = 0;
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int valueToCompare = scanner.nextInt();

        for (int number : numbers) {
            if (number > valueToCompare) {
                sum += number;
            }

        }
        System.out.println(sum);
    }
}