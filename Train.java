
public class Train {
    private Wagon[] wagons;

    public Train(int numWagons){
        if(numWagons < 1) throw new IllegalArgumentException("A train requires at least one wagon!");

        wagons = new Wagon[numWagons];
        wagons[0] = new HeadWagon();
        for (int i = 1; i < wagons.length; i++) {
            wagons[i] = new PassangerWagon();
        }
    }

    public int getNumWagons(){
        return wagons.length;
    }

    public Wagon getWagon(int index){
        return wagons[index];
    }

    public void setWagon(int index, Wagon wagon){
        wagons[index] = wagon;
    }

    public void setCompartment(int wagonIndex, int compartmentIndex, Compartment compartment){
        wagons[wagonIndex].setCompartment(compartmentIndex, compartment);
    }

    public void setSeat(int wagonIndex, int compartmentIndex, int seatIndex, Seat seat){
        wagons[wagonIndex].setSeat(compartmentIndex, seatIndex, seat);
    }

    public void setSeatAttributes(int wagonIndex, int compartmentIndex, int seatIndex, boolean unoccupied, boolean reserved){
        wagons[wagonIndex].setSeatAttributes(compartmentIndex, seatIndex, unoccupied, reserved);
    }

    public Wagon[] getWagons(){
        return wagons;
    }

    public void setWagons(Wagon[] wagons){
        this.wagons = wagons;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("--- Train START ---\n");
        for(Wagon wagon : wagons){
            builder.append(wagon).append("\n");
        }
        builder.append("--- Train END ---");
        return builder.toString();
    }
}
