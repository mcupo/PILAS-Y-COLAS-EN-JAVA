package ar.edu.ort.tp1.unidad5.ecolasobjetos;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		Queue<Persona> s = new LinkedList<Persona>();//Upcasting
		System.out.println("Encolamos algunos elementos...");
		Persona persona1 = new Persona("Juan", "Perez");
		Persona persona2 = new Persona("Daniela", "Gonzalez");
		s.add(persona1);
		s.add(persona2);
		System.out.println("Elemento primero en la cola: " + s.element());//Devuelve el elemento que esta primero pero no lo retira
		System.out.println("Tamaño de la cola: " + s.size());//Devuelve la cantidad de elementos que posee la cola
		System.out.println("Desencolamos todos elementos...");
		System.out.println(s.remove());
		System.out.println(s.remove());
		//System.out.println(s.remove());//Arroja una excepcion del tipo NoSuchElementException
		System.out.println("Tamaño de la cola: " + s.size());//Devuelve la cantidad de elementos que posee la cola
		if(s.isEmpty())//Metodo para validar si la cola esta vacia
			System.out.println("La cola esta vacia");
	}
}