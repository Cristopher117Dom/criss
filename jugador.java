
package juego.cartas.com.juegocartas1;
import java.util.ArrayList;
import java.util.List;
import juego.cartas.com.juegocartas1.carta.Carta;
/**
 *
 * @author P14s
 */
public class jugador {
    public class Jugador {
    private String nombre;
    private List<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public void recibirCarta(Carta carta) {
        if (carta != null) {
            mano.add(carta);
        }
    }

    public void mostrarMano() {
        System.out.println("🃏 Mano de " + nombre + ":");
        for (Carta c : mano) {
            System.out.println("- " + c);
        }
    }

    public String getNombre() {
        return nombre;
    }
}
    
}
