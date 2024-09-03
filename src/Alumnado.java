public class Alumnado {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("coria", 34053499, "carlos", "segundo");
        System.out.println("el nombre del alumno es :" + alumno1.getNombre());
        System.out.println("el apellido del alumno es :" + alumno1.getApellido());
        System.out.println("el DNI del alumno es :" + alumno1.getDNI());
        System.out.println("el curso del alumno es :" + alumno1.getCurso());
        }
    }