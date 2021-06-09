import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        Salaris oproepen = new Salaris();
        Medewerker oproepen1 = new Medewerker("Lisa", 8222,9.20,98272972,18282);
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
            oproepen3.Inklokken();


        }
        if (antwoord == 2) {
            oproepen2.Uitklokken();

        }
       if (antwoord == 3) {
            oproepen1.werknemerToevoegen();

        }
        if (antwoord == 4){
            oproepen.BerekenSalaris();


        }
    }
}
