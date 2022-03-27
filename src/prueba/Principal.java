package prueba;

import maths.Division;
import maths.Multiplicacion;
import maths.Resta;
import maths.Suma;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hola que pasa");
		
		int num1 = 5;
		int num2 = 3;
		
		System.out.println("Suma de " + num1 + " y " + num2 + ": " + Suma.suma(num1, num2));
		System.out.println("Resta de " + num1 + " y " + num2 + ": " + Resta.resta(num1, num2));
		System.out.println("Multiplicacion de " + num1 + " y " + num2 + ": " + Multiplicacion.multiplicacion(num1, num2));
		System.out.println("Division de " + num1 + " y " + num2 + ": " + Division.division(num1, num2));

	}

}
