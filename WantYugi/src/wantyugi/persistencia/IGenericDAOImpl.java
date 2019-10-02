/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.persistencia;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Rafael Afonso dos Anjos
 */
public class IGenericDAOImpl<T> implements IGenericDAO<T> {
    protected static Session sessao;
    protected static Transaction transacao;

    @Override
    public void inserir(Object obj) throws Exception {
          sessao = HibernateUtil.getSession();
            transacao = sessao.beginTransaction();
            sessao.save(obj);
            sessao.flush();
            transacao.commit();
            sessao.close();
    }

    @Override
    public void alterar(T obj) throws Exception {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        sessao.update(obj);
        transacao.commit();
        sessao.close();
        
    }

    @Override
    public void deletar(T obj) throws Exception {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        sessao.delete(obj);
        transacao.commit();
        sessao.close();
    }

    @Override
    public List listar(Class clazz) throws Exception {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List objts;
        objts = null;
        Criteria selectAll = sessao.createCriteria(clazz);
        transacao.commit();
        objts = selectAll.list();
        sessao.close();
        return objts;
    }

   
    @Override
    public T listar(Class clazz, String pk) throws Exception {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        //Object objt = sessao.load(clazz, new Integer(Integer.parseInt(pk)) );
        Object ob =  sessao.load(clazz, new Integer(Integer.parseInt(pk)));
        transacao.commit();
        sessao.flush();
        sessao.close();
        return (T)ob;
    }

    @Override
    public void rollBack() {
        transacao.rollback();
        sessao.close();
    }
    
}
