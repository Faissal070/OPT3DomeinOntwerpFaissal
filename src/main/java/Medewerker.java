import java.util.ArrayList;
import java.util.Scanner;

public class Medewerker extends Werkkracht {

    public static ArrayList<Medewerker> medewerker = new ArrayList<>();

    Medewerker(String naam, Integer code, Double uurloon, Gegevens gegevens) {
        super(naam, code, uurloon, gegevens);
    }







    public void werknemerToevoegen(String naam, int code) {
        Scanner scanner = new Scanner(System.in);
        for (Werkkracht i : Werkgever.werkgevers) {
            boolean check = false;
            if (i.getNaam().equals(naam) && code == i.getCode()) {
                check = true;
                GegevensToevoegen(scanner);
            }
            if(!check){
                Inloggen inloggen = new Inloggen();
                inloggen.Nietgelijkaan();
            }
        }
    }
    public void GegevensToevoegen(Scanner scanner){
        System.out.println("Welkom");
        System.out.println("Wat is de naam van de nieuwe werknemer\r\n");
        String naam1 = scanner.nextLine();
        System.out.println("Voer zijn/haar bsn in");
        int bsn = scanner.nextInt();
        System.out.println("Wat is zijn/haar uurloon?");
        double uurloon = scanner.nextDouble();
        System.out.println("Voer zijn/haar telefoonnummer in");
        int telefoonnummer = scanner.nextInt();
        Gegevens gegevens = new Gegevens( bsn, telefoonnummer);
        Medewerker nieuweMedewerker = new Medewerker(naam1, getNewCode(), uurloon, gegevens);
        medewerker.add(new Medewerker(naam1, getNewCode(), uurloon,gegevens));
        System.out.println("Medewerker succesvol toegevoegd " + medewerker);
        Menu.getInstance().menu();
    }
    public void InloggenWerkgever(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goedendag, wat is u naam (Werkgever) ?");
        String naamwerkgever = scanner.nextLine();
        System.out.println("Voer u viercijferige code in");
        int codewerkgever = scanner.nextInt();
        werknemerToevoegen(naamwerkgever,codewerkgever);
    }
}
