public class TravelTrain extends Train{

    public TravelTrain(int numWagons) {
        super(numWagons);
        if(numWagons < 2) throw new IllegalArgumentException("A travel train requires at least two wagons!");

        setWagon(getNumWagons() - 1, new BaggageWagon());
    }

}
