package Frame;

import java.awt.Choice;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;

public class Ejercicio1 extends Frame {
	TextArea textArea;

	public static void main(String args[]) {
		Ejercicio1 fap = new Ejercicio1();
	}

	public Ejercicio1() {
		super("Trabajo con Objetos");
		setup();
		pack();
		resize(400, 400);
		show();
	}

	public void setup() {
		Panel principal = new Panel();
		principal.setLayout(new GridLayout(3, 3));
		Panel paneles[][];
		paneles = new Panel[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				paneles[i][j] = new Panel();
				paneles[i][j].setLayout(new FlowLayout(FlowLayout.LEFT));
			}

		paneles[0][0].add(new Label("Campo de texto: "));
		paneles[0][0].add(new MiTextField("", 15));

		paneles[1][0].add(new Label("Area de texto: "));
		textArea = new TextArea("Es un TextArea", 5, 15);
		paneles[1][0].add(textArea);

		String choiceStrings[] = { "Botón", "TextArea", "Canvas" };
		paneles[1][1].add(new Label("Desplegable: "));
		paneles[1][1].add(new MiChoice(choiceStrings, textArea));

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				principal.add(paneles[j][i]);

		this.add(principal);
	}

	public boolean handleEvent(Event ev) {
		if (ev.id == Event.WINDOW_DESTROY) {
			System.exit(0);
			return true;
		}
		return false;
	}
}

class MiTextField extends TextField {
	String tt;

	public MiTextField(String frase, int columnas) {
		super(frase, columnas);
	}

	public boolean action(Event ev, Object arg) {
		String texto = this.getText();
		this.setText(tt);
		return true;
	}
}

class MiChoice extends Choice {
	TextArea tt;

	public MiChoice(String[] elementos, TextArea t) {
		super();
		for (int i = 0; i < elementos.length; i++)
			this.addItem(elementos[i]);
		tt = t;
	}

	public boolean action(Event ev, Object arg) {
		tt.setText(this.getSelectedItem());
		return true;
	}
}

class MiScrollbar extends Scrollbar {
	TextArea tt;

	public MiScrollbar(int orientacion, int posicion, int anchura, int inicio, int fin, TextArea t) {
		super(orientacion, posicion, anchura, inicio, fin);
		tt = t;
	}

	public boolean handleEvent(Event ev) {
		if (ev.id == Event.SCROLL_LINE_UP) {
			tt.setText("Posicion: " + getValue());
		} else if (ev.id == Event.SCROLL_LINE_DOWN) {
			tt.setText("Posicion: " + getValue());
		} else if (ev.id == Event.SCROLL_PAGE_UP) {
			tt.setText("Posicion: " + getValue());
		} else if (ev.id == Event.SCROLL_PAGE_DOWN) {
			tt.setText("Posicion: " + getValue());
		} else if (ev.id == Event.SCROLL_ABSOLUTE) {
			tt.setText("Posicion: " + getValue());
		}
		return false;
	}
}