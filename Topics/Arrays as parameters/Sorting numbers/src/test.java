import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int[] numbers = {5,3,2,10,238,73,23};
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
        System.out.print(Arrays.toString(numbers));
    }

    }

