import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Salaris oproepen = new Salaris();
    Gegevens gegevens = new Gegevens(922982,2982792);
    Medewerker oproepen1 = new Medewerker("Lisa", 8222,20.50,gegevens);
    Uitloggen oproepen2 = new Uitloggen();
    Inloggen oproepen3 = new Inloggen();

    private static Menu instance = new Menu();

    private Menu(){}

    public static Menu getInstance() {
        return instance;
    }


    public void menu() {
        menuTekst();
        int antwoord = scanner.nextInt();
        if (antwoord == 1) {
            oproepen3.checkWerknemerInklokken();
        }
        if (antwoord == 2) {
            oproepen2.checkWerknemerUitklokken();
        }
       if (antwoord == 3) {
            oproepen1.InloggenWerkgever();
        }
        if (antwoord == 4){
            oproepen3.checkwerknemer();
        }
    }

        public void menuTekst() {
            System.out.println("Goedendag, kies uit 1/2/3 of 4\r\n\n");
            System.out.println("(1).Inklokken\r\n");
            System.out.println("(2).Uitklokken\r\n");
            System.out.println("(3). Werknemer toevoegen\r\n");
            System.out.println("(4). Salaris overzicht");
        }
    }
