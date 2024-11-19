package co.edu.uniquindio.poo;

public class Cliente {
    private String cedula;
    private String nombre;
    private String correo;
    private String contrasenia;

    // Constructor
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;

    }

    public Cliente(String cedula, String nombre, String correo, String contrasenia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String telefono) {
        this.contrasenia = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                (correo != null ? ", correo='" + correo + '\'' : "") +
                (contrasenia != null ? ", telefono='" + contrasenia + '\'' : "") +
                '}';
    }
}
