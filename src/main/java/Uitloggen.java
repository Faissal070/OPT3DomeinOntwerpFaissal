import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Uitloggen extends UrenRegistratie {
    private LocalTime time2;


    public LocalTime Kloksysteem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is je naam");
        String naam = scanner.nextLine();
        System.out.println("Wat is je code?");
        int code = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i<Medewerker.medewerkerList.size(); i++) {
            if (Medewerker.medewerkerList.get(i).getNaam().equals(naam) && code == Medewerker.medewerkerList.get(i).getCode()) {
                check = true;
                time2 = LocalTime.now();
                System.out.println(time2);
                Long Tijdverschil = VerschilTijd() / 3600;
                Medewerker.medewerkerList.get(i).setTijdSeconde(Tijdverschil);
                System.out.println("U dienst is beeindigd een fijne dag verder " + "Je hebt ongeveer " + Tijdverschil + " uurtjes gewerkt");
                Menu.getInstance().menu();

            }


        }
        if (!check) {
            FoutGegevens();




        }
        return time2;
    }







    public Long VerschilTijd() {
        Inloggen obj = new Inloggen();
        long minutesBetween = ChronoUnit.SECONDS.between(Inloggen.getTime(), time2);
        System.out.println(" Je Tijd in secondes : " + minutesBetween);


        return minutesBetween;
    }

}
