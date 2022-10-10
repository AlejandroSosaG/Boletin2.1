package tema2_boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos las tres variables que pediremos al usuario.
		int a;
		int b;
		int c;
		double x; // Esta variable nos dirá el primer valor de x.
		double x2; // Esta variable nos dirá el segundo valr de x.
		double raiz; // Esta variable la utilizaremos para validar que existen soluciones.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario el valor de la primera variable.
		System.out.println("Introduzca el primer coeficiente");
		// Asignamos a la variable a el valor escrito por el usuario.
		a=sc.nextInt();
		// Si a es igual a cero mostramos un mensaje diciendo que no se puede realizar dicha operación con a igual a 0.
		if(a==0) {
			System.out.println("El primer coeficiente no puede ser 0");
		// Sino seguimos con el programa.
		}else {
			// Pedimos al usuario el valor de la primera variable.
			System.out.println("Introduzca el segundo coeficiente");
			// Asignamos a la variable b el valor escrito por el usuario.
			b= sc.nextInt();
			// Pedimos al usuario el valor de la primera variable.
			System.out.println("Introduzca el tercer coeficiente");
			// Asignamos a la variable c el valor escrito por el usuario.
			c= sc.nextInt();
			// Asignamos a la variable raiz el valor de b al cuadrado menos el producto de 4, a y c.
			raiz = (b*b)-(4*a*c);
			// Si el valor de raiz es negativo mostramos mensaje diciendo que no hay solución.
			if(raiz<0) {
				System.out.println("La ecuación no tiene solución");
			// Sino seguimos con el programa.
			}else {
				// Asignamos a la variable x el primer valor de x mediante su cálculo correspondiente.
				x= (-b+Math.sqrt(raiz))/2*a;
				// Asignamos a la variable x2 el segundo valor de x mediante su cálculo correspondiente.
				x2 = (-b-Math.sqrt(raiz))/2*a;
				// Mostramos un mensaje con los dos valores de x.
				System.out.println("Los valores de x son " + x + " y " + x2);
			}
		}
		// Cerramos escaner.
		sc.close();
	}

}
