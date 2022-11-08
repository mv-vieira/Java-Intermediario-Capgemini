package com.br.matrizes;

import javax.swing.JOptionPane;

public class Matrizes {
	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que solicite ao usuário a entrada de 4 notas 
		 * para cada aluno, calcular a m dia dos alunos e exibir em tela. 
		 * Ao final mostrar a m dia da turma. 
		 * Ao lado da m dia do aluno deve seguir a seguinte regra de negócio.
		 * Se m dia >= 7,5               Aluno Aprovado
		 * Se m dia >= 5,5 e <7,5   Aluno em Recupera  o
		 * Se m dia  < 5,5                Aluno Reprovado
		*/
		
		//Vetor dos alunos
		String[] alunos = {"Joao", "Maria", "Jose"};
		
		//Matriz das notas
		float [][] notas = new float[3][4];
		
		//Controlar o somatório das notas de cada aluno e calcular média do aluno
		float somaNotas, mediaAluno;
		
		//Amazenar o status do aluno e usar para imprimir a situação do boletim
		String statusAluno;
		
		//Informar as notas dos alunos
		//Laço externo para associar aluno à nota
		for (int i = 0; i < alunos.length; i++){
			
			//Laço interno para informar as notas de cada aluno
			somaNotas = 0;
			mediaAluno = 0;
			for (int j = 0; j < 4; j++){
				notas[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota nº " + (j+1) + " do aluno " + alunos[i]));
				somaNotas += notas[i][j];
			}
			
			mediaAluno = somaNotas / 4;
			if(mediaAluno < 5.5) {
				statusAluno = "REPROVADO";
			}else if (mediaAluno >=5.5 && mediaAluno <= 7.0) {
				statusAluno = "EM RECUPERACAO";
			}else {
				statusAluno = "APROVADO";
			}
			
			//Impressao no Boletim
			System.out.println("------Boletim------");
			System.out.println("Aluno: " + alunos[i]);
			System.out.println("Notas");
			for (int j1 = 0; j1 < 4; j1++) {
				System.out.println((j1+1) + " - " + notas[i][j1]);
			}
			System.out.println("Media..: " + mediaAluno + " - " + statusAluno);
			System.out.println();
		}
		
		
	}

}
