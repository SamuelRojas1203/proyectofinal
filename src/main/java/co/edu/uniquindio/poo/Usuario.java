package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String Cedula;
    private String Correo;
    private String Contrasenia;
    private String PalabraSecreta;

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
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
    public Usuario(String Cedula, String Correo, String Contrasenia, String PalabraSecreta){
    this.Cedula = Cedula;
    this.Correo = Correo;
    this.Contrasenia = Contrasenia;
    this.PalabraSecreta = PalabraSecreta;
    
}

public String getCedula() {
    return Cedula;
}
public void setCedula(String cedula) {
    Cedula = cedula;
}
public String getCorreo() {
    return Correo;
}
public void setCorreo(String Correo) {
    this.Correo = Correo;
}

public String getPalabraSecreta() {
    return PalabraSecreta;
}

public void setPalabraSecreta(String palabraSecreta) {
    PalabraSecreta = palabraSecreta;
}

}
