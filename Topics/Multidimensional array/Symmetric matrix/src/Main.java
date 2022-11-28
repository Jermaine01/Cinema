import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        int iterations = 1;
        int counter = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        loop:
            for (int k = 0; k < size - 1; k++) {
                for (int l = iterations; l < size; l++) {
                    int side1 = array[k][l];
                    int side2 = array[l][k];

                    if (side1 != side2){
                        counter = counter + 1;
                    }
                    }
                iterations++;
            }
              if (counter > 0){
                  System.out.println("NO");
              }else{
                  System.out.println("YES");
              }
        }
    }


