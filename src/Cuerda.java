import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by Vipi on 23/10/2015.
 */
public class Cuerda{

    GRect cuerda;


    public GRect CrearCuerda(){
        GRect cuerda=new GRect(400,3);
        cuerda.setFilled(true);
        cuerda.setFillColor(Color.BLUE);
        cuerda.setLocation(650,399);
        return cuerda;
    }


    public void moverCuerda(int x,int y){
        cuerda.move(x, y);
    }
    public void MoverCuerda(GRect cuerda){
        for(int i=0;i<1000;i++){
            int numrand = (int)(Math.random()* 2);
            if(numrand==0){
                cuerda.move(1,0);
                cuerda.pause(10);
            }else if (numrand==1){
                cuerda.move(-1,0);
                cuerda.pause(10);
            }

        }
    }
}
