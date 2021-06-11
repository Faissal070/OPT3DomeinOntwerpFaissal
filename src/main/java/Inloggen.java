import java.time.LocalTime;
import java.util.Scanner;

public class Inloggen extends UrenRegistratie {
    Scanner scanner = new Scanner(System.in);
    private static LocalTime time;


    public static LocalTime getTime() {
        return time;
    }

    @Override
    public LocalTime Kloksysteem(String naam, int code) {
        boolean check = false;
        for (Werkkracht i : Medewerker.medewerker) {
            if (i.getNaam().equals(naam) && code == i.getCode()) {
                check = true;
                System.out.println("Je dienst is succesvol gestart. Werkze!");
                time = LocalTime.now();
                System.out.println(time);
                Menu.getInstance().menu();

            }

        }
        if (!check) {
            Nietgelijkaan();

        }
        return time;
    }

    public void checkwerknemerVoorSalaris() {
        Gegevens gegevens = new Gegevens(78939390, 838383);
        Werkkracht werknemer3 = new Werkkracht("Fais", 9833, 9.30, gegevens);
        System.out.println("Goedendag, wat is je naam werknemer");
        scanner.nextLine();
        String naamwerknemer2 = scanner.nextLine();
        System.out.println("Voer je code in");
        int codewerknemer2 = scanner.nextInt();
        Salaris.BerekenSalaris(naamwerknemer2, codewerknemer2);
    }
    public void checkWerknemerInklokken(){
        Gegevens gegevens = new Gegevens(8927292, 1265252);
        Werkkracht werknemer = new Werkkracht("Lisa", 9087, 15.50, gegevens);
        System.out.println("Naam werknemer");
        String naam = scanner.nextLine();
        System.out.println("Code werknemer");
        int code = scanner.nextInt();
        Kloksysteem(naam,code);

    }
    public void Nietgelijkaan(){
        System.out.println("Sorry probeer het opnieuw je wordt vanzelf doorgestuurd naar de menu");
        Menu.getInstance().menu();

    }
}