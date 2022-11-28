package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    static int ticketCount;
    static int ticket_8;
    static int ticket_10;

    public static void showSeats(int[] seat, int rows, int columns, char[][] seats) {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int j = 1; j <= columns; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1 + " ");
            System.out.println(Arrays.toString(seats[i]).replace("[", "").replace("]", "").replace(",", ""));
        }
        System.out.println();

    }

    public static void buyTicket(int rows, int columns, int[] seat, char[][] seats) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int rowNumber = 0;
        int seatNumber = 1;
        System.out.println("Enter a row number:");
        seat[rowNumber] = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        seat[seatNumber] = scanner.nextInt();

        if ((seat[rowNumber]<1 || seat[rowNumber]>rows)||(seat[seatNumber]<1 || seat[seatNumber]>rows)) {
            while((seat[rowNumber]<0 || seat[rowNumber]>rows)||(seat[seatNumber]<0 || seat[seatNumber]>rows-1)){
                System.out.println("Wrong input!");
                System.out.println("Enter a row number:");
                seat[rowNumber] = scanner.nextInt();
                System.out.println("Enter a seat number in that row:");
                seat[seatNumber] = scanner.nextInt();
            }
        }

        if (seats[seat[rowNumber] - 1][seat[seatNumber] - 1] == 'B') {
            while (seats[seat[rowNumber] - 1][seat[seatNumber] - 1] == 'B') {
                System.out.println("That ticket has already been purchased");
                System.out.println("Enter a row number:");
                seat[rowNumber] = scanner.nextInt();
                System.out.println("Enter a seat number in that row:");
                seat[seatNumber] = scanner.nextInt();
            }
        }

        seats[seat[rowNumber] - 1][seat[seatNumber] - 1] = 'B';
        Cinema.ticketCount++;

        if (rows * columns <= 60) {
            System.out.println("Ticket price: $10");
        } else {
            if (rows % 2 == 0) {
                if (seat[rowNumber] <= rows / 2) {
                    System.out.println("Ticket price: $10");
                    Cinema.ticket_10+=1;
                } else {
                    System.out.println("Ticket price: $8");
                    Cinema.ticket_8+=1;
                }
            } else {
                if (seat[rowNumber] < (rows / 2) + 1) {
                    System.out.println("Ticket price: $10");
                    Cinema.ticket_10+=1;
                } else {
                    System.out.println("Ticket price: $8");
                    Cinema.ticket_8+=1;
                }
            }
        }
    }
    public static void statistics(int rows, int columns){
        float ticketPercentage = ((float)ticketCount/(rows*columns))*100;
        int currentIncome = Cinema.ticket_10*10+Cinema.ticket_8*8;
        int totalIncome = 0;
        if (rows * columns <= 60){
            totalIncome = rows*columns*10;
        } else if (rows % 2 == 0) {
            totalIncome = (rows/2)*columns*10 +(rows/2)*columns*8;
        } else {
            totalIncome = (rows/2)*columns*10 +(rows/2 +1)*columns*8;
        }
        System.out.printf("Number of purchased tickets: %d",Cinema.ticketCount);
        System.out.println();
        System.out.printf("Percentage: %.2f%%",ticketPercentage);
        System.out.println();
        System.out.printf("Current income: $%d",currentIncome);
        System.out.println();
        System.out.printf("Total income: $%d",totalIncome);
        System.out.println();
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int columns = scanner.nextInt();
        int ticket_10 = 0 ;
        int ticket_8 = 0 ;



        int[] seat = {0, 0};
        char[][] seats = new char[rows][columns];
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < columns; l++) {
                seats[k][l] = 'S';
            }
        }
                loop:
                while (true) {
                    System.out.println("1. Show the seats");
                    System.out.println("2. Buy a ticket");
                    System.out.println("3. Statistics");
                    System.out.println("0. Exit");
                    int answer = scanner.nextInt();

                    if (answer == 1) {
                        showSeats(seat, rows, columns, seats);
                    }
                    if (answer == 2) {
                        buyTicket(rows,columns,seat,seats);
                    }
                    if (answer == 3) {
                        statistics(rows,columns);
                    }
                    if (answer == 0) {
                        break loop;
                    }
                }
            }
        }


