package co.edu.uniquindio.poo;

public class Usuario {
    private String Cedula;
    private String correo;
    private String contrasenia;

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    /**
     * public void trgistroDeUsuario(string cedula, Usuario usuario){
        if(usuario.getAdministrador == true) {
            Usuario usuarioprueba = new Usuario();

        }else {
            System.out.println("usuario no tiene permiso administrador");
        }

        }
    }
    **/
    public Usuario(String Cedula, String correo, String contrasenia){
    this.Cedula = Cedula;
    this.correo = correo;
    this.contrasenia = contrasenia;
}
public String getCedula() {
    return Cedula;
}
public void setCedula(String cedula) {
    Cedula = cedula;
}
public String getCorreo() {
    return correo;
}
public void setCorreo(String correo) {
    this.correo = correo;
}

}
