package model.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class GenericDAO {

    public GenericDAO() {
    }
    
    public static void inserir(Object obj) throws HibernateException {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = ConectionDAO.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            // OPERAÇÕES
            sessao.save(obj);

            transacao.commit();
        } catch (HibernateException erro) {
            if (transacao != null) {
                transacao.rollback();
            }
            throw new HibernateException(erro);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
    }

    public static void alterar(Object obj) throws HibernateException {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = ConectionDAO.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            // OPERAÇÕES
            sessao.update(obj);

            transacao.commit();
        } catch (HibernateException erro) {
            if (transacao != null) {
                transacao.rollback();
            }
            throw new HibernateException(erro);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
    }

    public static void excluir(Object obj) throws HibernateException {
        Session sessao = null;
        Transaction transacao = null;

        try {
            sessao = ConectionDAO.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();

            // OPERAÇÕES
            sessao.delete(obj);

            transacao.commit();
        } catch (HibernateException erro) {
            if (transacao != null) {
                transacao.rollback();
            }
            throw new HibernateException(erro);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
    }
    
    public static List listar(Class classe ) throws HibernateException {
        Session sessao = null;
        List lista = null;
        
        try {
            sessao = ConectionDAO.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(classe);
            consulta.from(classe);
            lista = sessao.createQuery(consulta).getResultList();            

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
        return lista;
    }
}
