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
    public LocalTime Kloksysteem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Naam werknemer");
        String naam = scanner.nextLine();
        System.out.println("Code werknemer");
        int code = scanner.nextInt();
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

    public void InloggenSalaris() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goedendag, wat is je naam werknemer");
        String naamwerknemer2 = scanner.nextLine();
        System.out.println("Voer je code in");
        int codewerknemer2 = scanner.nextInt();
        salaris.BerekenSalaris(naamwerknemer2, codewerknemer2);
    }

    public void InloggenWerkgever() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goedendag, wat is u naam (Werkgever) ?");
        String naamwerkgever = scanner.nextLine();
        System.out.println("Voer u viercijferige code in");
        int codewerkgever = scanner.nextInt();
        medewerkerToevoegen.GegevensToevoegen(naamwerkgever, codewerkgever);
    }
}