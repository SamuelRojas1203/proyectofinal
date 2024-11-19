package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
    private List<Empleado> empleados; // Lista para manejar empleados
    private List<Detalle> transacciones; // Lista para registrar transacciones

    // Constructor
    public Administrador(String Cedula, String Correo, String Contrasenia, String PalabraSecreta) {
        super(Cedula, Correo, Contrasenia, PalabraSecreta);
        this.empleados = new ArrayList<>(); // Inicializar la lista de empleados
        this.transacciones = new ArrayList<>(); // Inicializar la lista de transacciones
    }

    // Registrar un empleado
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado registrado: " + empleado.getCedula());
    }

    // Actualizar datos de un empleado
    public void actualizarEmpleado(String cedula, Empleado nuevosDatos) {
        for (Empleado empleado : empleados) {
            if (empleado.getCedula().equals(cedula)) {
                empleados.set(empleados.indexOf(empleado), nuevosDatos);
                System.out.println("Empleado actualizado: " + cedula);
                return;
            }
        }
        System.out.println("Empleado no encontrado con la cédula: " + cedula);
    }

    // Bloquear (eliminar) un empleado
    public void bloquearEmpleado(String cedula) {
        empleados.removeIf(empleado -> empleado.getCedula().equals(cedula));
        System.out.println("Empleado bloqueado (eliminado): " + cedula);
    }

    // Registrar una transacción realizada por un empleado
    public void registrarTransaccion(Detalle detalle) {
        transacciones.add(detalle);
        System.out.println("Transacción registrada: " + detalle.toString());
    }

    // Generar reporte de transacciones de un empleado
    public void generarReporte(String cedulaEmpleado) {
        System.out.println("Generando reporte para el empleado con cédula: " + cedulaEmpleado);
        for (Detalle detalle : transacciones) {
            if (detalle.getCliente().getCedula().equals(cedulaEmpleado)) {
                System.out.println(detalle.toString());
            }
        }
    }

    // Mostrar lista de empleados
    public void mostrarEmpleados() {
        System.out.println("Lista de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println("Cédula: " + empleado.getCedula() + ", Correo: " + empleado.getCorreo());
        }
    }
}
    
