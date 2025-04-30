
import java.util.List;

public class Formateur extends User {


    private List<Cours> cours;
    
    public Formateur(long id,String mame,String mail,String password,List<Cours>cours){
        super(id, mame, mail,password);
        this.cours=cours;
    }

    public List<Cours> getCours() {
        return cours;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }

}
