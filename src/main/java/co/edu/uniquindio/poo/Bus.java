package co.edu.uniquindio.poo;
    public class Bus extends Vehiculo {
        private int capacidadMaletero;
        private int numeroEjes;
        private int numeroSalidasEmergencia;
    
        public Bus(String marca, boolean esNuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                   int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa, 
                   int numeroBolsasAire, boolean tieneABS, int capacidadMaletero, int numeroEjes, int numeroSalidasEmergencia) {
            super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
                  aireAcondicionado, camaraReversa, numeroBolsasAire, tieneABS);
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
            return "Bus{" +
                    "capacidadMaletero=" + capacidadMaletero +
                    ", numeroEjes=" + numeroEjes +
                    ", numeroSalidasEmergencia=" + numeroSalidasEmergencia +
                    ", marca='" + marca + '\'' +
                    ", esNuevo=" + esNuevo +
                    ", modelo='" + modelo + '\'' +
                    ", cambios=" + cambios +
                    ", velocidadMaxima=" + velocidadMaxima +
                    ", cilindraje=" + cilindraje +
                    ", numeroPasajeros=" + numeroPasajeros +
                    ", numeroPuertas=" + numeroPuertas +
                    ", aireAcondicionado=" + aireAcondicionado +
                    ", camaraReversa=" + camaraReversa +
                    ", numeroBolsasAire=" + numeroBolsasAire +
                    ", tieneABS=" + tieneABS +
                    '}';
        }
    }
