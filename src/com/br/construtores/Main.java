package com.br.construtores;

import java.text.DecimalFormat;

import com.br.construtores.Aluno.STATUS;
import com.br.construtores.Aluno.MATRICULA;

public class Main {
	public static void main(String[] args) {
		
		DecimalFormat formatado = new DecimalFormat("0.0");
	
		//Passando dados através do construtor
		Aluno alu = new Aluno(8,8,6);
		
		//Calculando média do aluno
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		//Define situação do aluno
		if(mediaAlunoFinal > 6) {
			alu.situaçãoAluno = STATUS.APROVADO;
		}else {
			alu.situaçãoAluno = STATUS.REPROVADO;
		}
		
		//Imprimindo situação do aluno
		System.out.println("A media do aluno e: " + formatado.format(alu.calcularMediaAluno()) + " e o status foi: " + alu.situaçãoAluno);
		
		//Usa ENUM MATRICULA
		alu.situacaoMatricula = MATRICULA.MATRICULADO;
		System.out.println("O aluno esta com a sua matricula: " + alu.situacaoMatricula);
		
}
}
