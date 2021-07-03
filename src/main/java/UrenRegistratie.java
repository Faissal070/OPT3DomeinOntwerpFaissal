import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

abstract class UrenRegistratie {
    String naam;
    int code;

    public abstract LocalTime Kloksysteem(String naam, int code);


    public static void FoutGegevens() {
        System.out.println("Sorry probeer het opnieuw je wordt vanzelf doorgestuurd naar de menu");
        Menu.getInstance().menu();
    }

    public void InloggenKloksysteem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goedendag, wat is je naam (Medewerker)");
        naam = scanner.nextLine();
        System.out.println("Voer je code in (Medewerker)");
        code = scanner.nextInt();
    }

    public void UitloggenKloksysteem() {
        InloggenKloksysteem();
    }

    public Long VerschilTijd() {
        DecimalFormat df = new DecimalFormat("#.##");
        long minutesBetween = ChronoUnit.SECONDS.between(Inloggen.getTime(), Uitloggen.getTime2());
        System.out.println(" Je Tijd in secondes : " + minutesBetween);


        return minutesBetween;
    }
}





