/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class Observavel {
    ArrayList<Observador> observadores = new ArrayList();
    
    
    public ArrayList<Observador> getMonitores(){
        return observadores;   
    
    }


public void addMonitor(Observador ob){
   this.observadores.add(ob);
}

public void notificar(){
    for(Observador ob: observadores){
        ob.update(this);
    }

}




}



