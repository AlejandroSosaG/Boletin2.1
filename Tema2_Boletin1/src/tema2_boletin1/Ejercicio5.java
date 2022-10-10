package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las tres variables que pediremos al usuario.
		int num;
		int num2;
		int num3;
		// Genercación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de la primera variable.
		System.out.println("Introduzca el primer número");
		// Asignamos el valor escrito por el usuario a la variable num.
		num=sc.nextInt();
		// Pedimos al usuario el valor de la segunda variable.
		System.out.println("Introduzca el segundo número");
		// Asignamos el valor escrito por el usuario a la variable num2.
		num2= sc.nextInt();
		// Pedimos al usuario el valor de la tercera variable.
		System.out.println("Introduzca el tercer número");
		// Asignamos el valor escrito por el usuario a la variable num3.
		num3= sc.nextInt();
		// Si num es mayor a num2.
		if(num>num2) {
			// Si num3 es mayor a num mostramos mensaje escribiendo num3 seguido de num seguido de num2.
			if(num3>num) {
				System.out.println(num3 + " , " + num + " , " + num2);
			// Sino.
			}else {
				// Si num3 es mayor a num2 mostramos mensaje escribiendo num seguido de num3 seguido de num2.
				if(num3>num2) {
					System.out.println(num + " , " + num3 + " , " + num2);
				// Sino mostramos mensaje escribiendo num seguido de num2 seguido de num3.
				}else {
					System.out.println(num + " , " + num2 + " , " + num3);
				}
			}
		// Sino
		}else {
			// Si num2 es mayor a num3.
			if(num2>num3) {
				// Si num3 es mayor a num mostramos mensaje escribiendo num2 seguido de num3 seguido de num.
				if(num3>num) {
					System.out.println(num2 + " , " + num3 + " , " + num);
				// Sino mostramos mensaje escribiendo num2 seguido de num seguido de num3.
				}else{
					System.out.println(num2 + " , " + num + " , " + num3);
				}
			// Sino mostramos mensaje escribiendo num3 seguido de num2 seguido de num.
			}else {
				System.out.println(num3 + " , " + num2 + " , " + num);
			}
		}
		// Cerramos escaner.
		sc.close();
	}

}
