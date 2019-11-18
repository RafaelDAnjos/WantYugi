/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.dominio;

import java.util.HashMap;

/**
 *
 * @author rafae
 */
public class ImagemFlyWeigth {
    private HashMap<String,Imagem> cacheImagens = new HashMap<>(); 
    
    public void addImagem(Imagem imagem){
        cacheImagens.put(imagem.getUrl(), imagem);
    
    }
    public Imagem getUrlCarta(String url){
        return (Imagem)cacheImagens.get(url);
    
    }
    
}
