import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // Maximum rows is 26 and maximum columns is 30
        Theatre room1 = new Theatre(7, 20);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println();
            room1.DisplayChart();
            System.out.println("\u001B[36m");
            System.out.println("-------------------------------------");
            System.out.println("Pick your option: ");
            System.out.println("1. Reserve Seat");
            System.out.println("2. Cancel Seat");
            System.out.println("3. Report Broken or Malfunctioned Seat");
            System.out.println("4. View Seating Chart");
            System.out.println("5. Quit");
            System.out.println("\u001B[0m");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println();
                    room1.DisplayChart();
                    System.out.println();
                    System.out.println("Which seat would you like to reserve?");
                    String seat = scanner.nextLine().toUpperCase();
                    room1.resSeat(seat);
                    break;
                case "2":
                    System.out.println();
                    room1.DisplayChart();
                    System.out.println();
                    System.out.println("Which seat would you like to cancel?");
                    seat = scanner.nextLine().toUpperCase();
                    room1.cancelSeat(seat);
                    break;
                case "3":
                    System.out.println();
                    room1.DisplayChart();
                    System.out.println();
                    System.out.println("Which seat would you like to report as broken?");
                    seat = scanner.nextLine().toUpperCase();
                    room1.reportSeat(seat);
                    break;
                case "4":
                    System.out.println();
                    break;
                case "5":
                    System.out.println("Have a nice day!");
                    scanner.close();
                    running = false;
                    break;
            
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
