package br.com.matheus.oliveira.recipes.repositories;

import java.util.List;

import br.com.matheus.oliveira.model.vo.SetorVO;

public interface CustomSetorRepository {
	public List<SetorVO> setorComColaboradores();
}
