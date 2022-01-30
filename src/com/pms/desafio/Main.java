package com.pms.desafio;

import java.time.LocalDate;

import com.pms.desafio.model.Bootcamp;
import com.pms.desafio.model.Curso;
import com.pms.desafio.model.Dev;
import com.pms.desafio.model.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();

		Mentoria mentoria1 = new Mentoria();
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootecamp GFT Start #3 Java");
		bootcamp.setDescricao("Hey Dev, já considerou a possibilidade de se tornar ainda mais potente \npara o mercado, se especializando na tecnologia de desenvolvimento \nmais utilizada no mundo? Se sim, este é o seu momento de brilhar! \nO Bootcamp GFT Start #3 Java foi pensado exclusivamente para o seu desenvolvimento na tecnologia de Java, contendo uma sequência \ncompleta de cursos, mentorias e desafios. Não perca essa chance e \ninscreva-se já!");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		curso1.setTitulo("Logica de programação");
		curso1.setDescricao("Lógica de programação é a forma como o desenvolvedor entende a comunicação a fim de programar uma função de um programa.");
		curso1.setCargaHoraria(4);

		curso2.setTitulo("Estrutura de dados e Algoritmos");
		curso2.setDescricao("Aprenda o que são estruturas de dados em um sistema, qual a importância dela e como trabalhar com o armazenamento dessas informações de forma ágil e otimizada");
		curso2.setCargaHoraria(2);

		mentoria1.setTitulo("Boas-vindas ao Bootcampt GFT Start #3 Java");
		mentoria1.setDescricao("Conheça alguns colaboradores da GFT Brasil e descubra por que ela é referência em inovação e tecnologia!");
		mentoria1.setData(LocalDate.now());

		
		Dev devPhillip = new Dev();
		devPhillip.setNome("Phillip");
		devPhillip.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Phillip: " + devPhillip.getConteudosInscritos());
		
		devPhillip.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Phillip: " + devPhillip.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Phillip: " + devPhillip.getConteudosConcluidos());
		System.out.println("XP:" + devPhillip.calcularTotalXp());
		
		System.out.println("-----");
		
		Dev devAlceu = new Dev();
		devAlceu.setNome("Alceu");
		devAlceu.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Alceu: " + devAlceu.getConteudosInscritos());
		devAlceu.progredir();
		devAlceu.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Alceu: " + devAlceu.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Alceu: " + devAlceu.getConteudosConcluidos());
		System.out.println("XP:" + devAlceu.calcularTotalXp());

		
		

	}
}
