import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b == 20) || (b + c == 20) || (a + c == 20)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}