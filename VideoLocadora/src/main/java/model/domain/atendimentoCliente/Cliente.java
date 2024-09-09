package model.domain.atendimentoCliente;

import java.util.Date;

public class Cliente {
    private int numInscricao;
    private String nome;
    private Date dtNascimento;
    private char sexo;
    private boolean estahAtivo;

    public Cliente(int numInscricao, String nome, Date dtNascimento, char sexo) {
        this.numInscricao = numInscricao;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.estahAtivo = true;
    }

    public int getNumInscricao() {
        return numInscricao;
    }

    public void setNumInscricao(int numInscricao) {
        this.numInscricao = numInscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isEstahAtivo() {
        return estahAtivo;
    }

    public void setEstahAtivo(boolean estahAtivo) {
        this.estahAtivo = estahAtivo;
    }
    
    
    
    
    
}
