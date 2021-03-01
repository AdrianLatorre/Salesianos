package Tareas1;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Pres:
	 * Post:
	 */
	public static void main(String[] args) {
		System.out.println("¡Bienvenidos a mi primera calculadora!");
		System.out.println("1. suma");
		System.out.println("2. resta");
		System.out.println("3. división");
		System.out.println("4. multiplcación");
		Scanner Calcu = new Scanner(System.in);
		System.out.println("Selecciona la operacion que desea realizar:");
		int operando = Calcu.nextInt();
		if (operando == 1) {
			System.out.println("Introduce el primer numero que desea sumar:");
			int num1 = Calcu.nextInt();
			System.out.println("Introduce el segundo numero que desea sumar:");
			int num2 = Calcu.nextInt();
			suma(num1, num2);
		} else if (operando == 2) {
			System.out.println("Introduce el primer numero que desea restar:");
			int num1 = Calcu.nextInt();
			System.out.println("Introduce el segundo numero que desea restar:");
			int num2 = Calcu.nextInt();
			resta(num1, num2);
		} else if (operando == 3) {
			System.out.println("Introduce el primer numero que desea dividir:");
			int num1 = Calcu.nextInt();
			System.out.println("Introduce el segundo numero que desea dividir:");
			int num2 = Calcu.nextInt();
			division(num1, num2);
		} else if (operando == 4) {
			System.out.println("Introduce el primer numero que desea multiplicar:");
			int num1 = Calcu.nextInt();
			System.out.println("Introduce el segundo numero que desea multiplicar:");
			int num2 = Calcu.nextInt();
			multiplicacion(num1, num2);
		}
	}

	public static void suma(int num1, int num2) {
		System.out.println("La suma es = " + (num1 + num2));
	}

	public static void resta(int num1, int num2) {
		System.out.println("La resta es = " + (num1 - num2));
	}

	public static void multiplicacion(int num1, int num2) {
		System.out.println("La multiplicacion es = " + (num1 * num2));
	}

	public static void division(int num1, int num2) {
		System.out.println("La división es = " + (num1 / num2));
	}
}