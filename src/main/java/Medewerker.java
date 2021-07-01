import java.util.ArrayList;
import java.util.Scanner;

public class Medewerker extends Werkkracht {

    public static ArrayList<Medewerker> medewerkerList = new ArrayList<>();

    Medewerker(String naam, Integer code, Double uurloon, Gegevens gegevens) {
        super(naam, code, uurloon, gegevens);
    }


}
