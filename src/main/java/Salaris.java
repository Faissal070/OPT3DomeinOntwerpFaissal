import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Salaris {
    Medewerker medewerker;
    private Double belastingLoon = 0.88;
    private Double Toeslag = 0.90;


    public Double getBelastingLoon() {
        return this.belastingLoon;
    }

    public Double getToeslag() {
        return this.Toeslag;
    }

    public void BerekenSalaris(String naam, int code) {
        boolean check = false;
        for (int i = 0; i < medewerker.medewerkerList.size(); i++) {
            if (medewerker.medewerkerList.get(i).getNaam().equals(naam) && code == medewerker.medewerkerList.get(i).getCode()) {
                check = true;
                System.out.println("Welkom");
                Double berekeningSalaris = (medewerker.medewerkerList.get(i).getTijdSeconde() * medewerker.medewerkerList.get(i).getUurloon()) * belastingLoon * Toeslag;
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Jouw netto salaris tot nu toe bedraagt " + df.format(berekeningSalaris) + " euro");
                Menu.getInstance().menu();


            }
        }
        if (!check) {
            UrenRegistratie.FoutGegevens();


        }
    }

}
