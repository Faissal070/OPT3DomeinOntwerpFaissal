import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Uitloggen {
    private LocalTime time2;
    Werkkracht medewerker;

    public LocalTime Kloksysteem() {
        Scanner scanner = new Scanner(System.in);
        Salaris obj = new Salaris();
        medewerker = new Werkkracht("Lisa", 8765, 7.60, 876754325, 678654365);
        System.out.println("Wat is je naam");
        String naam = scanner.nextLine();
        System.out.println("Wat is je code?");
        int code = scanner.nextInt();
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
            System.out.println("Je staat niet in ons systeem. U word teruggestuurd naar de menu");
            Menu.getInstance().menu();


        }
        return time2;
    }



    public Long VerschilTijd() {
        Inloggen obj = new Inloggen();
        long minutesBetween = ChronoUnit.SECONDS.between(Inloggen.getTime(), time2);
        System.out.println("Diffrence between time in munutes : " + minutesBetween);
        //minminutesBetween / 3600;
        //        System.out.println(minutesBetween);utesBetween =

        return minutesBetween;
    }
}
