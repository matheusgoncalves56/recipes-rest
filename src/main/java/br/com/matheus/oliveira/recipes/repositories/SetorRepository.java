package br.com.matheus.oliveira.recipes.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.matheus.oliveira.recipes.entities.Setor;

public interface SetorRepository extends CrudRepository<Setor, Long>, CustomSetorRepository{

}
