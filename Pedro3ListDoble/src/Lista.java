import java.util.ArrayList;
import java.util.Collections;

public class Lista {
	Nodo primero, ultimo;
	int menor, mayor, mediana;
	
	//Lista doblemente enlazada
	
	public Lista() {
		primero=null;
		ultimo=null;
	}
	
	public void agregarNodo(int valor) {
		Nodo actual= new Nodo();
		actual.valor=valor;
		
		if(primero==null) {
			ultimo=actual;
			ultimo.siguiente=null;
			ultimo.anterior=null;
			primero=ultimo;
		}else {
			ultimo.siguiente=actual;
			actual.anterior=ultimo;
			actual.siguiente=null;
			ultimo=actual;
		}
	}
	
	public void ordenarLista() {
		ArrayList vector= new ArrayList<>();
		Nodo aux= new Nodo();
		aux=primero;
		
		while(aux!=null) {
			vector.add(aux.valor);
			aux=aux.siguiente;
		}
		Collections.sort(vector);
		menor=(int) vector.get(0);
		mayor=(int) vector.get(vector.size()-1);
		int mitad= vector.size()/2;
		
		if(vector.size()%2==0) {
			int dato1=(int) vector.get(mitad-1);
			int dato2=(int) vector.get(mitad);
			mediana= (dato1+dato2)/2;
		}else {
			mediana=(int) vector.get(mitad);
		}
	}
	
	public int getMenor() {
		return menor;
	}
	
	public int getMayor() {
		return mayor;
	}
	
	public int getMediana() {
		return mediana;
	}

}
