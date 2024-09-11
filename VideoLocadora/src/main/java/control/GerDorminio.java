package control;

import model.dao.*;
import model.domain.Ator;

public class GerDorminio {

    public GerDorminio() {
        ConectionDAO.getSessionFactory();
    }
    
    public Ator inserirAtor(String nome) {
        GenericDAO gerDAO = new GenericDAO();
        Ator ator = new Ator();
        
        ator.setNome(nome);
        gerDAO.inserir(ator);
        
        return ator;
    }

    public void excluirAtor() {
        GenericDAO gerDAO = new GenericDAO();

        gerDAO.excluir(this);
    }

    public void alterarAtor() {
        GenericDAO gerDAO = new GenericDAO();

        gerDAO.alterar(this);
    }
}
