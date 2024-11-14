package co.edu.uniquindio.poo;

public class Vehiculo {
    // Clase base común para todos los vehículos
    public String Marca;
    public boolean Nuevo;
    public String Modelo;
    public int Cambios;
    public int VelocidadMaxima;
    public int Cilindraje;
    public int NumeroPasajeros;
    public int NumeroPuertas;
    public boolean AireAcondicionado;
    public boolean CamaraReversa;
    public int NumeroBolsasAire;
    public boolean ABS;

    // Constructor
    public Vehiculo(String Marca, boolean Nuevo, String Modelo, int Cambios, int VelocidadMaxima, int Cilindraje, 
                    int NumeroPasajeros, int NumeroPuertas, boolean AireAcondicionado, boolean CamaraReversa, 
                    int NumeroBolsasAire, boolean ABS) {
        this.Marca = Marca;
        this.Nuevo = Nuevo;
        this.Modelo = Modelo;
        this.Cambios = Cambios;
        this.VelocidadMaxima = VelocidadMaxima;
        this.Cilindraje = Cilindraje;
        this.NumeroPasajeros = NumeroPasajeros;
        this.NumeroPuertas = NumeroPuertas;
        this.AireAcondicionado = AireAcondicionado;
        this.CamaraReversa = CamaraReversa;
        this.NumeroBolsasAire = NumeroBolsasAire;
        this.ABS = ABS;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public boolean isNuevo() {
        return Nuevo;
    }

    public void setNuevo(boolean Nuevo) {
        this.Nuevo = Nuevo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getCambios() {
        return Cambios;
    }

    public void setCambios(int Cambios) {
        this.Cambios = Cambios;
    }

    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    public void setVelocidadMaxima(int VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public int getNumeroPasajeros() {
        return NumeroPasajeros;
    }

    public void setNumeroPasajeros(int NumeroPasajeros) {
        this.NumeroPasajeros = NumeroPasajeros;
    }

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }

    public boolean isAireAcondicionado() {
        return AireAcondicionado;
    }

    public void setAireAcondicionado(boolean AireAcondicionado) {
        this.AireAcondicionado = AireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return CamaraReversa;
    }

    public void setCamaraReversa(boolean CamaraReversa) {
        this.CamaraReversa = CamaraReversa;
    }

    public int getNumeroBolsasAire() {
        return NumeroBolsasAire;
    }

    public void setNumeroBolsasAire(int NumeroBolsasAire) {
        this.NumeroBolsasAire = NumeroBolsasAire;
    }

    public boolean isTieneABS() {
        return ABS;
    }

    public void setTieneABS(boolean ABS) {
        this.ABS = ABS;
    }

    @Override
    public String toString() {
        return "Especificaciones del vehiculo: Marca=" + Marca + ", es Nuevo=" + Nuevo + ", Modelo=" + Modelo + ", Cambios=" + Cambios
                + ", velocidad Maxima=" + VelocidadMaxima + ", Cilindraje=" + Cilindraje + ", numero de Pasajeros="
                + NumeroPasajeros + ", numero de Puertas=" + NumeroPuertas + ", aire Acondicionado=" + AireAcondicionado
                + ", camara Reversa=" + CamaraReversa + ", numero BolsasAire=" + NumeroBolsasAire + ", tiene ABS="
                + ABS;
    }
    
}

