
package presentacion;


public class Modelo {
    
    private VistaPrincipal ventana;
    private Render motorDibujo;

    public Modelo() {
        motorDibujo = new Render(this);
    }

    
    public VistaPrincipal getVentana() {
        if(ventana == null){
            ventana = new VistaPrincipal(this);
        }
        return ventana;
    }
    
    
    
    public void iniciar(){
        getVentana().setTitle("Juego de Triqui");
        getVentana().setSize(600, 600);
        getVentana().setVisible(true);
        
        motorDibujo.start(); //empiece a dibujar
    }

   
}
