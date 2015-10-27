import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vipi on 23/10/2015.
 */
public class Equip {

    private static final String NOMBRE_POR_DEFECTO = "Equip";
    private static final String CANTIDAD_JUGADORS= "5";
    private String nombre;
    private List<Jugador> jugadores;
    private int fuerzaTotal=0;


    public Equip(final String nombre,boolean derecha){
        if(nombre==null){
            this.nombre=nombre;
        }else{
            this.nombre=NOMBRE_POR_DEFECTO;
        }


        int pocioninicial=500;

        if(derecha==true){
            pocioninicial= 800;

        }
        jugadores = new ArrayList<Jugador>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public final void AlistarEquipo(final Jugador jugador){
        if(jugador !=null){
            jugadores.add(jugador);
        }
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public int SumarFuerza(List<Jugador> jugadores){
        for(int i=0 ;i<jugadores.size();i++){
            int fuerzaTotal=jugadores.get(i).getFuerza();
        }
        return fuerzaTotal;
    }


}
