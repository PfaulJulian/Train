public class PassangerWagon extends Wagon {

    public PassangerWagon() {
        super(WagonType.PASSANGER, Wagons.DEFAULT_PASSANGER_WAGON_CAPACITY);
    }

    public PassangerWagon(int numCompartments) {
        super(WagonType.PASSANGER, numCompartments);
    }

    @Override
    public boolean isHeadWagon() {
        return false;
    }
}
