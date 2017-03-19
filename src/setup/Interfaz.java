package setup;

/**
 * Esta clase se encarga de tneer todos los metdoso necesarios para una
 * pantalla. cualquiera que herede de esta, se podr� visualizar. todas, puenden
 * observar y ser hilos.
 *
 * @author Personal
 */

public abstract class Interfaz extends Pantalla {
    protected abstract void iniciar(Pantalla currentPantalla);

    @Override
    public void iniciar() {

    }
}
