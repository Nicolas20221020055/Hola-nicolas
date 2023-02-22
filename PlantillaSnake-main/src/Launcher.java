
import presentacion.Modelo;


public class Launcher {

    ////// prueba nicaolas
    private Modelo miApp;
    
    public static void main(String[] args) {
        new Launcher();        
    }
    public Launcher() {
        miApp = new Modelo();
        miApp.iniciar();
    }
    
    
}
