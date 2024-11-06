package co.edu.uniquindio.poo;
    public class Van extends Vehiculo {
        private int capacidadMaletero;
    
        public Van(String marca, boolean esNuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                   int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa, 
                   int numeroBolsasAire, boolean tieneABS, int capacidadMaletero) {
            super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
                  aireAcondicionado, camaraReversa, numeroBolsasAire, tieneABS);
            this.capacidadMaletero = capacidadMaletero;
        }

        public int getCapacidadMaletero() {
            return capacidadMaletero;
        }

        public void setCapacidadMaletero(int capacidadMaletero) {
            this.capacidadMaletero = capacidadMaletero;
        }
    }

