package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

/**
 * 
 * @author Juan
 *
 */
public interface LancamentoRepository extends JpaRepository <Lancamento, Long>, LancamentoRepositoryQuery{

}
