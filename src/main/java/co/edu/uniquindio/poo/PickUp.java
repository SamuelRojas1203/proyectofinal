package co.edu.uniquindio.poo;
public class PickUp extends Vehiculo {
        private int capacidadCajaCarga;
        /*
         * meta 4x4 a vehiculo
         */
        private boolean es4x4;
    
        public PickUp(String marca, Nuevo nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                      int numeroPasajeros, int numeroPuertas, AireAcondicionado aire, CamaraReversa Camara, 
                      int numeroBolsasAire, abs ABS, int capacidadCajaCarga, boolean es4x4) {
            super(marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
                  aire, Camara, numeroBolsasAire, ABS);
            this.capacidadCajaCarga = capacidadCajaCarga;
            this.es4x4 = es4x4;
        }

        public int getCapacidadCajaCarga() {
            return capacidadCajaCarga;
        }

        public void setCapacidadCajaCarga(int capacidadCajaCarga) {
            this.capacidadCajaCarga = capacidadCajaCarga;
        }

        public boolean isEs4x4() {
            return es4x4;
        }

        public void setEs4x4(boolean es4x4) {
            this.es4x4 = es4x4;
        }
    }
    
    

