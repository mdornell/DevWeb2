package model.domain.controleAcervo;

public class Diretor {
    private String nome;
    
    public Diretor(String nome){
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
    
}
