import java.time.LocalTime;
import java.util.Scanner;

abstract class UrenRegistratie {
    String naam;
    int code;

    public abstract LocalTime Kloksysteem(String naam, int code);


    public static void FoutGegevens() {
        System.out.println("Sorry probeer het opnieuw je wordt vanzelf doorgestuurd naar de menu");
        Menu.getInstance().menu();
    }

    public void Inloggen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goedendag, wat is je naam werknemer");
        naam = scanner.nextLine();
        System.out.println("Voer je code in");
        code = scanner.nextInt();
    }

    public void Uitloggen() {
        Inloggen();
    }
}





