import java.util.Scanner;

public class Menu {
    private static Menu instance = new Menu();

    private Menu(){}

    public static Menu getInstance() {
        return instance;
    }


    public void menu() {
        Scanner scanner = new Scanner(System.in);
        Salaris oproepen = new Salaris();
        Gegevens gegevens = new Gegevens(922982,2982792);
        Medewerker oproepen1 = new Medewerker("Lisa", 8222,20.50,gegevens);
        Uitloggen oproepen2 = new Uitloggen();
        Inloggen oproepen3 = new Inloggen();
        System.out.println("Goedendag, kies uit 1/2/3 of 4");
        System.out.println();
        System.out.println();
        System.out.println("(1).Inklokken");
        System.out.println();
        System.out.println("(2).Uitklokken");
        System.out.println();
        System.out.println("(3). Werknemer toevoegen");
        System.out.println();
        System.out.println("(4). Salaris overzicht");
        int antwoord = scanner.nextInt();

        if (antwoord == 1) {
            oproepen3.Kloksysteem();


        }
        if (antwoord == 2) {
            oproepen2.Kloksysteem();

        }
       if (antwoord == 3) {
            oproepen1.werknemerToevoegen();

        }
        if (antwoord == 4){
            oproepen3.checkwerknemer();


        }

        }
    }
