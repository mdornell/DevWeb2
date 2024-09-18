package model.application;

import model.domain.Ator;
import java.util.List;
import model.dao.GenericDAO;

public class AplCadastrarAtor {
    
    public void inserirAtor(Ator ator) {
        GenericDAO.inserir(ator);
    }

    public List<Ator> listarAtor(Class c) {
        return GenericDAO.listar(c);   
    }
    
    public void atualizarAtor(Ator ator){
        GenericDAO.alterar(ator);
    }
    
    public void excluirAtor(Ator ator){
        GenericDAO.excluir(ator);
    }
}
