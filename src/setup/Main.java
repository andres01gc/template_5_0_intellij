package setup;

import processing.core.PApplet;
import root.InitialSettings;
import setup.Logica;
import setup.Pantalla;
import setup.ProcessingEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main extends PApplet {
    public static List<ProcessingEvent> processingEvents;
    private Logica logica;
    private static InitialSettings settings;

    // metodo para poder exportarse como una aplicacion, NO TOCAR
    static public void main(String[] passedArgs) {
        PApplet.main("setup.Main");
        processingEvents = Collections.synchronizedList(new ArrayList<ProcessingEvent>());
    }

    public void settings() {
        InitialSettings.app = this;
        Pantalla.app = this;

        settings = new InitialSettings();
        settings.settings();
    }


    /**
     * Configuraciones directas de processing con su lienzo.
     */

    public void setup() {
        settings.setup();
        logica = new Logica(this);
    }

    public void draw() {
        logica.pintar();
    }

    public void mousePressed() {
        for (ProcessingEvent p : processingEvents) {
            p.mousePressed();
        }
        logica.mousePressed();
    }

    public void mouseReleased() {
        for (ProcessingEvent p : processingEvents) {
            p.mouseReleased();
        }
        logica.mouseReleased();
    }

    public void mouseDragged() {
        for (ProcessingEvent p : processingEvents) {
            p.mouseDragged();
        }
        logica.mouseDragged();
    }

    public void keyPressed() {
        for (ProcessingEvent p : processingEvents) {
            p.keyPressed();
        }
        logica.keyPressed();
    }

}
