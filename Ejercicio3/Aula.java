import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Aula {
    private int identificador;
    private int maxEstudiantes;
    private String asignaturaDestinada;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Aula(int identificador, int maxEstudiantes, String asignaturaDestinada, Profesor profesor) {
        this.identificador = identificador;
        this.maxEstudiantes = maxEstudiantes;
        this.asignaturaDestinada = asignaturaDestinada;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < maxEstudiantes) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("El aula está llena, no se pueden agregar más estudiantes.");
        }
    }

    public boolean sePuedeDarClase() {
        int totalEstudiantes = estudiantes.size();
        long estudiantesPresentes = estudiantes.stream()
                .filter(e -> e.getCalificacion() >= 5.0) 
                .count();
        
        return profesor.estaDisponible() && profesor.getAsignatura().equals(asignaturaDestinada)
                && estudiantesPresentes > (0.5 * totalEstudiantes);
    }

    public void mostrarAprobados() {
        long aprobados = estudiantes.stream()
                .filter(e -> e.getCalificacion() >= 5.0)
                .count();

        long aprobadas = estudiantes.stream()
                .filter(e -> e.getCalificacion() >= 5.0 && e.getSexo() == 'F')
                .count();

        System.out.println("Número de estudiantes aprobados: " + aprobados);
        System.out.println("Número de estudiantes aprobadas: " + aprobadas);
    }
}