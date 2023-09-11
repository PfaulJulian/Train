import java.util.Arrays;

public class Compartment {
    private Seat[] seats;

    public Compartment(int capacity){
        seats = new Seat[capacity];
        for (int i = 0; i < seats.length; i++) {
            seats[i] = new Seat(true, false);
        }
    }

    public int getCapacity(){
        return seats.length;
    }

    public Seat getSeat(int index){
        return seats[index];
    }

    public void setSeat(int index, Seat seat){
        seats[index] = seat;
    }

    public void setSeatAttributes(int index, boolean unoccupied, boolean reserved){
        seats[index].setUnoccupied(unoccupied);
        seats[index].setReserved(reserved);
    }

    public Seat[] getSeats(){
        return seats;
    }

    public void setSeats(Seat[] seats){
        this.seats = seats;
    }

    @Override
    public String toString(){
        return Arrays.toString(seats); // Formatiert den Output-String auch! "[seat1, seat2, seat3...]"
    }
}
