 package br.sp.gov.etesp.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.sp.gov.etesp.task.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa , Long>{

}
