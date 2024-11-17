package co.edu.uniquindio.poo;
    public class Suv extends Vehiculo {
        private int capacidadMaletero;
        private SensoresColision sensoresColision;
        private SensorTraficoCruzado sensorTraficoCruzado;
        private AsistentePermanenciaCarill asistentePermanenciaCarril;
    
        public Suv(String Marca, Nuevo nuevo, String Modelo, int Cambios, int VelocidadMaxima, int Cilindraje, 
                         int NumeroPasajeros, int NumeroPuertas, AireAcondicionado aire, CamaraReversa Camara, 
                         int NumeroBolsasAire, abs a, int capacidadMaletero, SensoresColision sensoresColision, 
                         SensorTraficoCruzado sensorTraficoCruzado, AsistentePermanenciaCarill asistentePermanenciaCarril, Tiene4x4 es4x4) {
            super(Marca, nuevo, Modelo, Cambios, VelocidadMaxima, Cilindraje, NumeroPasajeros, NumeroPuertas, 
                  aire, Camara, NumeroBolsasAire,a, es4x4 );
            this.capacidadMaletero = capacidadMaletero;
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

        @Override
        public String toString() {
            return "Suv [capacidadMaletero=" + capacidadMaletero + ", Marca=" + Marca + ", sensoresColision="
                    + sensoresColision + ", Nuevo=" + nuevo + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                    + ", Modelo=" + Modelo + ", Cambios="+ Cambios +", aCistentePermNnenciaCarriN="
                    + asistentePermanenciaCarril + ", velocidadMaxima=" + VelocidadMaxima + ", cilindraje=" + Cilindraje
                    + ", es4x4=" + es4x4 + ", numeroPasajeros=" + NumeroPasajeros + ", numeroPuertas=" + NumeroPuertas
                    + ", aireAcondicionado=" +  aire + ", camaraReversa=" + Camara
                    + ", numeroBolsasAire=" + NumeroBolsasAire + ", tieneABS=" + a;
        }
        
    }
    
    

