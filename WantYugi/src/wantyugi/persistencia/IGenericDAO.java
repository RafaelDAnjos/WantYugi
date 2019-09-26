/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.persistencia;

import java.util.List;
/**
 *
 * @author 20161BSI0527
 * @param <T>
 */
public interface IGenericDAO<T>{
    public void inserir(T obj) throws Exception;
    public void alterar(T obj) throws Exception;
    public void deletar(T obj) throws Exception;
    public List<T> listar(Class clazz) throws Exception;
    public T listar(Class clazz, String pk) throws Exception;
    public void rollBack();
}
