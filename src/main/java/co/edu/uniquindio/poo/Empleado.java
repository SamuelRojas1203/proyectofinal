package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Usuario {
    // Listas para almacenar vehículos, clientes y transacciones
    private List<Vehiculo> vehiculos;
    private List<Cliente> clientes;
    private List<Detalle> detalles;

    // Constructor
    public Empleado(String Cedula, String Correo, String Contrasenia, String PalabraSecreta) {
        super(Cedula, Correo, Contrasenia, PalabraSecreta);
        this.vehiculos = new ArrayList<>(); // Inicialización de las listas
        this.clientes = new ArrayList<>();
        this.detalles = new ArrayList<>();
    }

    // Registrar un vehículo
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado: " + vehiculo.getMarca() + " - Modelo: " + vehiculo.getModelo());
    }

    // Registrar un cliente
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente.getNombre());
    }

    // Alquilar un vehículo a un cliente
    public void alquilarVehiculo(Cliente cliente, Vehiculo vehiculo) {
        if (!vehiculos.contains(vehiculo)) {
            System.out.println("El vehículo no está disponible.");
            return;
        }
        Detalle detalle = new Detalle("Alquiler", vehiculo, cliente);
        detalles.add(detalle);
        System.out.println("Vehículo alquilado: " + vehiculo.getMarca() + " al cliente: " + cliente.getNombre());
    }

    // Vender un vehículo a un cliente
    public void venderVehiculo(Cliente cliente, Vehiculo vehiculo) {
        if (!vehiculos.contains(vehiculo)) {
            System.out.println("El vehículo no está disponible.");
            return;
        }
        vehiculos.remove(vehiculo);
        Detalle detalle = new Detalle("Venta", vehiculo, cliente);
        detalles.add(detalle);
        System.out.println("Vehículo vendido: " + vehiculo.getMarca() + " al cliente: " + cliente.getNombre());
    }

    // Comprar un vehículo
    public void comprarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo comprado: " + vehiculo.toString());
    }

    // Mostrar todos los vehículos
    public void mostrarVehiculos() {
        System.out.println("Lista de vehículos disponibles:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }
    }

    // Mostrar todos los clientes
    public void mostrarClientes() {
        System.out.println("Lista de clientes registrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombre());
        }
    }

    // Mostrar todas las transacciones realizadas
    public void mostrarTransacciones() {
        System.out.println("Historial de transacciones:");
        for (Detalle detalle : detalles) {
            System.out.println(detalle.toString());
        }
    }
}
