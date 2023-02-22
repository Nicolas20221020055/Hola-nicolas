
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorPrincipal implements ActionListener{

    private VistaPrincipal ventana;
    private Modelo modelo;
    
    public ControladorPrincipal(VistaPrincipal aThis) {
        ventana = aThis;
        modelo = ventana.getModelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
