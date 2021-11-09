
public class Lista {

	private Nodo primero, ultimo,actual;

	public Lista() {
		primero = null;
		ultimo = null;
		actual = new Nodo();
	}

	public void nuevoNodo(int numero) {
		Nodo nuevo = new Nodo();
		nuevo.valor = numero;

		if (primero == null) {
			primero = nuevo;
			primero.siguiente = primero;
			nuevo.anterior = ultimo;
			ultimo = nuevo;
			actual = primero;
		} else {
			ultimo.siguiente = nuevo;
			nuevo.siguiente = primero;
			nuevo.anterior = ultimo;
			ultimo = nuevo;
			primero.anterior = ultimo;
		}
	}

	public void recorrer(String car) {
		
		if (car.equals("d")) {
			actual = actual.siguiente;
			System.out.println(actual.valor);
		}
		if (car.equals("a")) {
			actual = actual.anterior;
			System.out.println(actual.valor);
		}

	}

}
