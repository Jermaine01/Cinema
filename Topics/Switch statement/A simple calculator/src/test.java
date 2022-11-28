public class test {
    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
     int g = 5;
     int h = 10;
     int i = 15;

     g = h;
     h = i;
     System.out.print(g);
    }
}
