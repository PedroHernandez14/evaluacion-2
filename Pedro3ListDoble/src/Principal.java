import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String car;
		Lista lis= new Lista();
		
		System.out.println("Escriba un numero entero o * para salir:");
		do {
			car= entrada.next();
			if(!car.equals("*"))
				lis.agregarNodo(Integer.parseInt(car));
		}while(!car.equals("*"));
		
		lis.ordenarLista();
		
		System.out.println("Menor numero:"+lis.getMenor());
		System.out.println("Mayor numero:"+lis.getMayor());
		System.out.println("Mediana:"+lis.getMediana());
		

	}

}
