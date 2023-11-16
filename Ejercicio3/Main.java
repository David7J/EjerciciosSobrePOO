import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Profesor Ejemplo", 35, 'M', "Ingeniería de Software");
        Aula aula = new Aula(1, 30, "Ingeniería de Software", profesor);

        for (int i = 0; i < 30; i++) {
            String nombreEstudiante = "Estudiante " + i;
            int edadEstudiante = new Random().nextInt(10) + 18;
            char sexoEstudiante = (i % 2 == 0) ? 'M' : 'F'; 
            double calificacionEstudiante = new Random().nextDouble() * 10; 

            Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, sexoEstudiante, calificacionEstudiante);
            aula.agregarEstudiante(estudiante);
        }

        if (aula.sePuedeDarClase()) {
            System.out.println("Se puede dar clase en el aula.");
            aula.mostrarAprobados();
        } else {
            System.out.println("No se puede dar clase en el aula en estas condiciones.");
        }
    }
}