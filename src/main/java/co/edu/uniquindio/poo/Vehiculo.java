package co.edu.uniquindio.poo;

public class Vehiculo {
    // Clase base común para todos los vehículos
    public String Marca;
    public Nuevo nuevo;
    public String Modelo;
    public int Cambios;
    public int VelocidadMaxima;
    public int Cilindraje;
    public int NumeroPasajeros;
    public int NumeroPuertas;
    public AireAcondicionado aire;
    public CamaraReversa Camara;
    public int NumeroBolsasAire;
    public abs a;
    public Tiene4x4 es4x4;

    // Constructor
    public Vehiculo(String Marca, Nuevo nuevo, String Modelo, int Cambios, int VelocidadMaxima, int Cilindraje, 
                    int NumeroPasajeros, int NumeroPuertas, AireAcondicionado aire, CamaraReversa Camara, 
                    int NumeroBolsasAire, abs a,Tiene4x4 esTiene4x4) {
        this.Marca = Marca;
        this.nuevo = nuevo;
        this.Modelo = Modelo;
        this.Cambios = Cambios;
        this.VelocidadMaxima = VelocidadMaxima;
        this.Cilindraje = Cilindraje;
        this.NumeroPasajeros = NumeroPasajeros;
        this.NumeroPuertas = NumeroPuertas;
        this.Camara = Camara;
        this.aire = aire;
        this.NumeroBolsasAire = NumeroBolsasAire;
        this.a = a;
        this.es4x4 = esTiene4x4;
    }

    public Vehiculo(String Marca, Nuevo nuevo, String Modelo, int Cambios, int VelocidadMaxima, int Cilindraje, 
    int NumeroPasajeros, int NumeroPuertas, AireAcondicionado aire, CamaraReversa Camara, 
    int NumeroBolsasAire, abs a) {
        this.Marca = Marca;
        this.nuevo = nuevo;
        this.Modelo = Modelo;
        this.Cambios = Cambios;
        this.VelocidadMaxima = VelocidadMaxima;
        this.Cilindraje = Cilindraje;
        this.NumeroPasajeros = NumeroPasajeros;
        this.NumeroPuertas = NumeroPuertas;
        this.Camara = Camara;
        this.aire = aire;
        this.NumeroBolsasAire = NumeroBolsasAire;
        this.a = a;

    }
    
    public Vehiculo(String marca, Nuevo nuevo, String modelo, int cambios, int velocidadMaxima, int cilindraje, 
    AireAcondicionado aire, abs a){
        this.Marca = marca;
        this.nuevo = nuevo;
        this.Modelo = modelo;
        this.Cambios = cambios;
        this.VelocidadMaxima = velocidadMaxima;
        this.Cilindraje = cilindraje;
        this.aire = aire;
        this.a=a;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
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

    public int getNumeroBolsasAire() {
        return NumeroBolsasAire;
    }

    public void setNumeroBolsasAire(int NumeroBolsasAire) {
        this.NumeroBolsasAire = NumeroBolsasAire;
    }

    public abs isTieneABS() {
        return a;
    }

    public void setTieneABS(abs ABS) {
        this.a = ABS;
    }

    @Override
    public String toString() {
        return "Especificaciones del vehiculo: Marca=" + Marca + ", es Nuevo=" + nuevo + ", Modelo=" + Modelo + ", Cambios=" + Cambios
                + ", velocidad Maxima=" + VelocidadMaxima + ", Cilindraje=" + Cilindraje + ", numero de Pasajeros="
                + NumeroPasajeros + ", numero de Puertas=" + NumeroPuertas + ", aire Acondicionado=" + aire
                + ", camara Reversa=" + Camara + ", numero BolsasAire=" + NumeroBolsasAire + ", tiene ABS="
                + a;
    }
    
}

