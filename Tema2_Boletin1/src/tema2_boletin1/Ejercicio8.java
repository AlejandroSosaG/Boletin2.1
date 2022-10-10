package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota; // Esta varible es la nota que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de la variable.
		System.out.println("Introduzca el número de su nota");
		// Asignamos a la variable nota el valor escrito por el usuario.
		nota=sc.nextDouble();
		// Si la nota está entre 0 y 5(0 incluido) mostramos mensaje diciendo que es insuficiente.
		if(nota>=0 && nota<5) {
			System.out.println("Su nota es insuficiente");
		// Sino seguimos el programa.
		}else {
			// Si la nota está entre 5 y 6(5 incluido) mostramos mensaje diciendo que es suficiente.
			if(nota>=5 && nota<6) {
				System.out.println("Su nota es suficiente");
			// Sino seguimos el programa.
			}else {
				// Si la nota está entre 6 y 7(6 incluido) mostramos mensaje diciendo que es bien.
				if(nota>=6 && nota<7) {
					System.out.println("Su nota es bien");
					// Sino seguimos el programa.
				}else {
					// Si la nota está entre 7 y 9(7 incluido) mostramos mensaje diciendo que es notable.
					if(nota>=7 && nota<9) {
						System.out.println("Su nota es notable");
					// Sino seguimos el programa.
					}else {
						// Si la nota está entre 9 y 10(9 y 10 incluidos) mostramos mensaje diciendo que es sobresaliente.
						if(nota>=9 && nota<=10) {
							System.out.println("Su nota es sobresaliente");
						}
					}
				}
			}
		}
		// Cerramos escaner.
		sc.close();
	}

}
