import java.util.Random;


class Profesor {
    private String nombre;
    private int edad;
    private char sexo;
    private String asignatura;
    private double disponibilidad;

    public Profesor(String nombre, int edad, char sexo, String asignatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.asignatura = asignatura;
        this.disponibilidad = new Random().nextDouble();
    }

    public boolean estaDisponible() {
        return disponibilidad > 0.2; 
    }

    public String getAsignatura() {
        return asignatura;
    }
}

