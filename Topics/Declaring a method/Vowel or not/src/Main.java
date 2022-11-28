import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        boolean value = true;

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            value = value;
        }else{
            value = false;
        }
        return value;
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}