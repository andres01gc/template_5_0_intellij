package root;

import pantallas.InicialInterface;
import pantallas.Inicio;
import setup.PSettings;

public class InitialSettings extends PSettings {

    @Override
    public void settings() {
    app.size(1200,700);
    }


    @Override
    public void setup() {
        pantallaInicial = new Inicio();
        interfazInicial = new InicialInterface();
    }
}
