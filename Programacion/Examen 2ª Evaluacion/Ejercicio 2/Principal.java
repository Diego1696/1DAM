package ExamenProgramacionEva2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import Intersects.Pelota;

public class Principal extends Applet implements Runnable {
	public static final int NUMPELOTAS = 100;
	public static final int DERECHA = 0;
	public static final int IZQUIERDA = 1;
	List<Pelota> pelotas;
	Rectangle rectangulo;
	Thread animacion;
	Image imagen;
	Graphics ver;
	Color color;
	Barra barra;

	public void init() {
		imagen = createImage(300, 300);

		pelotas = new ArrayList<Pelota>();
		for (int i = 0; i < NUMPELOTAS; i++)
			pelotas.add(new Pelota((int) (Math.random() * 250), (int) (Math.random() * 250), 10));

		barra = new Barra(0, 0, 0, 0);

		ver = imagen.getGraphics();

	}

	public void start() {
		animacion = new Thread(this);
		animacion.start();
	}

	public void paint(Graphics g) {
		ver.setColor(Color.black);
		ver.fillRect(0, 0, 500, 500);

		for (int i = 0; i < pelotas.size(); i++)
			pelotas.get(i).dibujar(ver);

		ver.setColor(Color.white);
		barra.paint(ver);

		if (pelotas.size() == 0) {
			ver.setColor(Color.red);
			ver.drawString("Has ganado", 110, 150);
		}

		g.drawImage(imagen, 0, 0, this);

	}

	public void update(Graphics g) {
		paint(g);
	}

	public boolean mouseMove(Event ev, int x, int y) {
		barra = new Barra(x, y, 20, 20);
		barra.actualizar();
		return true;
	}

	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < pelotas.size(); i++) {
				pelotas.get(i).actualizar();
				if (pelotas.get(i).intersects(barra))
					animacion.stop();
				boolean true;
			}
			repaint();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}