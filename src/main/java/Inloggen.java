import java.time.LocalTime;
import java.util.Scanner;

public class Inloggen extends UrenRegistratie {
    MedewerkerToevoegen medewerkerToevoegen = new MedewerkerToevoegen();
    Salaris salaris = new Salaris();
    private static LocalTime time;


    public static LocalTime getTime() {

        return time;
    }

    @Override
    public LocalTime Kloksysteem(String naam, int code) {
        boolean check = false;
        for (int i = 0; i < Medewerker.medewerkerList.size(); i++) {
            if (Medewerker.medewerkerList.get(i).getNaam().equals(naam) && code == Medewerker.medewerkerList.get(i).getCode()) {
                check = true;
                System.out.println("Je dienst is succesvol gestart. Werkze!");
                time = LocalTime.now();
                System.out.println(time);
                Menu.getInstance().menu();

            }

        }
        if (!check) {
            FoutGegevens();

        }


        return time;




    }

    @Override
    public void Inloggen() {
        super.Inloggen();
        Kloksysteem(super.naam,super.code);
    }
    public void InloggenSalaris(){
        super.Inloggen();
        salaris.BerekenSalaris(super.naam, super.code);

    }

}