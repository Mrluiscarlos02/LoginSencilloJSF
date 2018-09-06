
package Bean;

import javax.annotation.ManagedBean;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.behavior.FacesBehavior;
import javax.faces.context.FacesContext;


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
    
      public boolean isSesion() {
        return sesion;
    }

    public void setSesion(boolean sesion) {
        this.sesion = sesion;
    }
    
    public String val(){        
    if((this.login.equalsIgnoreCase("LUIS"))&&(this.key.equals("Admin123"))){
        sesion=true; // para ocultar contenido en el form
        return "Bienvenido";          
    }else{
        sesion=false;
     return "error";    
    }      
 }
    
    
    /*
    public boolean verificarSesion(){
    
    boolean estado;
    if(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(login)==null){
        estado=false;
    } else{
        estado=true;
    }
    return estado;
    
 }
    
    
    
    public String cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return"index?faces-redirect=true";
    }
    
    */
    
    private String login;
    private String key;
    boolean sesion=false;
}
