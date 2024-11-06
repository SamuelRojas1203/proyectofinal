package co.edu.uniquindio.poo;
    public class Camion extends Vehiculo {
        private int capacidadCarga;
        private boolean frenosAire;
        private int numeroEjes;
        private String tipoCamion;
    
        public Camion(String marca, boolean esNuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                      boolean aireAcondicionado, boolean tieneABS, int capacidadCarga, boolean frenosAire, int numeroEjes, 
                      String tipoCamion) {
            super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, 0, 0, aireAcondicionado, false, 0, tieneABS);
            this.capacidadCarga = capacidadCarga;
            this.frenosAire = frenosAire;
            this.numeroEjes = numeroEjes;
            this.tipoCamion = tipoCamion;
        }

        public int getCapacidadCarga() {
            return capacidadCarga;
        }

        public void setCapacidadCarga(int capacidadCarga) {
            this.capacidadCarga = capacidadCarga;
        }

        public boolean isFrenosAire() {
            return frenosAire;
        }

        public void setFrenosAire(boolean frenosAire) {
            this.frenosAire = frenosAire;
        }

        public int getNumeroEjes() {
            return numeroEjes;
        }

        public void setNumeroEjes(int numeroEjes) {
            this.numeroEjes = numeroEjes;
        }

        public String getTipoCamion() {
            return tipoCamion;
        }

        public void setTipoCamion(String tipoCamion) {
            this.tipoCamion = tipoCamion;
        }
    }
