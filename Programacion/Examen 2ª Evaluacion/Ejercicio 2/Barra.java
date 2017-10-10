package ExamenProgramacionEva2;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Barra extends Rectangle {

	public Barra(int posX, int posY, int ancho, int alto) {
		x = posX;
		y = posY;
		width = ancho;
		height = alto;
	}

	public void paint(Graphics g) {
		g.fillRect(x, y, width, height);
	}

	public void actualizar() {

	}
}