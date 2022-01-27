package com.pms.desafio;

import java.time.LocalDate;

import com.pms.desafio.model.Curso;
import com.pms.desafio.model.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		Mentoria mentoria1 = new Mentoria();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("Curso Angular");
		curso2.setDescricao("Descrição curso Angular");
		curso2.setCargaHoraria(8);
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);

	}

}

