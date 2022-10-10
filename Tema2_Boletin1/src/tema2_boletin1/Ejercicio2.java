package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las dos variables de los números que pediremos al usuario.
		int num; 
		int num2;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Perdimos al usuario que escriba el primer número.
		System.out.println("Introduzca el primer número");
		// Asignamos el valor elegido por el usuario a la primera variable.
		num=sc.nextInt();
		// Pedimos al usuario el valor del segundo número.
		System.out.println("Introduzca el segundo número");
		// Asignamos el valor elegido por el usuario a la segunda variable.
		num2= sc.nextInt();
		// Si los números son iguales mostramos  un mensaje diciéndolo, si no lo son mostraremos un mensaje diciendo que no son iguales.
		if(num==num2) {
			System.out.println("Los números son iguales");
		}else {
			System.out.println("Los números no son iguales");
		}
		// Cerramos el escaner.
		sc.close();
	}

}
