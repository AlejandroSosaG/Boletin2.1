package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; // Esta variable es el número introducido por el usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba un número.
		System.out.println("Introduzca un número");
		// Asignamos el valor elegido por el usuario a num.
		num=sc.nextInt();
		// Si el número entre 2 da resto 0 mostramos un mensaje de que es par, y si no pasa eso el mensaje mostrará que es impar.
		if(num%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		// Cerramos el escaner.
		sc.close();
	}

}
