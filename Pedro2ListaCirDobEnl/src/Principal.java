import java.util.Scanner;

public class Principal {
	
	static Scanner entrada = new Scanner(System.in);
	static Lista lis;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lis= new Lista();
		int opc,num;
		do {
			opc=menu();
			if(opc==1) {
				System.out.println("Ingrese un numero entero");
				num= entrada.nextInt();
				lis.nuevoNodo(num);
			}
			if(opc==2) {
				String car="";
				System.out.println("d) Nodo Siguiente");
				System.out.println("a) Nodo Anterior");
				System.out.println("s) Salir al menu principal");
				do {
				System.out.println("tipee una letra de las opciones");
				car= entrada.next();
				lis.recorrer(car);
				}while(!car.equals("s"));
			}
			
		}while(opc!=3);
		
		System.exit(0);
		

	}
	
	public static int menu() {
		System.out.println("1) Crear Nodo");
		System.out.println("2) Recorrer Nodo");
		System.out.println("3) Salir.");
		System.out.println("tipee un numero de las opciones");
		return entrada.nextInt();
	}

}
