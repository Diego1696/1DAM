import java.awt.Graphics;
import java.awt.Event;
import java.awt.Image;
import java.awt.Color;
import java.applet.*;
import java.util.List;
import java.util.ArrayList;

public class Jugando extends Applet implements Runnable{
	public static final int NUMPELOTAS = 100;
	List<Pelota> pelotas;
	java.awt.Rectangle rectangulo;
	Image imagen;
	Graphics noseve;
    public void init() {
    	pelotas = new ArrayList<Pelota>();
    	for(int i=0; i<NUMPELOTAS; i++)
    		pelotas.add(new Pelota((int)(Math.random() * 550), (int)(Math.random() * 550), 10));
    	imagen = createImage(600, 600);
    	noseve = imagen.getGraphics();
    	rectangulo = new java.awt.Rectangle(75, 125, 150, 50);
    }
    
    
    public void paint(Graphics g){
    	noseve.setColor(Color.black);
    	noseve.fillRect(0, 0, 600, 600);
    	for(int i=0; i<pelotas.size(); i++)
    		pelotas.get(i).dibujar(noseve);
    	//noseve.setColor(Color.yellow);
    	//noseve.fillRect(rectangulo.x, rectangulo.y, rectangulo.width, rectangulo.height);
    	g.drawImage(imagen, 0, 0, this);
    }
    
    public void update(Graphics g){
    	paint(g);
    }

    
}