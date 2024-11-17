package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int caballosDeFuerza;
    private double tiempo0a100;

    public Deportivo(String marca, Nuevo nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                     int numeroPasajeros, int numeroPuertas, AireAcondicionado aire, CamaraReversa Camara, 
                     int numeroBolsasAire, abs ABS, int caballosDeFuerza, double tiempo0a100) {
        super(marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
              aire, Camara, numeroBolsasAire, ABS);
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
