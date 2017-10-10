public class Casa { //clase publica casa//
	private int nPuertas, nVentanas; //varibales privadas
	String color; //string
    public Casa(int np, int nv, String col) { //metodo constructor 1 en el que puedes variar el color
    	nPuertas = np; 
    	nVentanas = nv;
    	color = col;
    }
    public Casa(int np, int nv) {
    	nPuertas = np;
    	nVentanas = nv;
    	color = "Blanco";
    }
    public void pintar(String co){
    	color = co;
    }
    public void pintar(){
    	color = "Blanco";
    }
    public int getPuertas(){
    	return nPuertas;
    }
    public void abrirPuerta(){
    	nPuertas++;
    }
    public void abrirPuertas(int np){
    	nPuertas += np;
    }
    public int getVentanas(){
    	return nVentanas;
    }
    public void abrirVentana(){
    	nVentanas++;
    }
    public void abrirVentanas(int nv){
    	nVentanas += nv;
    }
    public void cerrarVentanas(int nv){
    	nVentanas -= nv;
    	if(nVentanas < 0)
    		nVentanas = 0;
    }
    public void escribir(){
    	System.out.printf("Esta casa tiene %d puertas, %d ventanas y es de color %s\n", nPuertas, nVentanas, color);
    }
}