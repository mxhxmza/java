public class PlaneSeat {
    private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seat_id){
        seatId = seat_id;
        customerId = -1;
        assigned = false;
    }

    public int getSeatID(){
        return this.seatId;
    }

    public int getCustomerID(){
        return this.customerId;
    }

    public boolean isOccupied(){
        return this.assigned;
    }

    public void assign(int cust_id){
        this.customerId = cust_id;
        this.assigned = true;
    }

    public void unassign(){
        this.customerId = -1;
        this.assigned = false;
    }
}
