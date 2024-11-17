package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
        private int capacidadMaletero;
        private VelocidadCrucero velocidadCrucero;
        private boolean sensoresColision;
        /**
         * sensorTrafico cruzado y sensores de colision metalo a vehiculo y que lo herede a suv y sedan
         */
        private boolean sensorTraficoCruzado;
        private boolean asistentePermanenciaCarril;
    
        public Sedan(String marca, Nuevo nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                     int numeroPasajeros, int numeroPuertas, AireAcondicionado aire, CamaraReversa camara, 
                     int numeroBolsasAire, abs ABS, int capacidadMaletero, VelocidadCrucero velocidadCrucero, 
                     boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril) {
            super(marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
                  aire, camara, numeroBolsasAire, ABS);
            this.capacidadMaletero = capacidadMaletero;
            this.velocidadCrucero = velocidadCrucero;
            this.sensoresColision = sensoresColision;
            this.sensorTraficoCruzado = sensorTraficoCruzado;
            this.asistentePermanenciaCarril = asistentePermanenciaCarril;
        }

        public int getCapacidadMaletero() {
            return capacidadMaletero;
        }

        public void setCapacidadMaletero(int capacidadMaletero) {
            this.capacidadMaletero = capacidadMaletero;
        }

        public boolean isSensoresColision() {
            return sensoresColision;
        }

        public void setSensoresColision(boolean sensoresColision) {
            this.sensoresColision = sensoresColision;
        }

        public boolean isSensorTraficoCruzado() {
            return sensorTraficoCruzado;
        }

        public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
            this.sensorTraficoCruzado = sensorTraficoCruzado;
        }

        public boolean isAsistentePermanenciaCarril() {
            return asistentePermanenciaCarril;
        }

        public void setAsistentePermanenciaCarril(boolean asistentePermanenciaCarril) {
            this.asistentePermanenciaCarril = asistentePermanenciaCarril;
        }

        @Override
        public String toString() {
            return "Sedan [capacidadMaletero=" + capacidadMaletero + ", velocidadCrucero=" + velocidadCrucero
                    + ", sensoresColision=" + sensoresColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                    + ", asistentePermanenciaCarril=" + asistentePermanenciaCarril + "]";
        }

        
        
}
