/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.persistencia;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import wantyugi.dominio.Carta;

/**
 *
 * @author Rafael Afonso dos Anjos

 */
public class ICartaDAOImpl extends IGenericDAOImpl<Carta> implements ICartaDAO {
    protected static Session sessao;
    protected static Transaction transacao;

    ICartaDAOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List<Carta> buscaCartaApartirDoNome(Carta carta){
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List<Carta> listaCartas =  sessao.createQuery("from cartas where nome ="+carta.getNome()).list();
        transacao.commit();
        sessao.close();
        return listaCartas;    
    }

}
