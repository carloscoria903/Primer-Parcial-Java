import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingresoTeclado = new Scanner(System.in);
        Persona persona = new Persona("", 0, "", 0);
        Alumno alumno = new Alumno("", 0, "", "", 0, 0);
        Usuarios usuario = new Usuarios("",0, "", 0, "", "", "");

        System.out.println("ingrese su nombre ");
        String nombre = ingresoTeclado.nextLine();
        persona.setNombre(nombre);

        System.out.println("ingrese su apellido ");
        String apellido = ingresoTeclado.nextLine();
        persona.setApellido(apellido);

        System.out.println("ingrese su DNI ");
        int dni = ingresoTeclado.nextInt();
        persona.setDNI(dni);
        ingresoTeclado.nextLine();

        System.out.println("ingrese su legajo");
        int legajo = ingresoTeclado.nextInt();
        alumno.setLegajo(legajo);
        ingresoTeclado.nextLine();

        System.out.println("ingrese su cargo ");
        String cargo = ingresoTeclado.nextLine();
        usuario.setCargo(cargo);

        if(!usuario.getCargo().equalsIgnoreCase("director")){
            System.out.println("ingrese su curso ");
            String curso = ingresoTeclado.nextLine();
            alumno.setCurso(curso);
        }

        if(usuario.getCargo().equalsIgnoreCase("director")){
            System.out.println("usted tiene acceso al sistema ");
            try {
                System.out.println("ingrese su usuario ");
                System.out.println("**recuerde que debe ingresar minimo 6 caracteres**" );
                String usua = ingresoTeclado.nextLine();

                if(usua.length() < 6){
                    throw new Excepciones("el nombre del usuario debe tener al menos 6 caracteres");
                }
                usuario.setUsuario(usua);
                System.out.println("usuario correcto");

            }catch (Excepciones excepciones){
                System.out.println("error " + excepciones.getMessage());

            }

        }else {
            System.out.println("--------------------------");
            System.out.println("no tiene acceso al sistema");
            System.out.println("--------------------------");
        }

        System.out.println("\n");
        System.out.println("----------------------------------------------------------");
        System.out.println("su nombre es " + persona.getNombre() + " y su apellido es " + persona.getApellido());
        System.out.println("----------------------------------------------------------");
        System.out.println("--------------------------");
        System.out.println("dni: " + persona.getDNI());
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println("numero de legajo: " + alumno.getLegajo());
        System.out.println("--------------------------");
        System.out.println("su cargo es: " + usuario.getCargo());
        System.out.println("--------------------------");

        if(!usuario.getCargo().equalsIgnoreCase("director")){
            System.out.println("----------------------------------");
            System.out.println("el alumno pertenece al curso: " + alumno.getCurso());
            System.out.println("-----------------------------------");
        }

        if(usuario.getCargo().equalsIgnoreCase("director")){
            System.out.println("--------------------------");
            System.out.println("su usuario es " + usuario.getUsuario());
            System.out.println("--------------------------");
        }

        }
    }