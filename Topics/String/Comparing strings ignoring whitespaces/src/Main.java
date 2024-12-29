import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        System.out.println(string1.replace(" ", "").equals(string2.replace(" ", "")));

    }
}