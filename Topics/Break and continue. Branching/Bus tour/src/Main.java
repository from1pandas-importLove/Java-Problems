import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double busHeight = scanner.nextDouble();
        int numberOfBridges = scanner.nextInt();
        boolean isCrushed = false;
        int bridgeCounter = 0;

        for (int i = 1; i < numberOfBridges + 1; i++) {
            double bridgeHeight = scanner.nextDouble();
            if (bridgeHeight <= busHeight) {
                isCrushed = true;
                bridgeCounter = i;
                break;
            }
        }
        if (isCrushed) {
            System.out.println("Will crash on bridge " + bridgeCounter);
        } else {
            System.out.println("Will not crash");
        }

    }
}