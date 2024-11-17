package co.edu.uniquindio.poo;

public class Usuario {
    public String Cedula;
    public String Correo;
    public String Contrasenia;
    public String PalabraSecreta;

    public Usuario(){
        
    }

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

@Override
public String toString() {
    return "Usuario [Cedula=" + Cedula + ", Correo=" + Correo + ", Contrasenia=" + Contrasenia + ", PalabraSecreta="
            + PalabraSecreta + "]";
}

}
