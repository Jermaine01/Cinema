import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void sort(int[] numbers) {
        // write your code here
        int a = 0;
        int b = 0;
        for (int j = 0 ; j< numbers.length-1; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int k = i;
                    while (numbers[k] > numbers[k + 1]) {
                        a = numbers[k];
                        b = numbers[k + 1];
                        numbers[k] = b;
                        numbers[k + 1] = a;

                        if (k == numbers.length - 2) {
                            break;
                        }
                        k++;
                    }

                }
            }
        }
        }


    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}