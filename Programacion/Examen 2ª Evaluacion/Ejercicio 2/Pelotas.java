package ExamenProgramacionEva2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelotas extends Rectangle {
	Color color;
	int velX, velY;
	boolean visible = true;
	Color colores[] = { Color.blue, Color.gray, Color.green };

	public Pelotas(int posX, int posY, int anchura) {
		posX = x;
		posY = y;
		width = anchura;
		height = anchura;
		this.color = colores[(int) (Math.random() * colores.length)];
		velX = (int) ((Math.random() * 11) - 5);
		velY = (int) ((Math.random() * 11) - 5);

	}

	public void dibujar(Graphics g) {
		if (visible) {
			g.setColor(color);
			g.fillOval(x, y, width, height);
		}
	}

	public void actualizar() {
		x += velX;
		y += velY;
		if ((x >= 500) || (x <= 0))
			velX = -velX;
		if ((y >= 500) || (y <= 0))
			velY = -velY;
	}
}