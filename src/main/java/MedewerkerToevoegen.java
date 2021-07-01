import java.util.Scanner;

public class MedewerkerToevoegen {
    Gegevens gegevens;
    Medewerker medewerker;
    Scanner scanner = new Scanner(System.in);

    public void GegevensToevoegen(String naamwerkner, int codewerknemer) {
        boolean check = false;
        for (int i = 0; i < Werkgever.werkgevers.size(); i++) {
            if (Werkgever.werkgevers.get(i).getNaam().equals(naamwerkner) && codewerknemer == Werkgever.werkgevers.get(i).getCode()) {
                check = true;
                System.out.println("Welkom");
                System.out.println("Wat is de naam van de nieuwe werknemer\r\n");
                String naam1 = scanner.nextLine();
                System.out.println("Voer zijn/haar bsn in");
                int bsn = scanner.nextInt();
                System.out.println("Wat is zijn/haar uurloon?");
                double uurloon = scanner.nextDouble();
                System.out.println("Voer zijn/haar telefoonnummer in");
                int telefoonnummer = scanner.nextInt();
                gegevens = new Gegevens(bsn, telefoonnummer);
                medewerker = new Medewerker(naam1, Medewerker.getNewCode(), uurloon, gegevens);
                Medewerker.medewerkerList.add(medewerker);
                System.out.println("Medewerker succesvol toegevoegd " + Medewerker.medewerkerList);
                Menu.getInstance().menu();
            }
            if (!check) {
                UrenRegistratie.FoutGegevens();
            }
        }

    }
}


