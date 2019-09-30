/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wantyugi.dominio;


import java.util.List;
import javax.persistence.OneToMany;


/**
 *
 * @author 20161BSI0527
 */
public class Loja {

   String nomeLoja;
   String url;
   List<CartaLoja> lstcartaloja;
   int id;
   
   public String Webscrap(){
       
   
   return null;
   }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @OneToMany(mappedBy = "CartaLoja")
    public List<CartaLoja> getLstcartaloja() {
        return lstcartaloja;
    }

    public void setLstcartaloja(List<CartaLoja> lstcartaloja) {
        this.lstcartaloja = lstcartaloja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   public Boolean pingLoja(){
      
       
       return null;
   }
   
   
}
