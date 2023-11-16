class Estudiante {
    private String nombre;
    private int edad;
    private char sexo;
    private double calificacion;

    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public char getSexo() {
        return sexo;
    }
}
