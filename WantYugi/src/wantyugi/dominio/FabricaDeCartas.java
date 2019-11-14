/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.dominio;

/**
 *
 * @author 20161bsi0527
 */
public class FabricaDeCartas {
    public Carta geraCarta(String tipo){
        Carta novacarta = null;
        if(tipo.equalsIgnoreCase("monstro")){
            novacarta = new CartaMonstro();
        }else if(tipo.equalsIgnoreCase("armadilha")){
            novacarta = new CartaArmadilha();
        }else if(tipo.equalsIgnoreCase("magica")){
        
            novacarta = new CartaMagica();
        }
        return novacarta;
    }
}
