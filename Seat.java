
public class Seat {
    private boolean unoccupied;
    private boolean reserved;

    public Seat(){
        this.unoccupied = false;
        this.reserved = false;
    }

    public Seat(boolean unoccupied, boolean reserved) {
        this.unoccupied = unoccupied;
        this.reserved = reserved;
    }

    public boolean isUnoccupied() {
        return unoccupied;
    }

    public void setUnoccupied(boolean unoccupied){
        this.unoccupied = unoccupied;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved){
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("{");
        if(unoccupied) builder.append("f");
        else builder.append(".");

        if(reserved) builder.append("r");
        else builder.append(".");
        builder.append("}");

        return builder.toString();
    }
}
