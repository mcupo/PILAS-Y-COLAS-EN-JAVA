package ar.edu.ort.tp1.unidad5.dcolatipossimples;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		Queue<String> s = new LinkedList<String>();//Upcasting
		System.out.println("Encolamos algunos elementos...");
		s.add("Colas");
		s.add("en");
		s.offer("Java");//Hace lo mismo que add pero si algo falla retorna null en vez de una excepción
		System.out.println("Elemento primero en la cola: " + s.element());//Devuelve el elemento que esta primero pero no lo retira
		System.out.println("Elemento primero en la cola: " + s.peek());//Idem element pero si algo falla retorna null en vez de una excepción
		System.out.println("Tamaño de la cola: " + s.size());//Devuelve la cantidad de elementos que posee la cola
		System.out.println("Desencolamos todos elementos...");
		System.out.println(s.remove());
		System.out.println(s.remove());
		System.out.println(s.poll());//Hace lo mismo que remove pero si algo falla retorna null en vez de una excepción
		//System.out.println(s.remove());//Arroja una excepcion del tipo NoSuchElementException
		System.out.println("Tamaño de la cola: " + s.size());//Devuelve la cantidad de elementos que posee la cola
		if(s.isEmpty())//Metodo para validar si la cola esta vacia
			System.out.println("La cola esta vacia");
	}
}