public class Application {

    public static void main(String[] args) {
        /*
        Es gibt zwei verschiedene Train-Klassen:
            1. Train        (Ohne Gepäckwagon, im code BaggageWagon genannt)
                minimale Anzahl an Wagons: 1
                    - (Kopfwagon, im code HeadWagon genannt)
            2. TravelTrain  (Mit Gepäckwagon am Ende des Zuges)
                minimale Anzahl an Wagons: 2
                    - ein Kopfwagon
                    - ein Gepäckwagon
        */
        TravelTrain train = new TravelTrain(6);

        /*
        Alle Indexe fangen bei 0 an.
        Der Index 0 bei den Wagons gibt uns immer ein Wagon vom Typ HeadWagon (Kopfwagon).
        Dieser hat eine niedrigere Standardanzahl an Abteilen.
        Derzeit haben alle Abteile standardmäßig die gleiche Anzahl Sitzplätze.

        BITTE BEACHTEN: Ich habe kein Bounds-Checking implementiert! (Ausnahme: Im Constructor der Züge)
            (Das heißt das Programm wird versuchen, beispielsweise den
            Sitzplatz mit Index -1 zu bekommen, oder einen Wagon mit Index 7 bei einem Zug,
            welcher nur 4 Wagons besitzt. Viel Spaß mit den IndexOutOfBounds-Exceptions!)
        */

        // (wagonIndex, compartmentIndex, seatIndex, unoccupied, reserved)
        train.setSeatAttributes(2, 0, 0, false, true);

        System.out.println(train);
    }

}
