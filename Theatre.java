import java.util.ArrayList;

public class Theatre {
    int rows;
    int columns;
    ArrayList<ArrayList<Seat>> Theatre;
    
    public Theatre(int rows, int columns){
        this.Theatre = new ArrayList<ArrayList<Seat>>();
        if (rows > 26) {
            System.out.println("Maximum amount of rows is 26! Setting value to 26");
            rows = 26;
        }
        if (columns > 30) {
            System.out.println("Maximum amount of columns is 30! Setting value to 30");
            columns = 30;
        }
        for (int i = 0; i < rows; i++) {
            Theatre.add(new ArrayList<Seat>());
            for (int j = 0; j < columns; j++) {
                Theatre.get(i).add(new Seat(i, j+1, true, false));
            }
        }
    }

    public void DisplayChart(){
        for (int i = 0; i <Theatre.size() ; i++) {
            System.out.println(Theatre.get(i));
        }
    }

    public void resSeat(String seat) {
        for (int i = 0; i < Theatre.size(); i++) {
            for (int j = 0; j < Theatre.get(i).size(); j++) {
                if(Theatre.get(i).get(j).seatName.equals(seat)){
                    Theatre.get(i).get(j).resSeat();
                }
            }
        }
    }

    public void cancelSeat(String seat) {
        for (int i = 0; i < Theatre.size(); i++) {
            for (int j = 0; j < Theatre.get(i).size(); j++) {
                if(Theatre.get(i).get(j).seatName.equals(seat)){
                    Theatre.get(i).get(j).cancelSeat();
                }
            }
        }
    }

    public void reportSeat(String seat) {
        for (int i = 0; i < Theatre.size(); i++) {
            for (int j = 0; j < Theatre.get(i).size(); j++) {
                if(Theatre.get(i).get(j).seatName.equals(seat)){
                    Theatre.get(i).get(j).reportSeat();
                }
            }
        }
    }
}
