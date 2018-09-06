
package Bean;

import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "accescontrolBEAN")
@RequestScoped
public class accescontrolBEAN {


    public accescontrolBEAN() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
    
    public String val(){
    if((this.login.equalsIgnoreCase("LUIS"))&&(this.key.equals("Admin123"))){
        return "Bienvenido";
    }else{
     return "error";    
    }      
 }
    
    
    
    
    private String login;
    private String key;
}
