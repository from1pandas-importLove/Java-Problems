import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        boolean result = true;
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i < numbers.length; i++) {
            if (((numbers[i - 1] == n && numbers[i] == m)) ||
                    ((numbers[i - 1] == m && numbers[i] == n)))  {
                result = false;
            }
        }
        System.out.println(result);

    }
}