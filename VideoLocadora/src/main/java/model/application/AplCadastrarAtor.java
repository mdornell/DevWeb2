package model.application;

import model.dao.ConectionDAO;
import model.domain.Ator;
import org.hibernate.*;
import java.util.List;

public class AplCadastrarAtor {
    
    public void inserirAtor(Ator contato) {
        Transaction transaction = null;
        try (Session session = ConectionDAO.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(contato);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro :" + e);
        }
    }

    public List<Ator> listarAtor() {
        try (Session session = ConectionDAO.getSessionFactory().openSession()) {
            return session.createQuery("SELECT * FROM Ator", Ator.class).list();
        }
    }
}
