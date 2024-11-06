package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int caballosDeFuerza;
    private double tiempo0a100;

    public Deportivo(String marca, boolean esNuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                     int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa, 
                     int numeroBolsasAire, boolean tieneABS, int caballosDeFuerza, double tiempo0a100) {
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
              aireAcondicionado, camaraReversa, numeroBolsasAire, tieneABS);
        this.caballosDeFuerza = caballosDeFuerza;
        this.tiempo0a100 = tiempo0a100;
        
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public double getTiempo0a100() {
        return tiempo0a100;
    }

    public void setTiempo0a100(double tiempo0a100) {
        this.tiempo0a100 = tiempo0a100;
    }
}
