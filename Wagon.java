
public abstract class Wagon {
    protected WagonType type;
    protected Compartment[] compartments;

    public Wagon(WagonType type, int numCompartments){
        this.type = type;

        compartments = new Compartment[numCompartments];
        for (int i = 0; i < compartments.length; i++) {
            compartments[i] = new Compartment(Compartments.DEFAULT_COMPARTMENT_CAPACITY);
        }
    }

    public abstract boolean isHeadWagon();

    public Compartment getCompartment(int index){
        return compartments[index];
    }

    public void setCompartment(int index, Compartment compartment){
        compartments[index] = compartment;
    }

    public void setSeat(int compartmentIndex, int seatIndex, Seat seat){
        compartments[compartmentIndex].setSeat(seatIndex, seat);
    }

    public void setSeatAttributes(int compartmentIndex, int seatIndex, boolean unoccupied, boolean reserved){
        compartments[compartmentIndex].setSeatAttributes(seatIndex, unoccupied, reserved);
    }

    public Compartment[] getCompartments() {
        return compartments;
    }

    public void setCompartments(Compartment[] compartments) {
        this.compartments = compartments;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("--- " + type + " START ---\n");
        for(Compartment compartment : compartments){
            builder.append(compartment).append("\n");
        }
        builder.append("--- ").append(type).append(" END ---");

        return builder.toString();
    }
}
