import acm.graphics.GImage;
import acm.graphics.GRectangle;

import java.awt.*;

/**
 * Created by Vipi on 23/10/2015.
 */
public class Jugador {

    private int fuerza;
    private GImage imagen;

    private static final String IMAGEN_POR_DEFECTO = "Johhny.png";



    public Jugador(int fuerza, GImage imagen){
        this.fuerza=fuerza;
        this.imagen=imagen;
    }
    public Jugador(GImage imagen){
        this.imagen=imagen;
        fuerza= (int)(Math.random()*(20)+1);
    }


    public int getFuerza() {
        return fuerza;
    }

    public final int setFuerza() {
        fuerza = (int)(Math.random()*(20)+1);
        return fuerza;
    }

    public void setImagen(String imagen) {
    }
    public GImage getImagen() {
        return imagen;
    }

    public void MoverJugador(int x, int y){
        imagen.move(x,y);
    }

    public GRectangle getPosiscion(){
        return imagen.getBounds();
    }

}
