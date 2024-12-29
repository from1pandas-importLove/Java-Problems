import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int maxProduct = 0;
        int[] arr = new int[len];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] * arr[i - 1] > maxProduct) {
                maxProduct = arr[i] * arr[i - 1];
            }
        }
        System.out.println(maxProduct);

    }
}