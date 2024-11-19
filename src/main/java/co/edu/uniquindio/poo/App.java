package co.edu.uniquindio.poo;
public class App {
    public static void main(String[] args) {
         {
            Empleado empleado = new Empleado("12345", "empleado@correo.com", "password", "miSecreta");
    
            //* Crear vehículos y clientes
            Vehiculo vehiculo1 = new Vehiculo("Toyota", Nuevo.SI, "2023", 6, 180, 2000, AireAcondicionado.SI, abs.SI);
            Vehiculo vehiculo2 = new Vehiculo("Mazda", Nuevo.NO, "2021", 5, 170, 1800, AireAcondicionado.NO, abs.NO);
            Cliente cliente1 = new Cliente("98765", "Juan Pérez");
            Cliente cliente2 = new Cliente("87654", "Ana Gómez");
    
            // Registrar vehículos y clientes
            empleado.registrarVehiculo(vehiculo1);
            empleado.registrarVehiculo(vehiculo2);
            empleado.registrarCliente(cliente1);
            empleado.registrarCliente(cliente2);
    
            // Realizar transacciones
            empleado.alquilarVehiculo(cliente1, vehiculo1);
            empleado.venderVehiculo(cliente2, vehiculo2);
    
            // Mostrar información
            empleado.mostrarVehiculos();
            empleado.mostrarClientes();
            empleado.mostrarTransacciones();

             // *Crear un administrador
        Administrador administrador = new Administrador("12345", "admin@correo.com", "admin123", "secreta");

        // Crear empleados
        Empleado empleado1 = new Empleado("11111", "empleado1@correo.com", "pass1", "secret1");
        Empleado empleado2 = new Empleado("22222", "empleado2@correo.com", "pass2", "secret2");

        // Registrar empleados
        administrador.registrarEmpleado(empleado1);
        administrador.registrarEmpleado(empleado2);

        // Mostrar empleados registrados
        administrador.mostrarEmpleados();

        // Crear transacciones
        Vehiculo vehiculo = new Vehiculo("Toyota", Nuevo.SI, "2023", 6, 180, 2000, AireAcondicionado.SI, abs.SI);
        Cliente cliente = new Cliente("98765", "Juan Pérez");
        Detalle detalle = new Detalle("Venta", vehiculo, cliente);

        // Registrar transacción
        administrador.registrarTransaccion(detalle);

        // Generar reporte de transacciones
        administrador.generarReporte("98765");

        // Bloquear un empleado
        administrador.bloquearEmpleado("11111");
        administrador.mostrarEmpleados();

          // Crear clientes
          Cliente clienteA = new Cliente("123456", "Carlos Pérez");
          Cliente clienteB = new Cliente("789012", "Ana Gómez", "ana.gomez@example.com", "3123456789");
  
          // Mostrar información de los clientes
          System.out.println(clienteA);
          System.out.println(clienteB);
  
          // Actualizar información del cliente
          clienteA.setCorreo("carlos.perez@example.com");
          clienteA.setContrasenia("3001234567");
  
          // Mostrar información actualizada
          System.out.println(clienteA);
    }
        }
    }
    
    
