/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.dominio;
import wantyugi.dominio.Loja;
import wantyugi.dominio.Carta;
/**
 *
 * @author Rafael Afonso dos Anjos
 */
public class CartaLoja {
    private float  valor;
    private String dataEntrada;
    Carta  carta;
    private String condicao;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

  
    
    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }
     
    public float calcularValorMaximo(){
        
        return 0;
    }
    public float calcularValorMedio(){
        return 0;
    }

} 
