package model.domain;

import javax.persistence.*;

@Entity
public class Ator {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column (name="nomeCliente", nullable = false)
    private String nome;

    public Ator() { // Construtor Vazio
    }

    public Ator(int id, String nome) { // Construtor com ID
        this.id = id;
        this.nome = nome;
    }
    
    public Ator(String nome){ // Construtor sem ID
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
