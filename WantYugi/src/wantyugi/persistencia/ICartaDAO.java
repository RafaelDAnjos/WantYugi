/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.persistencia;

import java.util.List;
import wantyugi.dominio.Carta;

/**
 *
 * @author 20161BSI0527
 */
public interface ICartaDAO extends IGenericDAO{
    
    public List<Carta> buscaCartaApartirDiID(int identificador);
    
}