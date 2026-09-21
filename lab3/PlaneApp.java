import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Plane plane = new Plane();
        int choice = 0;
        do{
            System.out.printf("Choose 1-7: \n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    plane.showNumEmptySeats();
                    break;
                case 2:
                    plane.showEmptySeats();
                    break;
                case 3:
                    plane.showAssignedSeats(true);
                    break;
                case 4:
                    plane.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.printf("Assigning Seat ..\n");
                    System.out.print("Please enter SeatID: ");
                    int seatid = sc.nextInt();
                    System.out.print("Please enter CustomerID: ");
                    int custid = sc.nextInt();
                    plane.assignSeat(seatid, custid);
                    System.out.printf("Seat Assigned!\n");
                    break;
                case 6:
                    System.out.print("Enter SeatID to unassign customer from: ");
                    int sid = sc.nextInt();
                    plane.unAssignSeat(sid);
                    System.out.printf("Seat Unassigned!\n");
                    break;
                case 7: 
                    break;
                default:
                    System.out.printf("Choose a valid choice \n");
                    break;
            }
        } while (choice != 7);
    }
}
