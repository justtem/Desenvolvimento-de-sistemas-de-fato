package br.com.senai.teste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "livros")
public class Livro{
    
      @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private int anoPublicacao;
    private String titulo;
    private String autor;

    public void livro() {

    }

    public void livro(int anoPublicacao, String titulo, String autor) {
      this.anoPublicacao = anoPublicacao;
      this.titulo = titulo;
      this.autor = autor;
      
    }

    public int getId() {
      return id;
    }

    public int getAnoPublicacao() {
      return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
      this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
      return titulo;
    }

    public void setTitulo(String titulo) {
      this.titulo = titulo;
    }

      public String getAutor() {
      return autor;
      }


      public void setAutor(String autor) {
        this.autor = autor;
      }

}
