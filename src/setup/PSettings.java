package setup;

import processing.core.PApplet;

/**
 * Created by andre on 3/18/2017.
 */
public abstract class PSettings {
    public static PApplet app;

    public static Pantalla pantallaInicial;
    public static Interfaz interfazInicial;

    public abstract void settings();

    public abstract void setup();


    public static Pantalla getPantallaInicial() {
        return pantallaInicial;
    }


    public static Interfaz getInterfazInicial() {
        return interfazInicial;
    }
}
