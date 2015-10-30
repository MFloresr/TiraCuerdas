import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by Vipi on 23/10/2015.
 */
public class Cuerda{
    GRect cuerda;

    public Cuerda(){
    }
    public GRect ValoresCuerda(){
        GRect cuerda=new GRect(200,3);
        cuerda.setFilled(true);
        cuerda.setFillColor(Color.BLUE);
        cuerda.setLocation(550,299);
        return cuerda;
    }

    public void MoverCuerda(int x,int y){
        cuerda.move(x, y);
        cuerda.move(2,5);
    }
}
