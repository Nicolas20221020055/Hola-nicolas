
package presentacion;

import java.awt.Canvas;
import java.awt.Graphics;


public class Render extends Thread{

    private Modelo modelo;
    private Canvas lienzo;
    private boolean dibujando;
    
    public Render(Modelo modelo) {
        this.modelo = modelo;  
        lienzo = modelo.getVentana().getLienzo();
        dibujando = true;
    }
        
    
    @Override
    public void run(){
        
        Graphics lapiz = lienzo.getGraphics();
        
        while(dibujando){
            dibujar(lapiz);
        }
    }

    private void dibujar(Graphics lapiz) {
        lapiz.drawRect(50, 50, 200, 200);
    }
    
}
