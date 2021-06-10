import java.util.ArrayList;

public class Werkgever extends Werkkracht{
    public static ArrayList<Werkkracht> werkgevers = new ArrayList<>();

    Werkgever(String naam, Integer code, Double uurloon, Gegevens gegevens) {
        super(naam, code, uurloon, gegevens);
    }




    public void ToevoegingMedewerker() {
    Gegevens gegevens = new Gegevens(93320,9827292);
        Werkkracht werkgever1 = new Werkkracht("Mohamed", 7654,25.50,gegevens);
        werkgevers.add(werkgever1);
    }

}


