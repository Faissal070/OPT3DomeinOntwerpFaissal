import java.util.Scanner;

public  class Menu {
    Scanner scanner = new Scanner(System.in);
    Salaris oproepen = new Salaris();
    Gegevens gegevens = new Gegevens(922982, 2982792);
    Medewerker oproepen1 = new Medewerker("Lisa", 8222, 20.50, gegevens);
    Uitloggen oproepen2 = new Uitloggen();
    Inloggen oproepen3 = new Inloggen();

    private static Menu instance = new Menu();

    private Menu() {
    }

    public static Menu getInstance() {
        return instance;
    }


    public void menu() {
        int antwoord = -1;
        menuTekst();
        antwoord = scanner.nextInt();
        while (antwoord != 5) {
            switch (antwoord) {
                case 1:
                    oproepen3.Kloksysteem();

                case 2:
                    oproepen2.checkWerknemerUitklokken();
                case 3:
                    InloggenWerkgever();
                case 4:
                    oproepen.checkwerknemerVoorSalaris();
            }
        }
    }


    public static void menuTekst() {
        System.out.println("Goedendag, kies uit 1/2/3 of 4\r\n\n");
        System.out.println("(1).Inklokken\r\n");
        System.out.println("(2).Uitklokken\r\n");
        System.out.println("(3). Werknemer toevoegen\r\n");
        System.out.println("(4). Salaris overzicht");
    }

    public void GegevensToevoegen(String naam, int code) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom");
        System.out.println("Wat is de naam van de nieuwe werknemer\r\n");
        String naam1 = scanner.nextLine();
        System.out.println("Voer zijn/haar bsn in");
        int bsn = scanner.nextInt();
        System.out.println("Wat is zijn/haar uurloon?");
        double uurloon = scanner.nextDouble();
        System.out.println("Voer zijn/haar telefoonnummer in");
        int telefoonnummer = scanner.nextInt();
        Gegevens gegevens = new Gegevens(bsn, telefoonnummer);
        Medewerker nieuweMedewerker = new Medewerker(naam1,oproepen1.getNewCode(), uurloon, gegevens);
        Medewerker.medewerker.add(new Medewerker(naam1, oproepen1.getNewCode(), uurloon, gegevens));
        System.out.println("Medewerker succesvol toegevoegd " + nieuweMedewerker);
        Menu.getInstance().menu();
    }

    public void InloggenWerkgever() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goedendag, wat is u naam (Werkgever) ?");
        String naamwerkgever = scanner.nextLine();
        System.out.println("Voer u viercijferige code in");
        int codewerkgever = scanner.nextInt();
        GegevensToevoegen(naamwerkgever, codewerkgever);

    }
}
