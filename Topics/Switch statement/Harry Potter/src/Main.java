import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String house = scanner.next();

        switch(house){
            case "gryffindor":
                System.out.print("bravery");
                break;
            case "hufflepuff":
                System.out.print("loyalty");
                break;
            case "slytherin":
                System.out.print("cunning");
                break;
            case "ravenclaw":
                System.out.print("intellect");
                break;
            default:
                System.out.print("not a valid house");
        }
    }
}