package Busqueda;

public class Main {
	public static void main(String[] args) {

		
		
		int vector[]= {15,68,8,984,68,564,86,73,11,35,-8,98,947,48};
		
		
		Busqueda busqueda= new Busqueda();
		
		
		busqueda.busqueda_binaria(vector, 15);
		busqueda.busqueda_secuencial(vector, 68);
	}

}
