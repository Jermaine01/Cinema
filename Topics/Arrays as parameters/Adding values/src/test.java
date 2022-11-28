import java.util.*;

public class test {
    public static void addSeeds(int[] portion,int portion2) {
        portion[portion2] = 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] portion = {3, 3, 2, 5};
        int portion2 = scanner.nextInt();
        addSeeds(portion,portion2); // try to change portion

        // now let's print a portion
        System.out.println(Arrays.toString(portion));
        // 100, because the method didn't change portion, only its copy
    }


}