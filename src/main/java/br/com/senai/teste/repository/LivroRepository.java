package br.com.senai.teste.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.teste.model.Livro;


public interface LivroRepository extends JpaRepository<Livro, Integer>  {

    public Optional<Livro> findById(Long id);
    
}
