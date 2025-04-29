package tp3;
public abstract class User{
    
    public String name;
    public String mail;
    public String password;

    public User(String name,String mail,String password){
        this.name= name;
        this.mail=mail;
        this.password=password;
    }

    public String gettName(){
        return name;
    }
    public void  setName(String name){
         this.name=name;
    }

    public String getMail(){
        return mail;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public String getpassword(){
        return password;
    }
    public void setPassword(String password){
         this.password=password;
    }
}
