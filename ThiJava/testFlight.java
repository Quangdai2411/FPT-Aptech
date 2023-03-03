package ThiJava;

public class testFlight {
    public static void main(String[] args) {
        Flight fl = new Flight(241, "Bac Ninh");
        System.out.println(fl.getNumber());
        System.out.println(fl.getDestination());
        fl.display();
    }
}
