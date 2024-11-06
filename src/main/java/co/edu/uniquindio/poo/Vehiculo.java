package co.edu.uniquindio.poo;

public class Vehiculo {
    // Clase base común para todos los vehículos
    public String marca;
    public boolean esNuevo;
    public String modelo;
    public int cambios;
    public int velocidadMaxima;
    public int cilindraje;
    public int numeroPasajeros;
    public int numeroPuertas;
    public boolean aireAcondicionado;
    public boolean camaraReversa;
    public int numeroBolsasAire;
    public boolean tieneABS;

    // Constructor
    public Vehiculo(String marca, boolean esNuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
                    int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado, boolean camaraReversa, 
                    int numeroBolsasAire, boolean tieneABS) {
        this.marca = marca;
        this.esNuevo = esNuevo;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.tieneABS = tieneABS;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isTieneABS() {
        return tieneABS;
    }

    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", esNuevo=" + esNuevo + ", modelo=" + modelo + ", cambios=" + cambios
                + ", velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", numeroPasajeros="
                + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", aireAcondicionado=" + aireAcondicionado
                + ", camaraReversa=" + camaraReversa + ", numeroBolsasAire=" + numeroBolsasAire + ", tieneABS="
                + tieneABS + ", getMarca()=" + getMarca() + ", isEsNuevo()=" + isEsNuevo() + ", getModelo()="
                + getModelo() + ", getCambios()=" + getCambios() + ", getVelocidadMaxima()=" + getVelocidadMaxima()
                + ", getCilindraje()=" + getCilindraje() + ", getNumeroPasajeros()=" + getNumeroPasajeros()
                + ", getNumeroPuertas()=" + getNumeroPuertas() + ", isAireAcondicionado()=" + isAireAcondicionado()
                + ", isCamaraReversa()=" + isCamaraReversa() + ", getNumeroBolsasAire()=" + getNumeroBolsasAire()
                + ", isTieneABS()=" + isTieneABS() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    

}

