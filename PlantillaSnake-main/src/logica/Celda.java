
package logica;


public class Celda {
    
    public static final char CELDA_VACIA = ' ';
    public static final char CELDA_X = 'X';
    public static final char CELDA_O = 'O';
    
    private char dato;

    public Celda() {
        dato = Celda.CELDA_VACIA;
    }
    
    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }
    
    
}
