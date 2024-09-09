package model.domain.atendimentoCliente;

import java.util.Date;

public class Socio extends Cliente{
    private String cpf;
    private String endereco;
    private String tel;
    
    public Socio(String cpf, String endereco, String tel, int numInscricao, 
            String nome, Date dtNascimento, char sexo) {
        super(numInscricao, nome, dtNascimento, sexo);
        this.cpf = cpf;
        this.endereco = endereco;
        this.tel = tel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
    
}
