import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.util.*;
import java.util.List;


public class Main extends GraphicsProgram {

    public void run(){

        setSize(1300,600);

        Juego juego= new Juego();
        add(juego.CrearLinea());

        Cuerda cuerda = new Cuerda();
        add(cuerda.ValoresCuerda());

        List<Jugador> JugadoresEquipo1 = juego.getEquipo_izquierda();
        for(Jugador jugador: JugadoresEquipo1){
            add(jugador.getImagen());
        }

        List<Jugador> JugadoresEquipo2 = juego.getEquipo_derecha();
        for(Jugador jugador: JugadoresEquipo2){
            add(jugador.getImagen());
        }

        while(juego.comparachoque()!=true){

            //int ronda = juego.EstiraCorda();
            juego.ComparaForza();
            juego.moverEquipo();
            pause(230);

            for(int i=0;i<JugadoresEquipo1.size();i++){
                JugadoresEquipo1.get(i).setFuerza();
            }
            for(int i=0;i<JugadoresEquipo2.size();i++){
                JugadoresEquipo2.get(i).setFuerza();
            }
        }

    }
}
