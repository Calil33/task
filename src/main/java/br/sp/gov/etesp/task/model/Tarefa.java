package br.sp.gov.etesp.task.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_tarefa")
public class Tarefa {
	@Id//define a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)//gera ids com sequecia numerica 1,2,3,4,5
	@Column(name="id_tarefa")//alguma coisa com coluna kkkkk
	
	private Long id;//long pq é pra gerar numero logos
	private String nomeTarefa;
	private String status;
	private LocalDate dataInicio;
	private LocalDate dateFim;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeTarefa() {
		return nomeTarefa;
	}
	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDateFim() {
		return dateFim;
	}
	public void setDateFim(LocalDate dateFim) {
		this.dateFim = dateFim;
	}
	
	
	
	
	
}
