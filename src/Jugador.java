import acm.graphics.GImage;
import acm.graphics.GRectangle;
import java.util.Random;


public class Jugador {

    private int fuerza;
    private GImage imagen;
    private Random rand=new Random();

    public Jugador(GImage imagen){
        this.imagen=imagen;
        fuerza = rand.nextInt(20)+10;

    }


    public int getFuerza() {
        return fuerza;
    }
    public final int setFuerza() {
        fuerza = (int)(Math.random()*(20)+1);
        return fuerza;
    }


    public GImage getImagen() {
        return imagen;
    }
    public GRectangle getPosiscion(){
        return imagen.getBounds();
    }

}
