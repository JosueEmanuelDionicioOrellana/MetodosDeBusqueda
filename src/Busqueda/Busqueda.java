package Busqueda;

public class Busqueda {
	
	//Desarrolle un programa en java en el cual se implemente los métodos de búsqueda binaria y el método secuencial o lineal
	
	public int  busqueda_binaria(int arreglo[], int elemento){
		int centro,primero,ultimo, valorcentro;
		primero=0;
		ultimo = arreglo.length -1;
		while(primero<=ultimo) {
			centro=(primero + ultimo)/2;
			valorcentro=arreglo[centro];
			System.out.println("Comparando a "+ elemento+ " con " + arreglo[centro]);
			
			if(elemento==valorcentro) {
				return centro;
			}else if(elemento<valorcentro) {
				ultimo=centro-1;
			}else {
				ultimo=centro+1;
			}
			}
		return -1;
		
	}
	
	
	
	public int busqueda_secuencial(int arreglo[], int elemento) {
		
		for(int i=0; i<arreglo.length; i++) {
			if(elemento==arreglo[i]) {
				
				System.out.println("Se encontro en la posicion No. " +i);
				return i;
			}
		}
		
		return -1;
		
	}

}
