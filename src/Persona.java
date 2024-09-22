public class Persona {
    private String nombre;
    private String apellido;

    private int DNI;
    private int edad;

    public Persona(String apellido, int DNI, String nombre, int edad) {
        this.apellido = apellido;
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
