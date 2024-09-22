public class Alumno extends Persona{

    private String curso;
    private int legajo;

    public Alumno(String apellido, int DNI, String nombre, String curso, int legajo, int edad) {
        super(apellido, DNI, nombre, edad);
        this.curso = curso;
        this.legajo = legajo;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
}
