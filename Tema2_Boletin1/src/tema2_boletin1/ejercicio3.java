package tema2_boletin1;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; // Esta variable es el número que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba el valor del número.
		System.out.println("Introduzca un número");
		// Asignamos el valor escrito por el usuario a la variable num.
		num=sc.nextInt();
		// Si el número está entre 1 y -1 y no es ninguno de los dos ni 0 mostramos un mensaje diciendo que es un número casi-cero
		if(num<1 && num>-1 && num!=0) {
			System.out.println("Es un número casi-cero");
		// Sino mostramos un mensaje diciendo que no es un número casi-cero.
		}else System.out.println("No es un número casi-cero");
		// Cerramos el escaner.
		sc.close();
	}

}
