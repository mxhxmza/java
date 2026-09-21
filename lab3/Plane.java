public class Plane{
    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane(){
        seat = new PlaneSeat[12];
        for(int i = 0; i < 12; i++){
            seat[i] = new PlaneSeat(i+1);
        }
        numEmptySeat = 12;
    }

    private PlaneSeat[] sortSeats(){
        PlaneSeat[] copy = new PlaneSeat[12];
        for(int i = 0; i < 12; i++){
            copy[i] = new PlaneSeat(seat[i].getSeatID());
            if (seat[i].isOccupied()){
                copy[i].assign(seat[i].getCustomerID());
            }
        }
        for(int i = 0; i < 11; i++){
            for(int j = i+1; j < 12; j++){
                if (copy[i].getCustomerID() > copy[j].getCustomerID()){
                    PlaneSeat temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
                }
            }
        }
        return copy;
    }

    public void showNumEmptySeats(){
        System.out.printf("There are %d empty seats \n", this.numEmptySeat);
    }

    public void showEmptySeats(){
        System.out.println("The following seats are empty: ");
        PlaneSeat[] copy = new PlaneSeat[12];
        copy = this.sortSeats();
        for(int i = 0; i < 12; i++){
            if (!copy[i].isOccupied()){
                System.out.printf("SeatID %d \n", copy[i].getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId){
        if (bySeatId){
            System.out.printf("The seat assignments are as follows: \n");
            for(int i = 0; i < 12; i++){
                if (seat[i].isOccupied() == true){
                    System.out.printf("SeatID %d is assigned to CustomerID %d \n", seat[i].getSeatID(), seat[i].getCustomerID());
                }
            }
        }
        else{
           PlaneSeat[] copy = new PlaneSeat[12];
            copy = this.sortSeats();
            for(int i = 0; i < 12; i++){
                if (copy[i].isOccupied() == true){
                    System.out.printf("SeatID %d is assigned to CustomerID %d \n", copy[i].getSeatID(), copy[i].getCustomerID());
                }
            }
        }
    }

    public void assignSeat(int seatId, int cust_id){
        for(int i = 0; i < 12; i++){
            if(seat[i].getSeatID() == seatId && seat[i].isOccupied() == false){
                seat[i].assign(cust_id);
                numEmptySeat --;
                break;
            }
        }
    }

    public void unAssignSeat(int seatId){
        for(int i = 0; i < 12; i++){
            if(seat[i].getSeatID() == seatId){
                seat[i].unassign();
                numEmptySeat ++;
                break;
            }
        }
    }
}