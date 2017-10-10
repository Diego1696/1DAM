import java.awt.*;

public class Pelota extends Rectangle{
	Color colores[] = {Color.red, Color.orange, Color.green, Color.yellow, Color.magenta, Color.blue};
	Color color;
    public Pelota(int posX, int posY, int anchura) {
    	x = posX; 
    	y = posY;
    	width = anchura;
    	height = anchura;
    	this.color = colores[(int)(Math.random() * colores.length)];
    }
    
    public void dibujar(Graphics g){
	    	g.setColor(color);
    		g.fillOval(x, y, width, height);
    }
    
}