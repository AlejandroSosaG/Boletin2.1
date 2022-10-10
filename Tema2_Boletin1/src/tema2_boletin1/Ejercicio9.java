package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio9 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las variables.
		final int PIEDRA = 1; // Esta es la variable con la que validaremos que un jugador ha elegido piedra.
		final int PAPEL = 2; // Esta es la variable con la que validaremos que un jugador ha elegido papel.
		final int TIJERAS = 3; // Esta es la variable con la que validaremos que un jugador ha elegido tijeras.
		int jugador1; // Esta es la variable que pediremos al primer usuario.
		int jugador2; // Esta es la variable que pediremos al segundo usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al primer usuario que escriba piedra papel o tijera.
		System.out.println("Escriba piedra (1), papel (2) o tijeras (3)");
		// Asignamos a la variable jugador1 el valor elegido por el usuario.
		jugador1=sc.nextInt();
		// Pedimos al segundo usuario que escriba piedra, papel o tijera.
		System.out.println("Escriba piedra (1), papel (2) o tijeras (3)");
		// Asignamos a la variable jugador2 el valor elegido por el usuario.
		jugador2= sc.nextInt();
		// Si los 2 jugadores han elegido la misma opción decimos que es empate.
		if(jugador1==jugador2) {
			System.out.println("Empate");
		// Si no son iguales, sino que el jugador 1 ha elegido piedra y el jugador 2 tijeras,
		// o el jugador 1 ha elegido papel y el jugador 2 piedra o el jugador 1 ha elegido tijeras y el jugador 2 papel, 
		// entonces gana el jugador 1.
		}else if(jugador1==PIEDRA && jugador2==TIJERAS || jugador1==PAPEL && jugador2==PIEDRA || jugador1==TIJERAS && jugador2==PAPEL) {
			System.out.println("El Jugador 1 es el ganador");
		// Si no se cumple ninguna de las condiciones anteriores, entonces gana el jugador 2.
		}else System.out.println("El jugador 2 es el ganador");
		// Cerramos escaner.
		sc.close();
	}

}
