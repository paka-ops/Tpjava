import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormateurRepository implements IFormateur {
     private List<Formateur> formateursDataSource = new ArrayList<Formateur>(
    Arrays.asList(
        new Formateur(1, "Ndiaye", "ndiaye@mail.com", "pass123", Arrays.asList(
            new Cours(101, "Mathématiques", Arrays.asList("Algèbre", "Géométrie"), TypeExamen.DEVOIR),
            new Cours(102, "Physique", Arrays.asList("Mécanique", "Optique"), TypeExamen.MINIPROJET)
        )),
        new Formateur(2, "Sow", "sow@mail.com", "sowpass", Arrays.asList(
            new Cours(103, "Informatique", Arrays.asList("Java", "Web"), TypeExamen.DEVOIR)
        )),
        new Formateur(3, "Ba", "ba@mail.com", "ba1234", Arrays.asList(
            new Cours(104, "Chimie", Arrays.asList("Organique", "Minérale"), TypeExamen.QCM),
            new Cours(105, "Biologie", Arrays.asList("Cellule", "Génétique"), TypeExamen.MINIPROJET)
        ))
    )
);
    @Override
    public void addFormateur(Formateur fomateur) {
        // TODO Auto-generated method stub
       formateursDataSource.add(fomateur);
    }

    @Override
    public List<Formateur> getAllFormateur() {
        // TODO Auto-generated method stub
        return formateursDataSource;
    }

    @Override
    public Formateur getFormateurByName(String name) throws EmptyException{
        // TODO Auto-generated method stub
        for(Formateur formateur : formateursDataSource){
            if(formateur.getName().equals(name)){
                return formateur;
            }else{
                throw new EmptyException("medecin non trouver");
            }
        }
        return null;
    }

    @Override
    public List<Cours> getAllCoursByName(String name) throws EmptyException {
        // TODO Auto-generated method stub
        for( Formateur formateur :formateursDataSource){
            if (formateur.getName().equals(name)) {
                return formateur.getCours();
            }else{
                throw new EmptyException("medecin non trouver");
            }
        }
        return null;
    }
    
}
