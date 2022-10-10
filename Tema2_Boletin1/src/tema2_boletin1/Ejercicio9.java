package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las dos variable que pediremos a los usuarios.
		String jugador1;
		String jugador2;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al primer usuario que escriba piedra papel o tijera.
		System.out.println("Escriba piedra, papel o tijera");
		// Asignamos a la variable jugador1 el valor elegido por el usuario.
		jugador1=sc.next();
		// Pedimos al segundo usuario que escriba piedra, papel o tijera.
		System.out.println("Escriba piedra, papel o tijera");
		// Asignamos a la variable jugador2 el valor elegido por el usuario.
		jugador2= sc.next();
		// Si el valor de jugador1 es piedra.
		if(jugador1=="piedra") {
			// Si el valor de jugador2 es tijera mostramos mensaje diciendo que gana el primer usuario.
			if(jugador2=="tijera") {
				System.out.println("Gana el jugador número 1");
			// Sino seguimos con el programa.
			}else {
				// Si el valor de jugador2 es papel mostramos mensaje diciendo que gana el segundo usuario.
				if(jugador2=="papel") {
					System.out.println("Gana el jugador número 2");
				// Sino mostramos mensaje diciendo que es empate.
				}else {
					System.out.println("Empate");
				
				}
			}
		// Sino seguimos el programa.
		}else {
			// Si el valor de jugador1 es tijera.
			if(jugador1=="tijera") {
				// Si el valor de jugador2 es tijera mostramos mensaje diciendo que es empate.
				if(jugador2=="tijera") {
					System.out.println("Empate");
				// Sino seguimos el programa.
				}else {
					// Si el valor de jugador2 es piedra mostramos mensaje diciendo que gana el segundo usuario.
					if(jugador2=="piedra") {
						System.out.println("Gana el jugador número 2");
					// Sino mostramos mensaje diciendo que gana el primer usuario.
					}else {
						System.out.println("Gana el jugador número 1");
					}
				}
			// Sino seguimos el programa.
			}else {
				// Si el valor de jugador2 es piedra mostramos mensaje diciendo que gana el primer usuario.
				if(jugador2=="piedra") {
					System.out.println("Gana el jugador número 1");
				// Sino seguimos el programa.
				}else {
					// Si el valor de jugador2 es tijera mostramos mensaje diciendo que gana el segundo usuario.
					if(jugador2=="tijera") {
						System.out.println("Gana el jugador número 2");
					// Sino mostramos mensaje diciendo que gana el segundo usuario.
					}else {
						System.out.println("Empate");
					}
				}
			}
		}
		// Cerramos escaner.
		sc.close();
	}

}
