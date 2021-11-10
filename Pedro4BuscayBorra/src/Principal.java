import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String ci;
		Lista lis= new Lista();
		lis.leerArchivo();
		lis.listar();
		System.out.println("Escriba la cedula del estudiante a borrar:");
		ci= entrada.next();
		lis.buscar(ci);
		lis.listar();
	}

}
