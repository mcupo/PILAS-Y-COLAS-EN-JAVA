package ar.edu.ort.tp1.unidad5.cverificarparentesis;

import java.util.Stack;

public class Test {

	public static void main(String arg[]) {
		String cadenano = "(Cadena no equilibrada en paréntesis(()()()))))";
		String cadenasi = "(Cadena equilibrada en parentesis())";
		System.out.println("Verificación equilibrado en paréntesis para cadena no equilibrada:");
		System.out.println(verificaParentesis(cadenano));
		System.out.println("Verificación equilibrado en paréntesis para cadena si equilibrada:");
		System.out.println(verificaParentesis(cadenasi));
	}

	public static boolean verificaParentesis(String cadena) {
		Stack<String> pila = new Stack<String>();
		int i = 0;
		while (i < cadena.length()) {//Recorremos la expresión carácter a carácter
			if (cadena.charAt(i) == '(') {
				pila.push("(");
			} //Si el paréntesis es de apertura apilamos siempre
			else if (cadena.charAt(i) == ')') {//Si el paréntesis es de cierre actuamos según el caso
				if (!pila.empty()) {
					pila.pop();
				}//Si la pila no está vacía desapilamos
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