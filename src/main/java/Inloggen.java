import java.time.LocalTime;
import java.util.Scanner;

public class Inloggen extends UrenRegistratie {
    Scanner scanner = new Scanner(System.in);
    private static LocalTime time;


    public static LocalTime getTime() {
        return time;
    }

    @Override
    public LocalTime Kloksysteem() {
        System.out.println("Naam werknemer");
        scanner.nextLine();
        String naam = scanner.nextLine();
        System.out.println("Code werknemer");
        int code = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i<Medewerker.medewerker.size(); i++) {
            if (Medewerker.medewerker.get(i).getNaam().equals(naam) && code == Medewerker.medewerker.get(i).getCode()) {
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
    public void Nietgelijkaan(){
        System.out.println("Sorry probeer het opnieuw je wordt vanzelf doorgestuurd naar de menu");
        Menu.getInstance().menu();

    }
}