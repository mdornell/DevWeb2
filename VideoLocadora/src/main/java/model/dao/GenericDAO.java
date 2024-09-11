package model.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class GenericDAO {

    public GenericDAO() {
    }
    
    public void inserir(Object obj) throws HibernateException {
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

    public void alterar(Object obj) throws HibernateException {
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

    public void excluir(Object obj) throws HibernateException {
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
}
