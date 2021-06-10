public class main {
    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        Werkgever werkgever1 = new Werkgever("Mohamed", 7654, 15.70, 876543567, 0623452345);
        werkgever1.ToevoegingMedewerker();
        menu.menu();

    }
}
