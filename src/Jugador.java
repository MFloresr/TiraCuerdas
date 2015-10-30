import acm.graphics.GImage;
import acm.graphics.GRectangle;

import java.awt.*;


public class Jugador {

    private int fuerza;
    private GImage imagen;


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
    public GRectangle getPosiscion(){
        return imagen.getBounds();
    }

}
