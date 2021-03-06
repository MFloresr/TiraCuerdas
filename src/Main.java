import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.util.*;
import java.util.List;


public class Main extends GraphicsProgram {

    public void run(){

        setSize(1300,600);


        Cuerda cuerda = new Cuerda(200,3);
        add(cuerda.getCuerda());

        Juego juego= new Juego(cuerda);
        add(juego.CrearLinea());

        List<Jugador> JugadoresEquipo1 = juego.getEquipo_izquierda();
        for(Jugador jugador: JugadoresEquipo1){
            add(jugador.getImagen());
        }

        List<Jugador> JugadoresEquipo2 = juego.getEquipo_derecha();
        for(Jugador jugador: JugadoresEquipo2){
            add(jugador.getImagen());
        }

        while(juego.comparachoque()!=true){

            juego.ComparaForza();
            juego.moverEquipo();
            pause(200);

            for(int i=0;i<JugadoresEquipo1.size();i++){
                JugadoresEquipo1.get(i).setFuerza();
            }
            for(int i=0;i<JugadoresEquipo2.size();i++){
                JugadoresEquipo2.get(i).setFuerza();
            }
        }

    }
}
