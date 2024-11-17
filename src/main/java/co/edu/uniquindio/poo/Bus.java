package co.edu.uniquindio.poo;
    public class Bus extends Vehiculo {
        private int capacidadMaletero;
        private int numeroEjes;
        private int numeroSalidasEmergencia;
    
        public Bus(String marca, Nuevo nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                   int numeroPasajeros, int numeroPuertas, AireAcondicionado aire, CamaraReversa Camara, 
                   int numeroBolsasAire, abs ABS, int capacidadMaletero, int numeroEjes, int numeroSalidasEmergencia) {
            super(marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
                  aire, Camara, numeroBolsasAire, ABS);
            this.capacidadMaletero = capacidadMaletero;
            this.numeroEjes = numeroEjes;
            this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        }

        public int getCapacidadMaletero() {
            return capacidadMaletero;
        }

        public void setCapacidadMaletero(int capacidadMaletero) {
            this.capacidadMaletero = capacidadMaletero;
        }

        public int getNumeroEjes() {
            return numeroEjes;
        }

        public void setNumeroEjes(int numeroEjes) {
            this.numeroEjes = numeroEjes;
        }

        public int getNumeroSalidasEmergencia() {
            return numeroSalidasEmergencia;
        }

        public void setNumeroSalidasEmergencia(int numeroSalidasEmergencia) {
            this.numeroSalidasEmergencia = numeroSalidasEmergencia;
        }

        @Override
        public String toString() {
            return "Bus [capacidadMaletero=" + capacidadMaletero + ", numeroEjes=" + numeroEjes
                    + ", numeroSalidasEmergencia=" + numeroSalidasEmergencia + "]";
        }

       
        }
    
