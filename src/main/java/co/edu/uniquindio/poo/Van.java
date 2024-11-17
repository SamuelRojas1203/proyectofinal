package co.edu.uniquindio.poo;
    public class Van extends Vehiculo {
        private int capacidadMaletero;
    
        public Van(String marca, Nuevo nuevo, String Modelo, int Cambios, int VelocidadMaxima, int cilindraje, 
                   int numeroPasajeros, int numeroPuertas, AireAcondicionado aire, CamaraReversa Camara, 
                   int numeroBolsasAire, abs a, int capacidadMaletero) {
            super(marca, nuevo, Modelo, Cambios, VelocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
                  aire, Camara, numeroBolsasAire, a);
            this.capacidadMaletero = capacidadMaletero;
        }

        public int getCapacidadMaletero() {
            return capacidadMaletero;
        }

        public void setCapacidadMaletero(int capacidadMaletero) {
            this.capacidadMaletero = capacidadMaletero;
        }
    }

