import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        int remainder = input % 2;
        // The second operation goes here
        int tripleRemainder = remainder * 3;
        System.out.println(remainder);
        System.out.println(tripleRemainder);

        scanner.close();
    }
}