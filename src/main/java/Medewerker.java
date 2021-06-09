import java.util.ArrayList;
import java.util.Scanner;

public class Medewerker extends Werkkracht {
    Werkkracht nieuweMedewerker;
    public static ArrayList<Werkkracht> medewerker = new ArrayList<>();

    Medewerker(String naam, Integer code, Double uurloon, Integer bsn, int telefoonnummer) {
        super(naam, code, uurloon, bsn, telefoonnummer);
    }



    public void werknemerToevoegen() {
        Scanner scanner = new Scanner(System.in);
        //ToevoegingMedewerker();
        Menu menu = new Menu();
        System.out.println("Goedendag wat is u naam?");
        String naam = scanner.nextLine();
        System.out.println("Voer u code in");
        int code = scanner.nextInt();
        for (Werkkracht i : Werkgever.werkgevers) {
            boolean check = false;
            if (i.getNaam().equals(naam) && code == i.getCode()) {
                check = true;
                System.out.println("Welkom");
                System.out.println("Wat is de naam van de nieuwe werknemer");
                scanner.nextLine();
                String naam1 = scanner.nextLine();
                System.out.println();
                System.out.println("Voer zijn/haar bsn in");
                int bsn = scanner.nextInt();
                System.out.println("Wat is zijn/haar uurloon?");
                double uurloon = scanner.nextDouble();
                System.out.println("Voer zijn/haar telefoonnummer in");
                int telefoonnummer = scanner.nextInt();
                nieuweMedewerker = new Werkkracht(naam1, getNewCode(), uurloon, bsn, telefoonnummer);
                medewerker.add(new Werkkracht(naam1, getNewCode(), uurloon, bsn, telefoonnummer));
                System.out.println("Medewerker succesvol toegevoegd " + medewerker);
                menu.menu();
            }
            if(!check){
                System.out.println("Sorry je staat niet in ons systeem. Je wordt doorgestuurd naar de menu");
            }
        }
    }
}
