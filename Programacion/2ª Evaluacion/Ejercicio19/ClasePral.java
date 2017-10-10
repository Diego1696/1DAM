
import java.awt.*;
public abstract class ClasePral extends Rectangle{
	Color color;
    public ClasePral(Color color) {
    	super((int)(Math.random() * 250), (int)(Math.random() * 250), 10, 10);
    	this.color = color;
    }
    public abstract void dibujar(Graphics g); //Obligamos a implementar el método dibujar en sus subclases.
}