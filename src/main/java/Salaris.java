import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Salaris {
    private static Double belastingLoon = 0.88;
    private static Double Toeslag = 0.90;

    public Double getBelastingLoon(){
        return this.belastingLoon;
    }
    public Double getToeslag(){
        return this.Toeslag;
    }

    public static void BerekenSalaris(String naam, int code){
        boolean check = false;
        for (int i = 0; i<Medewerker.medewerker.size(); i++) {
            if (Medewerker.medewerker.get(i).getNaam().equals(naam) && code == Medewerker.medewerker.get(i).getCode()) {
                check = true;
                System.out.println("Welkom");
                Double berekeningSalaris = (Medewerker.medewerker.get(i).getTijdSeconde() * Medewerker.medewerker.get(i).getUurloon())*belastingLoon*Toeslag;
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Jouw netto salaris tot nu toe bedraagt " + df.format(berekeningSalaris) + " euro");
                Menu.getInstance().menu();


            }
        }
            if (!check) {
                Inloggen inloggen = new Inloggen();
                inloggen.Nietgelijkaan();



            }
        }
    }
