import java.util.ArrayList;
import java.util.Scanner;

public class Medewerker extends Werkkracht {

    public static ArrayList<Medewerker> medewerkerList = new ArrayList<>();

    Medewerker(String naam, Integer code) {
        super(naam, code);

    }

    public void setUurloon(double uurloon)
    {
        super.setUurloon(uurloon);
    }

    public void setGegevens(Gegevens gegevens)
    {
        super.setGegevens(gegevens);
    }


}
