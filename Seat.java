public class Seat {
    String seatName;
    int row;
    int column;
    boolean isWorking;
    boolean isTaken;
    public Seat(int row, int column, boolean isWorking, boolean isTaken){
        char[] rows = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        this.seatName = ""+rows[row]+column;
        this.row = row;
        this.column = column;
        this.isWorking = isWorking;
        this.isTaken = isTaken;
    }

    public void resSeat(){
        if (this.isTaken == false && this.isWorking == true) {
            this.isTaken = true;
            System.out.println("Seat reserved!");
        } else {
            System.out.println("Seat is taken already or is broken!");
        }
    }

    public void cancelSeat(){
        if (this.isTaken == true) {
            this.isTaken = false;
            System.out.println("Seat reserved!");
        }  else {
            System.out.println("Seat is not taken already or is broken!");
        }
    }

    public void reportSeat(){
        this.isTaken = false;
        this.isWorking = false;
    }

    @Override
    public String toString() {
        if (isTaken) {
            return "\u001B[31m"+seatName+"\u001B[0m";
        } else if (isWorking == false){
            return "XX";
        } else {
            return "\u001B[32m"+seatName+"\u001B[0m";
        }
    }
}
