import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Salaris {
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
        for (int i = 0; i < Medewerker.medewerkerList.size(); i++) {
            if (Medewerker.medewerkerList.get(i).getNaam().equals(naam) && code == Medewerker.medewerkerList.get(i).getCode()) {
                check = true;
                System.out.println("Welkom");
                Double berekeningSalaris = (Medewerker.medewerkerList.get(i).getTijdSeconde() * Medewerker.medewerkerList.get(i).getUurloon()) * belastingLoon * Toeslag;
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
