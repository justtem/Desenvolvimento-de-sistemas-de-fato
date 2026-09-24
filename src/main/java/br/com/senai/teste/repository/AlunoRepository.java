package br.com.senai.teste.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.teste.model.Aluno;

public interface AlunoRepository
     extends JpaRepository<Aluno, Integer> {

    public Optional<Aluno> findById(Long id);
    
}
