package co.edu.uniquindio.poo;
public class App {
    public static void main(String[] args) {

        Vehiculo sedan = new Sedan("Toyota", true, "2011", 2, 180, 2000, 5, 5, true, true, 5, true, 30, true, false, false, false);
       System.out.println( sedan.toString());
    }
}
