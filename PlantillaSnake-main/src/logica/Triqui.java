
package logica;


public class Triqui {
    
    private Celda tablero[][];
    private boolean turnoJugador; // jugador que tiene prelación en la jugada. true = jugador 1 (x), false= jugador 2 (O)

    public Triqui() {
        tablero = new Celda[3][3];
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                tablero[f][c] = new Celda();
            }
        }
        turnoJugador = true; // empieza el jugador 1 (X)
    }

    public Celda[][] getTablero() {
        return tablero;
    }

    public boolean isTurnoJugador() {
        return turnoJugador;
    }
    
    
    public void limpiarTablero(){
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                tablero[f][c].setDato(Celda.CELDA_VACIA);
            }
        }        
    }
    
    public void jugar(int f, int c) throws JugadaInvalidaException{
        if(tablero[f][c].getDato() == Celda.CELDA_VACIA){
            if(turnoJugador){
                tablero[f][c].setDato(Celda.CELDA_X);
            }else{
                tablero[f][c].setDato(Celda.CELDA_O);
            }
            verificarJugada(f, c);
            turnoJugador = !turnoJugador; // cambio de turno
        }else{
            throw new JugadaInvalidaException();
        }        
    }

    protected void verificarJugada(int f, int c) {
        
        
    }
    
    
}
