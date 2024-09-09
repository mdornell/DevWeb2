package model.domain.controleAcervo;

import java.util.Date;

public class Item {
    private int numSerie;
    private Date dtAquisicao;
    private String tipoItem;

    public Item(int numSerie, Date dtAquisicao, String tipoItem) {
        this.numSerie = numSerie;
        this.dtAquisicao = dtAquisicao;
        this.tipoItem = tipoItem;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public Date getDtAquisicao() {
        return dtAquisicao;
    }

    public void setDtAquisicao(Date dtAquisicao) {
        this.dtAquisicao = dtAquisicao;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }
    
    
}
