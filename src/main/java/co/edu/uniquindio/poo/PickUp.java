package co.edu.uniquindio.poo;
public class PickUp extends Vehiculo {
        private int capacidadCajaCarga;
        private boolean es4x4;
    
        public PickUp(String marca, boolean esNuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                      int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa, 
                      int numeroBolsasAire, boolean tieneABS, int capacidadCajaCarga, boolean es4x4) {
            super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
                  aireAcondicionado, camaraReversa, numeroBolsasAire, tieneABS);
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
    
    

