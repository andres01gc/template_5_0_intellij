package pantallas;

import info.Info;
import setup.Pantalla;

/**
 * Created by andre on 3/9/2017.
 */

public class Inicio extends Pantalla {
    private int t;
    private float vibra = 10;

    @Override
    public void iniciar() {
        Info.getInstance().loadPprincipal();

    }

    @Override
    public void pintar() {
        app.rect(100, 100, 500, 500);
    }

    @Override
    public void finalizar() {

    }

    
}
