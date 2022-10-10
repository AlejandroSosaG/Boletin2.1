package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; // Esta es la variable que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valro de la variable.
		System.out.println("Introduzca un número");
		// Asignamos a la variable num el valor escrito por el usuario.
		num=sc.nextInt();
		// Si el valor de num es mayor a 9.
		if(num>9) {
			// Si el valor de num es mayor a 99.
			if(num>99) {
				// Si el valor de num es mayor a 999.
				if(num>999) {
					// Si el valor de num es mayor a 9999 mostramos un mensaje diciendo que tiene 5 cifras.
					if(num>9999) {
						System.out.println("El número tiene 5 cifras");
					// Sino mostramos un mensaje diciendo que tiene 4 cifras.
					}else System.out.println("El número tiene 4 cifras");
				// Sino mostramos un mensaje diciendo que tiene 3 cifras.
				}else System.out.println("El número tiene 3 cifras");
			// Sino mostramos un mensaje diciendo que tiene 2 cifras.
			}else System.out.println("El número tiene 2 cifras");
		// Sino mostramos un mensaje diciendo que tiene 1 cifra.
		}else System.out.println("El número tiene 1 cifra");
		// Cerramos escaner.
		sc.close();
	}

}
