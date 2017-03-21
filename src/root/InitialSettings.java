package root;

import pantallas.InicialInterface;
import pantallas.Inicio;
import setup.PSettings;

public class InitialSettings extends PSettings {

    public void settings() {

    app.size(1200,700);

    }


    public void setup() {
        pantallaInicial = new Inicio();
        interfazInicial = new InicialInterface();
    }

}
