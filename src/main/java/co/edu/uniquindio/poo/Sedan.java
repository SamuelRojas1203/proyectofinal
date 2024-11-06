package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
        private int capacidadMaletero;
        private boolean velocidadCrucero;
        private boolean sensoresColision;
        private boolean sensorTraficoCruzado;
        private boolean asistentePermanenciaCarril;
    
        public Sedan(String marca, boolean esNuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                     int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa, 
                     int numeroBolsasAire, boolean tieneABS, int capacidadMaletero, boolean velocidadCrucero, 
                     boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril) {
            super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, numeroPasajeros, numeroPuertas, 
                  aireAcondicionado, camaraReversa, numeroBolsasAire, tieneABS);
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

        public boolean isVelocidadCrucero() {
            return velocidadCrucero;
        }

        public void setVelocidadCrucero(boolean velocidadCrucero) {
            this.velocidadCrucero = velocidadCrucero;
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
    public String mensaje(Sedan sedan) {
        String mensaje = sedan.getMarca() + "\n" +
                sedan.getModelo() + "\n" +
                sedan.getCambios() + "\n" +
                sedan.getVelocidadMaxima() + "\n" +
                sedan.getCilindraje() + "\n" +
                sedan.getNumeroPasajeros() + "\n" +
                sedan.getNumeroPuertas() + "\n" +
                sedan.getCapacidadMaletero() + "\n" +
                sedan.isAireAcondicionado() + "\n" +
                sedan.isCamaraReversa() + "\n" +
                sedan.getNumeroBolsasAire() + "\n" +
                sedan.isTieneABS() + "\n" +
                sedan.isVelocidadCrucero() + "\n" +
                sedan.isSensoresColision() + "\n" +
                sedan.isSensorTraficoCruzado() + "\n" +
                sedan.isAsistentePermanenciaCarril();
        return mensaje;
    }

    @Override
    public String toString() {
        return "Sedan [capacidadMaletero=" + capacidadMaletero + ", marca=" + marca + ", velocidadCrucero="
                + velocidadCrucero + ", esNuevo=" + esNuevo + ", sensoresColision=" + sensoresColision + ", modelo="
                + modelo + ", cambios=" + cambios + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje
                + ", asistentePermanenciaCarril=" + asistentePermanenciaCarril + ", numeroPasajeros=" + numeroPasajeros
                + ", numeroPuertas=" + numeroPuertas + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa="
                + camaraReversa + ", numeroBolsasAire=" + numeroBolsasAire + ", tieneABS=" + tieneABS
                + ", getCapacidadMaletero()=" + getCapacidadMaletero() + ", getMarca()=" + getMarca() + ", isEsNuevo()="
                + isEsNuevo() + ", isVelocidadCrucero()=" + isVelocidadCrucero() + ", getModelo()=" + getModelo()
                + ", getCambios()=" + getCambios() + ", isSensoresColision()=" + isSensoresColision()
                + ", getVelocidadMaxima()=" + getVelocidadMaxima() + ", isSensorTraficoCruzado()="
                + isSensorTraficoCruzado() + ", getCilindraje()=" + getCilindraje()
                + ", isAsistentePermanenciaCarril()=" + isAsistentePermanenciaCarril() + ", getNumeroPasajeros()="
                + getNumeroPasajeros() + ", getNumeroPuertas()=" + getNumeroPuertas() + ", isAireAcondicionado()="
                + isAireAcondicionado() + ", isCamaraReversa()=" + isCamaraReversa() + ", getNumeroBolsasAire()="
                + getNumeroBolsasAire() + ", isTieneABS()=" + isTieneABS() + "]";
    }

    



}
