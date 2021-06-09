import java.util.ArrayList;

public class Werkgever extends Werkkracht{
    public static ArrayList<Werkkracht> werkgevers = new ArrayList<>();


    Werkgever(String naam, Integer code, Double uurloon, Integer bsn, int telefoonnummer) {
        super(naam, code, uurloon, bsn, telefoonnummer);
    }
    public void ToevoegingMedewerker() {
        Werkkracht werkgever1 = new Werkkracht("Mohamed", 7654, 15.70, 876543567, 0623452345);
        werkgevers.add(werkgever1);
    }

}


