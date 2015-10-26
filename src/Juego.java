import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by Vipi on 23/10/2015.
 */
public class Juego {
    public GRect CrearCuerda(){
        GRect cuerda=new GRect(600,2);
        cuerda.setFilled(true);
        cuerda.setFillColor(Color.BLUE);
        cuerda.setLocation(300,245);
        return(cuerda);
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

    public int SumarFuerza(Equip equip){
        int fuerza =0;
        for(int i =0;i<20;i++){//TODO recorrer lista
            fuerza = fuerza+1;
        }
        int FuerzaTotal=fuerza;
        return FuerzaTotal;
    }



}

