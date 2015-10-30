import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.util.*;
import java.util.List;


public class Main extends GraphicsProgram {

    public void run(){

        setSize(1700,800);

        Juego juego= new Juego();
        add(juego.CrearLinea());

        Cuerda cuerda = new Cuerda();
        add(cuerda.CrearCuerda());

        List<Jugador> JugadoresEquipo1 = juego.getEquipo_izquierda();
        for(Jugador jugador: JugadoresEquipo1){
            add(jugador.getImagen());
        }

        List<Jugador> JugadoresEquipo2 = juego.getEquipo_derecha();
        for(Jugador jugador: JugadoresEquipo2){
            add(jugador.getImagen());
        }

        while(juego.JuegoFinalizado()==false){
            int ronda = juego.EstiraCorda();
            cuerda.MoverCuerda(cuerda.CrearCuerda());
            juego.moverEquipo(ronda,0);
            pause(230);
        }

    }
}
