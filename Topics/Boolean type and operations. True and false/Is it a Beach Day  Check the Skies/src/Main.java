import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSunny = scanner.nextBoolean();
        boolean isRainy = scanner.nextBoolean();
        boolean isCold = scanner.nextBoolean();
        boolean weatherIsGood = false;
        // Calculate and print decision
        boolean result = ((isSunny) && (!isRainy) && (!isCold));
        System.out.println(result);
        scanner.close();
    }
}