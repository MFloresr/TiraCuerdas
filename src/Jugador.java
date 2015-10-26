import acm.graphics.GImage;

import java.awt.*;

/**
 * Created by Vipi on 23/10/2015.
 */
public class Jugador {

    private int fuerza;
    private GImage imagen;

    private static final String IMAGEN_POR_DEFECTO = "Johhny.png";
    //Cap a on mira la imatge. (1) Dreta (-1) Esquerra
    private int mirantA;

    public Jugador(){
        this(new GImage(IMAGEN_POR_DEFECTO).getImage());
    }




    

    public Jugador(int fuerza, GImage imagen){
        this.fuerza=fuerza;
        this.imagen=imagen;
    }
    public Jugador(GImage imagen){
        this.imagen=imagen;
    }
    public Jugador(){

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

}
