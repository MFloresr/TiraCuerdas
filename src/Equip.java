import acm.graphics.GImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vipi on 23/10/2015.
 */
public class Equip {

    private List<Jugador> jugadores =new ArrayList<Jugador>();
    private int fuerzaTotal=0;
    private GImage imagen;


    public Equip(final boolean derecha){
        String nombreEquipo="Mario's TEAM";
        String nombreImagen="imagenes/E2C.png";
        int inicio=470;
        int modificador = -1;
        if(derecha==true){
            nombreEquipo="Vipi's TEAM";
            nombreImagen="imagenes/Johhny.png";
            inicio=750;
            modificador = 1;
        }
        for(int i=0;i<5;i++){

            imagen = new GImage(nombreImagen, (i*81*modificador)+inicio, 260);
            imagen.setSize(80,60);
            Jugador jugador = new Jugador(imagen);
            jugadores.add(jugador);
        }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public int SumarFuerza(){
        for(int i=0 ;i<jugadores.size();i++){
            fuerzaTotal=fuerzaTotal+jugadores.get(i).getFuerza();
        }
        return fuerzaTotal;
    }

    public final void MoverJugadores(int x,int y){
        for (Jugador jugador: jugadores){
            jugador.getImagen().move(x,y);
        }
    }
}
