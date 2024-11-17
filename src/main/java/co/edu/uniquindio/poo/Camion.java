package co.edu.uniquindio.poo;
    public class Camion extends Vehiculo {
        private int capacidadCarga;
        private FrenosAire frenosAire;
        private int numeroEjes;
        private String tipoCamion;
    
        public Camion(String marca, Nuevo nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                      AireAcondicionado aire, abs a, int capacidadCarga, FrenosAire frenosAire, int numeroEjes, 
                      String tipoCamion) {
            super(marca, nuevo, modelo, cambios, velocidadMaxima, cilindraje, aire, a);
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

        public FrenosAire getFrenosAire() {
            return frenosAire;
        }

        public void setFrenosAire(FrenosAire frenosAire) {
            this.frenosAire = frenosAire;
        }
        
    }
