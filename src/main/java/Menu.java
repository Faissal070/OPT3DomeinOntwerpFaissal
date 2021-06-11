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
        int antwoord = -1;
        menuTekst();
        antwoord = scanner.nextInt();
        while (antwoord != 5) {
            switch (antwoord) {
                case 1:
                    oproepen3.checkWerknemerInklokken();

                case 2:
                    oproepen2.checkWerknemerUitklokken();
                case 3:
                    oproepen1.InloggenWerkgever();
                case 4:
                oproepen3.checkwerknemerVoorSalaris();
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
