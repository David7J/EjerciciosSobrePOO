public class App1 {
    public static void main(String[] args) {
        
        Raices ecuacion = new Raices(1, -3, 2); 

        ecuacion.calcular();

        double discriminante = ecuacion.mostrarDiscriminante();
        System.out.println("El discriminante es: " + discriminante);

        if (ecuacion.tieneRaices()) {
            System.out.println("La ecuación tiene dos raíces.");
        } else if (ecuacion.tieneRaiz()) {
            System.out.println("La ecuación tiene una única raíz.");
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}
