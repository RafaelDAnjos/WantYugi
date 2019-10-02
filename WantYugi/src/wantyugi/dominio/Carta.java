package wantyugi.dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael Afonso dos Anjos
 */
public class Carta {
    private String nome;
    private String identificador;
   
    public Carta(){
        
    
    
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
}
