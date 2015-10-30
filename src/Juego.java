import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Vipi on 23/10/2015.
 */
public class Juego {
    private Equip equipo_izquierda;
    private Equip equipo_derecha;
    GLine linea;

    public Juego(){
        equipo_izquierda= new Equip(false);
        equipo_derecha= new Equip(true);
    }

    public List<Jugador> getEquipo_izquierda() {
        return equipo_izquierda.getJugadores();
    }

    public List<Jugador> getEquipo_derecha() {
        return equipo_derecha.getJugadores();
    }

    public final int EstiraCorda(){
        int ganador = equipo_izquierda.SumarFuerza()-equipo_derecha.SumarFuerza();
        return ganador;
    }

    public void moverEquipo(int x ,int y ){
        equipo_izquierda.MoverJugadores(x,y);
        equipo_derecha.MoverJugadores(x,y);
    }

    public GLine CrearLinea() {
        linea= new GLine(850,0,850,800);
        return linea;
    }

    public boolean JuegoFinalizado(){
        boolean chocar=false;
        int i=0;
        while(i<getEquipo_izquierda().size()&&chocar==false){
            Jugador jugadorEquipoizquierda = getEquipo_izquierda().get(i);
            Jugador jugadorEquipoderecha = getEquipo_derecha().get(i);
            if (jugadorEquipoizquierda.getPosiscion().intersects(CrearLinea().getBounds())){
                chocar=true;
            }else if (jugadorEquipoderecha.getPosiscion().intersects(CrearLinea().getBounds())){
                chocar= true;
            }
            i++;
        }
        return chocar;
    }


}

