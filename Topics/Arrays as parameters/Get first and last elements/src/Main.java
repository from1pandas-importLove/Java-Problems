import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] array) {
        int first = array[0];
        int last = array[array.length - 1];
        return new int[] {first, last};
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}