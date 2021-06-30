import java.time.LocalTime;
import java.util.Scanner;

abstract class UrenRegistratie {

    public abstract LocalTime Kloksysteem();


    public static void FoutGegevens() {
        System.out.println("Sorry probeer het opnieuw je wordt vanzelf doorgestuurd naar de menu");
        Menu.getInstance().menu();
    }
}





