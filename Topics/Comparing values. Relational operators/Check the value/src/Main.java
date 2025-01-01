import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        boolean result = false;
        int input = scanner.nextInt();
        if (input < 10) {
            result = true;
        }
        System.out.println(result);
    }
}