package model.domain.atendimentoCliente;

import java.util.Date;

public class Locacao {
    private Date dtLocacao;
    private Date dtDevolucaoPrevista;
    private Date dtDevolucaoEfetiva;
    private double valorCobrado;
    private double multaCobrada;

    public Locacao(Date dtLocacao, Date dtDevolucaoPrevista, double valorCobrado, double multaCobrada) {
        this.dtLocacao = dtLocacao;
        this.dtDevolucaoPrevista = dtDevolucaoPrevista;
        this.dtDevolucaoEfetiva = null;
        this.valorCobrado = valorCobrado;
        this.multaCobrada = multaCobrada;
    }

    public Date getDtLocacao() {
        return dtLocacao;
    }

    public void setDtLocacao(Date dtLocacao) {
        this.dtLocacao = dtLocacao;
    }

    public Date getDtDevolucaoPrevista() {
        return dtDevolucaoPrevista;
    }

    public void setDtDevolucaoPrevista(Date dtDevolucaoPrevista) {
        this.dtDevolucaoPrevista = dtDevolucaoPrevista;
    }

    public Date getDtDevolucaoEfetiva() {
        return dtDevolucaoEfetiva;
    }

    public void setDtDevolucaoEfetiva(Date dtDevolucaoEfetiva) {
        this.dtDevolucaoEfetiva = dtDevolucaoEfetiva;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public double getMultaCobrada() {
        return multaCobrada;
    }

    public void setMultaCobrada(double multaCobrada) {
        this.multaCobrada = multaCobrada;
    }
    
    
    
    
}
