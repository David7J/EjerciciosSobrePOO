public class App2 {
    public static void main(String[] args) {
        int numJugadores = 6; 
        Juego juego = new Juego(numJugadores);

        while (!juego.finJuego()) {
            juego.ronda();
        }
    }
}