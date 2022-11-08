package com.br.arrays;

public class ImprimindoArray {

	public static void main(String[] args) {
		
		
		//Declarando o Array
		
		String[] paises = new String[5];
		
		//Inicializando o Array
		paises[0] = "Brasil";
		paises[1] = "Alemanha";
		paises[2] = "Italia";
		paises[3] = "Austria";
		paises[4] = "Noruega";
		
		//Indíce
		int i = 1;
		
		for(String lista: paises) {
			System.out.println(i+ " - " +lista);
			i++;
		}
	
		}
	}

