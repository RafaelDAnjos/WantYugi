package wantyugi.dominio;

import java.util.List;
import javax.persistence.OneToMany;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael Afonso dos Anjos
 */
public abstract class Carta {
    private String nome;
    private String identificador;
    private String raridade;
    private String desc;
    private Imagem imagem;
    private List<CartaLoja> listaCartaLoja;
    public Carta(){
        
    
    }
    public String getID(){
        return this.identificador+this.raridade;
        
}
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public float calcularValorMinimo(){
        return 0;
    }
    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @OneToMany(mappedBy = "CartaLoja")
    public List<CartaLoja> getListaCartaLoja() {
        return listaCartaLoja;
    }
    public void addCartaLoja(Loja loja,float valor,String condicao){
        if( !lojaEmLista(loja)){
            
        CartaLoja novacartaloja = new CartaLoja();
        novacartaloja.setValor(valor);
        novacartaloja.setCarta(this);
        novacartaloja.setCondicao(condicao);
        novacartaloja.setLoja(loja);
        
        this.listaCartaLoja.add(novacartaloja);

        }
        
            
    }
    private boolean lojaEmLista(Loja loja){
        for(int i =0;i< this.listaCartaLoja.size();i++){
            CartaLoja cartaloja = listaCartaLoja.get(i);
            if( cartaloja.carta.equals(this)){
                if(cartaloja.getLoja().equals(loja)){
                
                    return true;
                }
            }
        
        
         }
        return false;      
    }
    
    
    public void setListaCartaLoja(List<CartaLoja> listaCartaLoja) {
        this.listaCartaLoja = listaCartaLoja;
    }
    
}
