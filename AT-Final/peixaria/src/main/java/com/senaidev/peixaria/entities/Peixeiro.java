package com.senaidev.peixaria.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Peixeiro {

	@Entity
	@Table(name = "tb_peixeiro")
	public class Peixeiro {
		
		//Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_peixeiro;
		
		@Column(name = "nome")
		private String nome;
		
		@Column(name = "cpf")
		private String cpf;
		
		@Column( name = "data_inicio")
		private Date incio;
		
		//Construtores
		
		public Peixeiro() {
			
		}
		public Peixeiro(Long id, String nome, String cpf, Date data_inicio) {
			this.id = id;
			this.nome = nome;
			this.cpf = cpf;
			this.data_inicio = data_inicio;
			
		}
		
		//Getters and Setters
 	}
		
	
}
