package com.cajero.controllers;


import com.cajero.models.Afiliaciones;
import static com.cajero.models.FileManagement.ingresar;
import com.cajero.models.MovementDAOMySQL;
import com.cajero.models.Person;
import com.cajero.models.PersonDAOMySQL;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author TODOS.
 */
@Named(value = "pb")
@ApplicationScoped
public class PersonBean implements Serializable{
    private Person p;
    private static final long serialVersionUID = 1L;
    private String id;
    private String password;
    private long monto;
    private String selectedDestino;
    private String selectedAccount;
    private String newPassword;
    private String newCorreo;
  
    public String login() {
       System.out.println(this.id); 
      Person user=new Person(Integer.parseInt(this.id));
      
      boolean aux=user.getPerson(Integer.parseInt(this.id),"I");
       
        if(user.getPassword().equals(password)&& aux==true){
            this.p=user;
            HttpSession session = this.getCurrentSession();
            session.setAttribute("usuario", this.getP().getId());
           ingresar("Intento de login de la tarjeta:"+this.id);
           return "dashboard";
        }else{
            FacesMessage fm = new FacesMessage(
                FacesMessage.SEVERITY_ERROR, "Usuario o clave incorrectos", "ERROR");
FacesContext.getCurrentInstance().addMessage(null, fm);
        return "error";
       } 
    
}
     // Cerrar sesión
    public String logout() {
        // Obtener la sesión actual
        HttpSession session = this.getCurrentSession();
        
        // Remuevo los atributos establecidos
        session.removeAttribute("usuario");
        session.removeAttribute("rol");
        
        // Invalido la sesión
        session.invalidate();
        
        return "login";
    }
    

    public String transferir() {
     
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd LLLL yyyy");
        Person destinatario=new Person(Integer.parseInt(this.selectedDestino), "C");
        boolean aux=destinatario.getPerson(Integer.parseInt(this.selectedDestino),"C");
        LocalDate hoy=LocalDate.now();
        int recorrer=this.p.getCuenta();
   
        MovementDAOMySQL movementModel=new MovementDAOMySQL();
        
            
                if(monto<p.getSaldo() && aux==true){
                      
                       p.setSaldo((p.getSaldo()-monto),p.getId(),"O");
                       destinatario.setSaldo((destinatario.getSaldo()+monto), Integer.parseInt(selectedDestino),"");
                       movementModel.insertMovement("Entrante",monto,hoy.format(formatter),Integer.parseInt(selectedDestino),p.getCuenta());
                       movementModel.insertMovement("Saliente",monto,hoy.format(formatter),p.getCuenta(),Integer.parseInt(selectedDestino));
                       return "about";
                }else{
                       return "error";
                }
                   
      
    }

    public HttpSession getCurrentSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
}

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }   
   
     public String[] listAfiliaciones() {
       Afiliaciones[] aux=this.p.getAfiliaciones();
        String[] lista;
        
       if(aux!=null){
          lista=new String[aux.length];
      
        int i=0;
       
        while(i<lista.length){
            lista[i]=Integer.toString(aux[i].getDestino());
            System.out.println(aux[i].getDestino());
            ++i;
        }
            
       
      }else{
           lista=new String[]{"hola","fuck"};
       }
      return lista;
   
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public void cambioCorreo() {
        PersonDAOMySQL aux=new PersonDAOMySQL();
        aux.updateCorreo(this.newCorreo, p.getId());
    }
    public void cambioClave() {
        PersonDAOMySQL aux=new PersonDAOMySQL();
        aux.updatePassword(this.newPassword, p.getId());
    }
    public String getSelectedDestino() {
        return selectedDestino;
    }

    public void setSelectedDestino(String selectedDestino) {
        this.selectedDestino = selectedDestino;
    }

    public String getSelectedAccount() {
        return selectedAccount;
    }

    public void setSelectedAccount(String selectedAccount) {
        this.selectedAccount = selectedAccount;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewCorreo() {
        return newCorreo;
    }

    public void setNewCorreo(String newCorreo) {
        this.newCorreo = newCorreo;
    }
    

}
