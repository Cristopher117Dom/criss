
package juego.cartas.com.juegocartas1;

import java.util.Scanner;
import juego.cartas.com.juegocartas1.carta.Carta;

/**
 *
 * @author P14s
 */
public class maincartas {

    private static class Baraja {

        public Baraja() {
        }

        private void mezclar() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private String cartasRestantes() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private Carta repartirCarta() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }

    private static class Jugador {

        public Jugador(String nombre) {
        }

        private void mostrarMano() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private void recibirCarta(Carta carta) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Baraja baraja = new Baraja();
        baraja.mezclar();

        System.out.println("Bienvenido al Juego de Cartas");
        System.out.print("Ingrese el número de jugadores: ");
        int numJugadores = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Jugador[] jugadores = new Jugador[numJugadores];

        for (int i = 0; i < numJugadores; i++) {
            System.out.print("Nombre del jugador " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            jugadores[i] = new Jugador(nombre);
        }

        System.out.print("¿Cuántas cartas por jugador? ");
        int cartasPorJugador = sc.nextInt();

        // Repartir cartas
        for (int i = 0; i < cartasPorJugador; i++) {
            for (Jugador jugador : jugadores) {
                Carta carta = baraja.repartirCarta();
                jugador.recibirCarta(carta);
            }
        }

        // Mostrar manos
        for (Jugador jugador : jugadores) {
            jugador.mostrarMano();
            System.out.println();
        }

        System.out.println("Cartas restantes en la baraja: " + baraja.cartasRestantes());
        sc.close();
    }
}
    
}
