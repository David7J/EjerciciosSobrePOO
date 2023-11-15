public class Raices {
    private double a;
    private double b;
    private double c;

    
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private double calcularDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public void obtenerRaices() {
        double discriminante = calcularDiscriminante();
        
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            System.out.println("La ecuación tiene una única raíz.");
            obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }

    public void obtenerRaiz() {
        double discriminante = calcularDiscriminante();
        
        if (discriminante >= 0) {
            double raiz = -b / (2 * a);
            System.out.println("La única raíz es: " + raiz);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }

    public double mostrarDiscriminante() {
        return calcularDiscriminante();
    }

    public boolean tieneRaices() {
        return calcularDiscriminante() > 0;
    }

    public boolean tieneRaiz() {
        return calcularDiscriminante() == 0;
    }

    public void calcular() {
        obtenerRaices();
    }
}