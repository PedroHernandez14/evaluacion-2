import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lista {
	
	Nodo inicio;
	
	//Usando Lista simplemente enlazada.
	
	public void agregarNodo(Estudiante estudiante) {
		Nodo actual= new Nodo();
		actual.estudiante=estudiante;
		actual.siguiente=null;
		
		if(inicio== null) {
			inicio=actual;
		}else {
			Nodo temporal;
			temporal=inicio;
			while(temporal.siguiente!=null) {
				temporal= temporal.siguiente;
			}
			temporal.siguiente=actual;
		}
	}
	
	public void leerArchivo() throws IOException {
		Estudiante estd;
		BufferedReader bfr = new BufferedReader(new FileReader("C:\\estudiante.in"));
		System.out.println("Se cargo el archivo");
		String leerlinea= bfr.readLine();
		while(leerlinea!=null) {
			String[] separar=leerlinea.split("[$]");
			
			estd= new Estudiante();
			estd.setCedula(separar[0]);
			estd.setNombre(separar[1]);
			estd.setApellido(separar[2]);
			estd.setEdad(Integer.parseInt(separar[3]));
			estd.setPromedio(Double.parseDouble(separar[4]));
			
			this.agregarNodo(estd);
			
			leerlinea= bfr.readLine();
		}
		bfr.close();
	}
	
	public double promedio() {
		double promedio=0.0;
		int cont=0;
		Nodo aux=inicio;
		while(aux!=null) {
			promedio=promedio+aux.estudiante.getPromedio();
			cont++;
			aux=aux.siguiente; 
		}
		return promedio/cont;
	}
	
	public void listar() {
		Nodo aux=inicio;
		while(aux!=null) {
			System.out.println(aux.estudiante.getCedula()+" "+aux.estudiante.getNombre()+" "+aux.estudiante.getApellido()+" "+aux.estudiante.getPromedio()+" ptos");
			aux=aux.siguiente; 
		}
	}
	
	

}
