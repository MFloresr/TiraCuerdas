import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * Created by Vipi on 23/10/2015.
 */
public class Cuerda extends GraphicsProgram {

    private GRect cuerda;

    public Cuerda(){
    }
    public Cuerda(GRect cuerda){
        this.cuerda = cuerda;
    }
    public void setCuerda(int punt,int punt2) {
        cuerda = new GRect(punt,punt2);
    }

    public GRect getCuerda() {
        return cuerda;
    }
}
