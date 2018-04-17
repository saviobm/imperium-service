package br.com.imperium.aluno;

import org.springframework.data.repository.CrudRepository;

import br.com.imperium.modelo.ImperiumEntidade;

public interface ImperiumRepository<T extends ImperiumEntidade> extends CrudRepository<T, Long> {

}
