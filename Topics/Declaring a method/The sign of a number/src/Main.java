import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        // write your code here

        int output = 0;

        if (number < 0){
        output =-1;    
        }
        if (number > 0){
            output = 1;
        }
        if (number == 0){
            output = 0;
        }
      return output ;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}