
package juego.cartas.com.juegocartas1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import juego.cartas.com.juegocartas1.carta.Carta;
/**
 *
 * @author P14s
 */
public class baraja {
    public class Baraja {
    private final List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] valores = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K", "A"
        };

        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new Carta(valor, palo));
            }
        }
    } 

    public void mezclar() {
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta() {
        if (cartas.isEmpty()) return null;
        return cartas.remove(0);
    }

    public int cartasRestantes() {
        return cartas.size();
    }
}

    
}
