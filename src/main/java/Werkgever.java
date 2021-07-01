import java.util.ArrayList;
import java.util.Scanner;

public class Werkgever extends Werkkracht {


    public static ArrayList<Werkkracht> werkgevers = new ArrayList<>();

    Werkgever(){
        super();
    }

    Werkgever(String naam, Integer code) {
        super(naam, code);
    }


    public void ToevoegingWerkgever() {
        Werkkracht werkgever1 = new Werkkracht("Mohamed", 7654);
        werkgevers.add(werkgever1);


    }
}


