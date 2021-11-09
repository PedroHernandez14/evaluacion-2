import java.io.IOException;

public class Principal {
	public static void main(String[] arg) throws IOException {
		Lista lis= new Lista();
		lis.leerArchivo();
		lis.listar();
		System.out.println("El promedio de los estudiantes es "+ lis.promedio()+" ptos.");
	}

}
