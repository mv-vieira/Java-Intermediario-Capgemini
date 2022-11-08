package com.br.GenericsCourse;

import java.util.Scanner;


public class pistaDeVoo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aeronaves<String> air = new Aeronaves<>();
		System.out.println("---------- Aeroporto do Recife ----------");
		System.out.println();
		System.out.println("Informe o nr de aeronaves que chegarao na pista de voo: ");
		int nrAeronaves = sc.nextInt();
		System.out.println();
		
		// Adicionando os voos
		for (int i = 0; i < nrAeronaves ; i++) {
			System.out.println("Informe qual o nr da Aeronave: ");
			String nrVoo = sc.next();
			air.addVoo(nrVoo);
			System.out.println();
		}
		
		// Mostrando o primeiro voo a sair do aeroporto
		air.primeiroVoo();
		String x = (String) air.primeiroVoo();
		System.out.println("O primeiro a decolar e o voo: " + x);
		air.listaVoos();
		System.out.println();
		System.out.println("---------- Aeroporto do Recife agradece a sua preferencia ----------");
		sc.close();

	}

}
