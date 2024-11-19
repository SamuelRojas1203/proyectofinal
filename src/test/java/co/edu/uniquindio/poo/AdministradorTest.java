package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AdministradorTest {
    private Administrador administrador;

    @BeforeEach
    public void setUp() {
        administrador = new Administrador("12345", "admin@correo.com", "admin123", "secreta");
    }
    @Test
    public void testRegistrarEmpleado() {
        // Crear y registrar un empleado
        Empleado empleado = new Empleado("11111", "empleado1@correo.com", "pass1", "secret1");
        administrador.registrarEmpleado(empleado);
    
        // Obtener el empleado registrado
        Empleado buscado = administrador.getEmpleado("11111");
        assertNotNull(buscado, "El empleado no debería ser nulo.");
        assertEquals("11111", buscado.getCedula());

    }

    @Test
    public void testGenerarReporte() {
        Vehiculo vehiculo = new Vehiculo("Toyota", Nuevo.SI, "2023", 6, 180, 2000, AireAcondicionado.SI, abs.SI);
        Cliente cliente = new Cliente("98765", "Juan Pérez");
        Detalle detalle = new Detalle("Venta", vehiculo, cliente);
        administrador.registrarTransaccion(detalle);

        administrador.generarReporte("98765");
        // Validación visual: asegurarse de que los datos correctos aparezcan en la consola.
        // Se pueden agregar pruebas adicionales con salidas capturadas, si es necesario.
    }
}