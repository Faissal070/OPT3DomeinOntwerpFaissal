import java.util.ArrayList;

public class Werkgever extends Werkkracht {


    public static ArrayList<Werkkracht> werkgeversList = new ArrayList<>();

    Werkgever(){
        super();
    }

    Werkgever(String naam, Integer code) {
        super(naam, code);
    }


    public void ToevoegingWerkgever() {
        Werkkracht werkgever1 = new Werkkracht("Mohamed", 7654);
        werkgeversList.add(werkgever1);


    }
}


