import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by Vipi on 23/10/2015.
 */
public class Cuerda{
    GRect cuerda;

    public Cuerda(int an, int al ){
        cuerda=new GRect(an,al);
        cuerda.setFilled(true);
        cuerda.setFillColor(Color.BLUE);
        cuerda.setLocation(550,299);
    }

    public GRect getCuerda(){
     return cuerda;
    }

    public void MoverCuerda(int x,int y){
        cuerda.move(x, y);
    }
}
