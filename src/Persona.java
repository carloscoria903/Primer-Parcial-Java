public class Persona {
    private String nombre;
    private String apellido;
    private int DNI;

    public Persona(String apellido, int DNI, String nombre) {
        this.apellido = apellido;
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
