import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Uitloggen {
    private LocalTime time2;


    public LocalTime Kloksysteem(String naam, int code) {
        boolean check = false;
        for (Werkkracht i : Medewerker.medewerker) {
            if (i.getNaam().equals(naam) && code == i.getCode()) {
                check = true;
                time2 = LocalTime.now();
                System.out.println(time2);
                Long Tijdverschil = VerschilTijd() / 3600;
                i.setTijdSeconde(Tijdverschil);
                System.out.println("U dienst is beeindigd een fijne dag verder " + "Je hebt ongeveer " + Tijdverschil + " uurtjes gewerkt");
                Menu.getInstance().menu();

            }


        }
        if (!check) {
           Inloggen inloggen = new Inloggen();
           inloggen.Nietgelijkaan();


        }
        return time2;
    }
    public void checkWerknemerUitklokken(){
        Scanner scanner = new Scanner(System.in);
        Salaris obj = new Salaris();
        Gegevens gegevens = new Gegevens(922220,9276227);
        Medewerker medewerker = new Medewerker("Lisa", 8765, 10.50, gegevens);
        System.out.println("Wat is je naam");
        String naam = scanner.nextLine();
        System.out.println("Wat is je code?");
        int code = scanner.nextInt();
        Kloksysteem(naam,code);
    }




    public Long VerschilTijd() {
        Inloggen obj = new Inloggen();
        long minutesBetween = ChronoUnit.SECONDS.between(Inloggen.getTime(), time2);
        System.out.println("Diffrence between time in munutes : " + minutesBetween);


        return minutesBetween;
    }

}
