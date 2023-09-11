public class BaggageWagon extends Wagon {

    public BaggageWagon() {
        super(WagonType.BAGGAGE, 0);
    }

    @Override
    public boolean isHeadWagon() {
        return false;
    }
}
