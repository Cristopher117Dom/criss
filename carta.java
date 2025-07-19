
package juego.cartas.com.juegocartas1;

/**
 *
 * @author P14s
 */
public class carta {
    public class Carta {
    private final String palo;
    private final String valor;

    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}

    
}
