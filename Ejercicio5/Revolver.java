import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Revolver {
    private int posicionActual;
    private int posicionBala;

    public Revolver() {
        this.posicionActual = 0;
        this.posicionBala = new Random().nextInt(6);
    }

    public boolean disparar() {
        return this.posicionActual == this.posicionBala;
    }

    public void siguienteBala() {
        this.posicionActual = (this.posicionActual + 1) % 6; 
    }

    public void mostrar() {
        System.out.println("Posición actual: " + this.posicionActual);
        System.out.println("Posición de la bala: " + this.posicionBala);
    }
}

class Jugador {
    private int ID;
    private String nombre;
    private boolean vivo;

    public Jugador(int ID) {
        this.ID = ID;
        this.nombre = "Jugador " + ID;
        this.vivo = true;
    }

    public void disparar(Revolver r) {
        if (r.disparar()) {
            this.vivo = false;
            System.out.println(this.nombre + " se ha disparado y ha muerto.");
        } else {
            System.out.println(this.nombre + " se ha disparado y sigue vivo.");
        }
    }

    public boolean estaVivo() {
        return vivo;
    }
}

class Juego {
    private List<Jugador> jugadores;
    private Revolver revolver;

    public Juego(int numJugadores) {
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6; 
        }

        jugadores = new ArrayList<>();
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        revolver = new Revolver();
    }

    public boolean finJuego() {
        for (Jugador jugador : jugadores) {
            if (!jugador.estaVivo()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (Jugador jugador : jugadores) {
            if (!finJuego()) {
                jugador.disparar(revolver);
                revolver.siguienteBala();
            } else {
                break;
            }
        }
    }
}