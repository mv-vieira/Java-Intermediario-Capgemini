package com.br.ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {

	public static void main(String[] args) {
		
		// Construindo um arraylist para os carros
		ArrayList<String> carros = new ArrayList<>();
		
		// Adicionando carros ao arraylist
		carros.add("BMW");
		carros.add("JAGUAR");
		carros.add("MERCEDES");
		carros.add("VECTRA");
		carros.add("VOLVO");
		
		// Mostrando o array
		System.out.println(carros);
		
		// Substituir VECTRA por MITSUBISHI
		carros.set(3, "MITSUBISHI");
		System.out.println(carros);
		
		// Remover VOLVO
		carros.remove("VOLVO");
		System.out.println(carros);
		
		// Adicionar carros ao arraylist com JOptionPane
		carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
		System.out.println(carros);
		
		/*
		// Esvaziando o arraylist
		carros.clear();
		System.out.println(carros);
		
		
		// Verifica se o arraylist está vazio
		if(carros.isEmpty()) {
			System.out.println("O array esta vazio");
		}
		 */
		
		if(carros.contains("BMW")){
			// substituindo quando não se sabe a posição
			for (int i = 0; i < carros.size(); i++) {
				if("BMW".equals(carros.get(i))) {
					carros.set(i, "BUGATTI");
					break;
				}
			}
		} else {
			System.out.println("O argumento pesquisado nao foi encontrado!");
		}
		
		// Mostrando o array após o contains
		System.out.println(carros);
	}

}
