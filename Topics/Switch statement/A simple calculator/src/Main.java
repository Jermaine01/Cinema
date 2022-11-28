import java.util.Objects;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // start coding here
        long firstNumber = scanner.nextLong();
        String operation = scanner.next();
        long secondNumber = scanner.nextLong();

        if (Objects.equals(operation, "/") && secondNumber == 0 ) {
            System.out.print("Division by 0!");
        }else{
            switch (operation) {
                case "+":
                    System.out.print(firstNumber + secondNumber);
                    break;
                case "-":
                    System.out.print(firstNumber - secondNumber);
                    break;
                case "/":
                    System.out.print(firstNumber/secondNumber);
                    break;
                case "*":
                    System.out.print(firstNumber*secondNumber);
                    break;
                default:
                    System.out.print("Unknown operator");
            }
        }
    }
}