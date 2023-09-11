public class HeadWagon extends Wagon {

    public HeadWagon() {
        super(WagonType.HEAD, Wagons.DEFAULT_HEAD_WAGON_CAPACITY);
    }

    public HeadWagon(int capacity) {
        super(WagonType.HEAD, capacity);
    }

    @Override
    public boolean isHeadWagon() {
        return true;
    }
}
