import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Uitloggen extends UrenRegistratie {
    private LocalTime time2;


    public LocalTime Kloksysteem(String naam, int code) {
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




    @Override
    public void Uitloggen() {
        super.Uitloggen();
        Kloksysteem(super.naam,super.code);
    }


    public Long VerschilTijd() {
        long minutesBetween = ChronoUnit.SECONDS.between(Inloggen.getTime(), time2);
        System.out.println(" Je Tijd in secondes : " + minutesBetween);


        return minutesBetween;
    }

}
