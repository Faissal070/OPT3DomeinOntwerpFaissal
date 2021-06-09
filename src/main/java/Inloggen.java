import java.time.LocalTime;
import java.util.Scanner;

public class Inloggen {
    private static LocalTime time;
    Werkkracht medewerker;

    public LocalTime Inklokken() {
        Menu menu = new Menu();
        medewerker = new Medewerker("Check",9383,8.10,928272,929282);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Naam werknemer");
        String naam = scanner.nextLine();
        System.out.println("Code werknemer");
        int code = scanner.nextInt();
        boolean check = false;
        for (Werkkracht i : Medewerker.medewerker) {
            if (i.getNaam().equals(naam) && code == i.getCode()) {
                check = true;
                System.out.println("Je dienst is succesvol gestart. Werkze!");
                time = LocalTime.now();
                System.out.println(time);
                menu.menu();
                return time;

            }
        }
        if (!check) {
            System.out.println("Sorry probeer het opnieuw je wordt vanzelf doorgestuurd naar de menu");
            menu.menu();

        }

        return time;
    }
    public static LocalTime getTime(){
        return time;
    }

}
