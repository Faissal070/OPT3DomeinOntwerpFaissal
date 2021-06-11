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
    Werkkracht werknemer;

    public static void BerekenSalaris(String naam, int code){
        boolean check = false;
        for (Werkkracht i : Medewerker.medewerker) {
            if (i.getNaam().equals(naam) && code == i.getCode()) {
                check = true;
                System.out.println("Welkom");
                Double berekeningSalaris = i.getTijdSeconde() * i.getUurloon()*belastingLoon*Toeslag;
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Jouw netto salaris tot nu toe bedraagt " + df.format(berekeningSalaris) + " euro");
                Menu.getInstance().menu();


            }
        }
            if (!check) {
                System.out.println("Sorry je gegevens kloppen niet. Je wordt automatisch doorgestuurd naar de menu");
                Menu.getInstance().menu();


            }
        }
    }
