package com.br.arrays;
import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		
		//Declarando Array
		String[] paises = new String[4];
		
		//Declarando Array de números
		int[] numeros = new int[10];
		
		
		//Abastacendo o array de países
		for(int i = 0; i < paises.length; i++){
			paises[i] = JOptionPane.showInputDialog("Informe um pais");
		}
		
		//Listando o array de países
		for(String listaPaises: paises){
			System.out.println(listaPaises);
		}
		
		//Abastecendo o array de Números
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
		}
		
		//Listando o array de números
		for(int listaNumeros: numeros){
			System.out.println(listaNumeros);
		}
	}
	
	
}
