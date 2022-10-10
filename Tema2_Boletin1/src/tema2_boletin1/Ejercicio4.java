package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las dos variables que pediremos al usuario.
		int num;
		int num2;
		// Genercación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de la primera variable.
		System.out.println("Introduzca el primer número");
		// Asignamos el valor escrito por el usuario a la variable num.
		num=sc.nextInt();
		// Pedimos al usuario el valor de la primera variable.
		System.out.println("Introduzca el segundo número");
		// Asignamos el valor escrito por el usuario a la variable num2.
		num2= sc.nextInt();
		// Si la primera variable es menos que la segunda mostramos un mensaje con la primera variable seguida de la segunda.
		if(num<num2) {
			System.out.println(num + " , " + num2);
		// Sino mostramos un mensaje con la segunda variable seguida de la primera.
		}else {
			System.out.println(num2 + " , " + num);
		}
		// Cerramos el escaner.
		sc.close();
	}

}
