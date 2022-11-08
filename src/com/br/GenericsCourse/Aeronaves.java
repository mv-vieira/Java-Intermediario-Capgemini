package com.br.GenericsCourse;

import java.util.ArrayList;
import java.util.List;

public class Aeronaves<T> {
	
	private List<T> listaAeronaves = new ArrayList<>();
	
	public void addVoo(T nrVoo){
		listaAeronaves.add(nrVoo);
	}
	
	public T primeiroVoo() {
		if(listaAeronaves.isEmpty()){
			throw new IllegalStateException("List is empty");
		}
		return listaAeronaves.get(0);
	}
	
	public void listaVoos() {

		if(listaAeronaves.isEmpty()) {
			System.out.println(listaAeronaves.get(0));
		}
		for (int i = 0; i < listaAeronaves.size(); i++) {
			System.out.println(" Os proximos voos programados sao:  " + listaAeronaves.get(i));
		}
	}

}
