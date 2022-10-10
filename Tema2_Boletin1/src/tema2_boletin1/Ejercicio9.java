package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio9 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las dos variable que pediremos a los usuarios.
		final int PIEDRA = 1;
		final int PAPEL = 2;
		final int TIJERAS = 3;
		int jugador1 = 0;
		int jugador2 = 0;
		
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
		
		System.out.println(jugador1 + " " + jugador2);
		if(jugador1==jugador2) {
			System.out.println("Empate");
		}else if(jugador1==PIEDRA && jugador2==TIJERAS || jugador1==PAPEL && jugador2==PIEDRA || jugador1==TIJERAS && jugador2==PAPEL) {
			System.out.println("Jugador 1 gana");
		}else System.out.println("Jugador 2 gana");
		// Cerramos escaner.
		sc.close();
	}

}
