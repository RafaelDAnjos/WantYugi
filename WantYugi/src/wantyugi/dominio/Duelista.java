/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.dominio;

import java.util.List;

/**
 *
 * @author Rafael Afonso dos Anjos
 */
public class Duelista implements Observador {
    private String nome;
    private String email;
    private List<Carta>cartasfavoritas;
    public Duelista(){
        
    
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void favoritarCarta(Carta carta){
        this.cartasfavoritas.add(carta);
        
    }
    public void desfavoritarCarta(Carta carta){
        this.cartasfavoritas.remove(carta);    
    }

    public void update(Observavel ob) {
        System.out.println("Carta foi observada");
    }

}

