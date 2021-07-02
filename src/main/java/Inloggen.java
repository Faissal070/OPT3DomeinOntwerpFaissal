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
    public void InloggenKloksysteem() {
        super.InloggenKloksysteem();
        Kloksysteem(super.naam,super.code);
    }
    public void InloggenSalaris(){
        super.InloggenKloksysteem();
        salaris.BerekenSalaris(super.naam, super.code);

    }
    public void WerkgeverInloggen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goedendag mag ik u naam (Werkgever)");
        String naam = scanner.nextLine();
        System.out.println("Mag ik u code (Werkgever)");
        int code = scanner.nextInt();
        medewerkerToevoegen.GegevensToevoegen(naam,code);
    }
}


