
import java.awt.*;

public class ClaseB extends ClasePral{

    public ClaseB() {
    	super(Color.yellow);
    }
    
    public void dibujar(Graphics g){
    	g.setColor(color);
    	g.fillRect(x, y, width, height);
    }
    
    public int getPosicionX(){
    	return x;
    }
    
        public int getPosicionY(){
    	return y;
    }
    
}