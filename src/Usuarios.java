public class Usuarios extends Persona{
    private String cargo;
    private String usuario;
    private String contrasenia;

    public Usuarios(String apellido, int DNI, String nombre, int edad, String cargo, String usuario, String contrasenia) {
        super(apellido, DNI, nombre, edad);
        this.cargo = cargo;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
