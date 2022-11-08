package com.br.LinkedList;

import java.util.LinkedList;

public class LinkedListCarros {

	public static void main(String[] args) {
		
		/*
		 * addFirst()
		 * addLast()
		 * removeFirst()
		 * removeLast()
		 * getFirst()
		 * getLast()
		 * */
		
		// Declaração do LinkedList e preenchendo inicialmente
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Bugatti");
		System.out.println(cars);
		
		// Incluindo Mazda no inicio
		cars.addFirst("Mazda");
		System.out.println(cars);
		
		// Incluindo Jetta no fim
		cars.addLast("Jetta");
		System.out.println(cars);
		
		// Encontrando o carro na posição desejada
		System.out.println(cars.get(3));
		
		// Removendo o primeiro
		cars.removeFirst();
		System.out.println(cars);
		
		// Removendo o último
		cars.removeLast();
		System.out.println(cars);
		
		// Pegando o primeiro do array
		System.out.println(cars.getFirst());
		
		// Pegando o último do array
		System.out.println(cars.getLast());
		
		// Removendo todos os itens do array
		cars.clear();
		System.out.println(cars);
		
		
		// Verificando se o array esta vazio
		if(cars.isEmpty()) {
			System.out.println("O array esta vazio!");
		} else {
			System.out.println("O array esta preenchido!");
		}
		
		

	}

}
