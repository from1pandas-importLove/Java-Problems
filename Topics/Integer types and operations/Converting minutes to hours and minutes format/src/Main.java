import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        // Your code comes here!
        int hours = minutes / 60;
        int remainderMinutes =  minutes - (hours * 60);
        System.out.println(hours + " hours and " + remainderMinutes + " minutes");
        scanner.close();
    }
}