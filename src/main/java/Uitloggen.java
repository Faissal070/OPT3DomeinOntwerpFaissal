import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Uitloggen extends UrenRegistratie {
    private static LocalTime time2;

    public static LocalTime getTime2() {
        return time2;
    }

    public LocalTime Kloksysteem(String naam, int code) {
        boolean check = false;
        for (int i = 0; i < Medewerker.medewerkerList.size(); i++) {
            if (Medewerker.medewerkerList.get(i).getNaam().equals(naam) && code == Medewerker.medewerkerList.get(i).getCode()) {
                check = true;
                time2 = LocalTime.now();
                System.out.println(time2);
                Long Tijdverschil = VerschilTijd() / 3600;
                Medewerker.medewerkerList.get(i).setTijdSeconde(Tijdverschil);
                System.out.println("U dienst is beeindigd een fijne dag verder " + "Je hebt ongeveer " + (Tijdverschil) + " uurtjes gewerkt");
                Menu.getInstance().menu();

            }


        }
        if (!check) {
            FoutGegevens();


        }
        return time2;
    }


    @Override
    public void UitloggenKloksysteem() {
        super.UitloggenKloksysteem();
        Kloksysteem(super.naam, super.code);
    }


}