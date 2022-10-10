package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las tres variables que pediremos al usuario.
		int num;
		int num2;
		int num3;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario los valores de las tres variables.
		System.out.println("Introduzca tres números enteros");
		// Asignamos a la variable num el primer valor elegido por el usuario.
		num = sc.nextInt();
		// Asignamos a la variable num2 el segundo valor elegido por el usuario.
		num2 = sc.nextInt();
		// Asignamos a la variable num3 el tercer valor elegido por el usuario.
		num3 = sc.nextInt();
		// Si la suma entre las dos primeras variables da la tercera mostramos un mensaje diciendolo.
		if(num+num2==num3) {
			System.out.println("La suma del primer y segundo número dan como resultado el tercero");
			// Si la suma entre la primera y la tercera variable da la segunda mostramos un mensaje diciendolo.
		}else if(num+num3==num2) {
				System.out.println("La suma del primer y tercer número dan como resultado el segundo");
				// Si la suma entre las dos últimas variables da la primera mostramos un mensaje diciendolo.
			}else if(num2+num3==num) {
					System.out.println("La suma del segundo y tercer número dan como resultado el primero");
				// Sino mostramos un mensaje dicienddo que no se puede sumar dos de las tres variables para que de la otra.
				}else System.out.println("No hay ninguna suma entre dos de esos números que den como resultado el otro");
		// Cerramos escaner.
		sc.close();
	}

}
