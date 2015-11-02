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
    private GLine linea;
    private Cuerda cuerda;

    public Juego(Cuerda cuerda){
        equipo_izquierda= new Equip(false);
        equipo_derecha= new Equip(true);
        this.cuerda=cuerda;

    }

    public List<Jugador> getEquipo_izquierda() {
        return equipo_izquierda.getJugadores();
    }

    public List<Jugador> getEquipo_derecha() {
        return equipo_derecha.getJugadores();
    }

    public final int ComparaForza(){
        int ganador=0;
        if (equipo_izquierda.SumarFuerza()>equipo_derecha.SumarFuerza()){
            ganador=1;
        }else if (equipo_derecha.SumarFuerza()>equipo_izquierda.SumarFuerza()){
            ganador= 2;
        }else if(equipo_derecha.SumarFuerza()==equipo_izquierda.SumarFuerza()){
            FuersasNuevas(equipo_derecha);
            FuersasNuevas(equipo_izquierda);

        }
        return ganador;
    }

    public void moverEquipo(){

        int ganador = ComparaForza();
        if (ganador==1){
            equipo_derecha.MoverJugadores(-5,0);
            equipo_izquierda.MoverJugadores(-5,0);
            cuerda.MoverCuerda(-5,0);

        }else if(ganador==2){
            equipo_derecha.MoverJugadores(5, 0);
            equipo_izquierda.MoverJugadores(5, 0);
            cuerda.MoverCuerda(5,0);
        }
    }

    public void FuersasNuevas(Equip equipo){
        for (int i =0;i<equipo.getJugadores().size();i++){
            equipo.getJugadores().get(i).setFuerza();
        }
    }

    public GLine CrearLinea() {
        linea= new GLine(650,0,650,600);
        return linea;
    }

    public boolean comparachoque(){
        boolean chocado=false;
        for(int i=0;i<getEquipo_derecha().size();i++){
            Jugador jugadorEquipoizquierda = getEquipo_izquierda().get(i);
            Jugador jugadorEquipoderecha = getEquipo_derecha().get(i);
            if(jugadorEquipoderecha.getPosiscion().intersects(CrearLinea().getBounds())){
                chocado=true;
            }else if (jugadorEquipoizquierda.getPosiscion().intersects(CrearLinea().getBounds())){
                chocado=true;
            }
        }
        return chocado;
    }

}

