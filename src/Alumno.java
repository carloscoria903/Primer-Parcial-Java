public class Alumno extends Persona{

    private String curso;

    public Alumno(String apellido, int DNI, String nombre, String curso) {
        super(apellido, DNI, nombre);
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
