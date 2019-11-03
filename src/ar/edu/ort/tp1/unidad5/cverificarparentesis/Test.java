package ar.edu.ort.tp1.unidad5.cverificarparentesis;

import java.util.Stack;

public class Test {

	public static void main(String arg[]) {
		String cadenano = "(Cadena no equilibrada en par�ntesis(()()()))))";
		String cadenasi = "(Cadena equilibrada en parentesis())";
		System.out.println("Verificaci�n equilibrado en par�ntesis para cadena no equilibrada:");
		System.out.println(verificaParentesis(cadenano));
		System.out.println("Verificaci�n equilibrado en par�ntesis para cadena si equilibrada:");
		System.out.println(verificaParentesis(cadenasi));
	}

	public static boolean verificaParentesis(String cadena) {
		Stack<String> pila = new Stack<String>();
		int i = 0;
		while (i < cadena.length()) {//Recorremos la expresi�n car�cter a car�cter
			if (cadena.charAt(i) == '(') {
				pila.push("(");
			} //Si el par�ntesis es de apertura apilamos siempre
			else if (cadena.charAt(i) == ')') {//Si el par�ntesis es de cierre actuamos seg�n el caso
				if (!pila.empty()) {
					pila.pop();
				}//Si la pila no est� vac�a desapilamos
				else {
					pila.push(")");
					break;
				}//La pila no puede empezar con un cierre, apilamos y salimos
			}
			i++;
		}
		if (pila.empty())
			return true;
		else
			return false;
	}
}