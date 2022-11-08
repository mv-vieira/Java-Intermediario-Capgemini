package com.br.ClasseWrapper;

public class Wrapper {

	public static void main(String[] args) {
		// Um tipo primitivo n o tem como transformar em objeto a não ser utilizando 
		// as classes Wrapper
				//Autoboxing - exemplos
				   
		Boolean bolWrapped =  true;
		System.out.println(bolWrapped.getClass());
				   
		Character chWrapped = 'a'; 
		System.out.println(chWrapped.getClass());
			       
		Byte byteWrapped = 1;
		System.out.println(byteWrapped.getClass());
		
		Short shoWrapped = 'B';
		System.out.println(shoWrapped.getClass());
			       
		Integer intWrapped = 5215; 
		System.out.println(intWrapped.getClass());
			       
		Long longWrapped = 14585645666L;
		System.out.println(longWrapped.getClass());
			       
		Float floatWrapped = 3.14159f;
		System.out.println(floatWrapped.getClass());
			      
		Double doubWrapped = 3.14159;
		System.out.println(doubWrapped.getClass());
		
		int numero = Integer.parseInt("1");
		System.out.println(numero + 1);

	}

}
