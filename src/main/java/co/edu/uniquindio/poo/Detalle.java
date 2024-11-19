package co.edu.uniquindio.poo;

public class Detalle {
    private String tipoTransaccion; // Compra, Venta, Alquiler
    private Vehiculo vehiculo;
    private Cliente cliente;

    public Detalle(String tipoTransaccion, Vehiculo vehiculo, Cliente cliente) {
        this.tipoTransaccion = tipoTransaccion;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
        
    }

    @Override
    public String toString() {
        return "Detalle [tipoTransaccion=" + tipoTransaccion + ", vehiculo=" + vehiculo + ", cliente=" + cliente + "]";
    }

   
    }
