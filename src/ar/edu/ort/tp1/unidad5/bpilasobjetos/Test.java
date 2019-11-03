package ar.edu.ort.tp1.unidad5.bpilasobjetos;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {

		Stack<Auto> s = new Stack<Auto>();
		System.out.println("Apilamos algunos elementos...");
		Auto auto1 = new Auto("ABCD123", "Fiesta", "Ford");
		Auto auto2 = new Auto("RTY443", "Corolla", "Toyota");
		s.push(auto1);
		s.push(auto2);
		System.out.println("Elemento en la cima: " + s.peek());//Devuelve el elemento que esta en la cima pero no lo retira
		System.out.println("Tamaño de la pila: " + s.size());//Devuelve la cantidad de elementos que posee la pila
		System.out.println("Desapilamos todos elementos...");
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());//Arroja una excepcion del tipo EmptyStackException
		System.out.println("Tamaño de la pila: " + s.size());//Devuelve la cantidad de elementos que posee la pila
		if(s.isEmpty())//Metodo para validar si la pila esta vacia
			System.out.println("La pila esta vacia");
	}
}