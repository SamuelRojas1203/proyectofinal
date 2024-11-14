package co.edu.uniquindio.poo;
    public class Suv extends Vehiculo {
        private int capacidadMaletero;
        private boolean sensoresColision;
        private boolean sensorTraficoCruzado;
        private boolean asistentePermanenciaCarril;
        private boolean es4x4;
    
        public Suv(String marca, boolean esNuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                         int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa, 
                         int numeroBolsasAire, boolean tieneABS, int capacidadMaletero, boolean sensoresColision, 
                         boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril, boolean es4x4) {
            super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
                  aireAcondicionado, camaraReversa, numeroBolsasAire, tieneABS);
            this.capacidadMaletero = capacidadMaletero;
            this.sensoresColision = sensoresColision;
            this.sensorTraficoCruzado = sensorTraficoCruzado;
            this.asistentePermanenciaCarril = asistentePermanenciaCarril;
            this.es4x4 = es4x4;
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

        public boolean isEs4x4() {
            return es4x4;
        }

        public void setEs4x4(boolean es4x4) {
            this.es4x4 = es4x4;
        }

        @Override
        public String toString() {
            return "Suv [capacidadMaletero=" + capacidadMaletero + ", marca=" + marca + ", sensoresColision="
                    + sensoresColision + ", esNuevo=" + esNuevo + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                    + ", modelo=" + modelo + ", cambios=" + cambios + ", asistentePermanenciaCarril="
                    + asistentePermanenciaCarril + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje
                    + ", es4x4=" + es4x4 + ", numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas
                    + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                    + ", numeroBolsasAire=" + numeroBolsasAire + ", tieneABS=" + tieneABS;
        }
        
    }
    
    

