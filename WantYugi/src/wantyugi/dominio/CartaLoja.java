/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.dominio;
import java.util.List;
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
    Loja loja;

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

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
     
    public double calcularValorMaximo(List<CartaLoja> lstcartas){
        double maior;
        maior = lstcartas.get(0).valor;
        for(int i = 1; i<lstcartas.size();i++){
          
            
            if(maior < lstcartas.get(i).valor){
                maior = lstcartas.get(i).valor;
            }                    
        }
        
        return maior;
    }
    public double calcularValorMedio(List<CartaLoja> lstcartas){
        double soma = 0;
        for(int i =0; i<lstcartas.size();i++){
            soma = soma + lstcartas.get(i).valor;
        }
        return soma/lstcartas.size();
     
    }
    public double calcularValorMinimo(List<CartaLoja> lstcartas){
        double menor;
        menor = lstcartas.get(0).valor;
        for(int i =1;i<lstcartas.size();i++){
            if(menor > lstcartas.get(i).valor){
                menor = lstcartas.get(i).valor;
            }
        
        }
        return menor;
    }

} 
