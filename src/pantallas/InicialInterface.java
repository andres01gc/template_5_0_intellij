package pantallas;

import setup.Interfaz;
import setup.Pantalla;

import java.util.Observable;
import java.util.Observer;

public class InicialInterface extends Interfaz {


    @Override
    protected void iniciar(Pantalla currentPantalla) {


    }

    @Override
    public void pintar() {

        app.ellipse(500,500,500,500);

    }

    @Override
    public void finalizar() {

    }

}
