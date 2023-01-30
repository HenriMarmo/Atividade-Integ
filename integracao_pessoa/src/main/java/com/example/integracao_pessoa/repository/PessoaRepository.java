package com.example.integracao_pessoa.repository;

import com.example.integracao_pessoa.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}
