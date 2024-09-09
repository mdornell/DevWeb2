package model.domain.controleAcervo;

import java.util.Date;

public class Classe {
    private String nome;
    private double valor;
    private Date prazoDevolução;

    public Classe(String nome, double valor, Date prazoDevolução) {
        this.nome = nome;
        this.valor = valor;
        this.prazoDevolução = prazoDevolução;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getPrazoDevolução() {
        return prazoDevolução;
    }

    public void setPrazoDevolução(Date prazoDevolução) {
        this.prazoDevolução = prazoDevolução;
    }
    
    
}
