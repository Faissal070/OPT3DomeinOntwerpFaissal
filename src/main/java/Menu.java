import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    MedewerkerToevoegen werkgever = new MedewerkerToevoegen();
    Uitloggen uitloggen = new Uitloggen();
    Inloggen inloggen = new Inloggen();

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
                    inloggen.Inloggen();

                case 2:
                    uitloggen.Uitloggen();
                case 3:
                    werkgever.WerkgeverInloggen();
                case 4:
                    inloggen.InloggenSalaris();

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

}