 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.dominio;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import static org.hibernate.cfg.AvailableSettings.URL;
import static org.hibernate.type.StandardBasicTypes.URL;

/**
 *
 * @author rafae
 */
public class CartaFlyWeigth{
    private HashMap<String,Carta> cacheCartas = new HashMap(); 
    
    public void addCarta(Carta carta,Loja loja,float valor,String condicao){
        InputStream cacheImage = null;
        if(this.cacheCartas.containsKey(carta.getID())){
           carta = this.cacheCartas.get(carta.getID());
           
        }
        
        carta.addCartaLoja(loja, valor, condicao);        
        cacheCartas.put(carta.getID(),carta);
    
    }
   
    
}
