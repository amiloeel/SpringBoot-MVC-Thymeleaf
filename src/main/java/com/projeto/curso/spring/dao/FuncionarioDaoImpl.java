package com.projeto.curso.spring.dao;

import org.springframework.stereotype.Repository;

import com.projeto.curso.spring.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
