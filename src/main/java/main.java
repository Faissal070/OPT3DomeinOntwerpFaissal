public class main {
    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        Gegevens gegevens = new Gegevens(92220, 8272972);
        Werkgever werkgever1 = new Werkgever("Mohamed", 7654,50.50, gegevens);
        werkgever1.ToevoegingMedewerker();
        menu.menu();

    }
}
