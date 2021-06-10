import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Salaris {
    private Double belastingLoon = 0.88;
    private Double Toeslag = 0.90;

    public Double getBelastingLoon(){
        return this.belastingLoon;
    }
    public Double getToeslag(){
        return this.Toeslag;
    }
    Werkkracht werknemer;

    public void BerekenSalaris() {
        Scanner scanner = new Scanner(System.in);
        werknemer =  new Werkkracht("Fais", 9833,7.90,90,8229229);
        System.out.println("Naam werknemer");
        String naam = scanner.nextLine();
        System.out.println("Code werknemer");
        int code = scanner.nextInt();
        boolean check = false;
        for (Werkkracht i : Medewerker.medewerker) {
            if (i.getNaam().equals(naam) && code == i.getCode()) {
                check = true;
                System.out.println("Welkom");
                Double berekeningSalaris = i.getTijdSeconde() * i.getUurloon();
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
