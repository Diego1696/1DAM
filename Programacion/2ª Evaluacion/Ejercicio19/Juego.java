
import java.awt.Graphics;
import java.applet.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.Image;
import java.awt.Color;

public class Juego extends Applet implements Runnable{
	public static final int CUANTOS = 100;
	public List<ClaseA> lista1;
	public List<ClaseB> lista2;
	Image imagen;
	Graphics noseve;
    public void init() {
    	lista1 = new ArrayList<ClaseA>();
    	lista2 = new ArrayList<ClaseB>();
    	for(int i=0; i<CUANTOS; i++)
    		lista1.add(new ClaseA());
    	lista2.add(new ClaseB());
    	imagen = createImage(300, 300);
    	noseve = imagen.getGraphics();
    }
     
    public void paint(Graphics g){
    	noseve.setColor(Color.black);
    	noseve.fillRect(0, 0, 300, 300);
    	for(int i=0; i<lista1.size(); i++)
    		lista1.get(i).dibujar(noseve);
    	for(int i=0; i<lista2.size(); i++)
    		lista2.get(i).dibujar(noseve);
    	g.drawImage(imagen, 0, 0, this);
    }

    public void update(Graphics g){
    	paint(g);
    }
    
    public void movimineto(){
    	if(ClaseB.getPosicionX(), ClaseB.getPosicionY() != mouse.move())
    }
   
}