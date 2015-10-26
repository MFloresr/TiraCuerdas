import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;


public class Main extends GraphicsProgram {

    public void run(){

        setSize(1200,500);
        GOval oval = new GOval(40,40);
        oval.setLocation(10, 10);
        add(oval);
        GLine linia=new GLine(600,0,600,500);
        add(linia);
        Juego juego= new Juego();

        GRect cuerda = juego.CrearCuerda();
        add(cuerda);
        GImage imatge = new GImage("imagenes/E2C.png", 250, 200);
        imatge.scale(0.1);
        add(imatge);

        GImage imatge2 = new GImage("imagenes/Johhny.png", 700, 200);
        imatge2.scale(0.20);
        add(imatge2);


        juego.MoverCuerda(cuerda);



    }
}
