import java.util.List;

public class Etudiant extends User {
    private List<CourSuivie> courSuivie;

    public Etudiant(long id,String mame,String mail,String password,List<CourSuivie> courSuivie){
        super(id, mame, mail,password);
        this.courSuivie=courSuivie;
    }

    public List<CourSuivie> getCourSuivie() {
        return courSuivie;
    }

    public void setCourSuivie(List<CourSuivie> courSuivie) {
        this.courSuivie = courSuivie;
    }

}
