import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EtudiantRepository implements IEtudiant{

    private List<Etudiant> etudiantsDataSource = new ArrayList<>(Arrays.asList(
        new Etudiant(1, "Sow", "sow@mail.com", "pass123", Arrays.asList(
            new CourSuivie(101, "Mathématiques", Arrays.asList("Algèbre", "Analyse"), TypeExamen.DEVOIR, 15.5),
            new CourSuivie(102, "Physique", Arrays.asList("Optique", "Mécanique"), TypeExamen.MINIPROJET, 13.0)
        )),
        new Etudiant(2, "Diallo", "diallo@mail.com", "pass456", Arrays.asList(
            new CourSuivie(103, "Informatique", Arrays.asList("Java", "Web"), TypeExamen.QCM, 18.0)
        )),
        new Etudiant(3, "Fall", "fall@mail.com", "pass789", Arrays.asList(
            new CourSuivie(104, "Chimie", Arrays.asList("Organique", "Minérale"), TypeExamen.MINIPROJET, 12.5),
            new CourSuivie(105, "Biologie", Arrays.asList("Cellule", "Génétique"), TypeExamen.DEVOIR, 14.0)
        ))
    ));
    


    @Override
    public void addEtudiant(Etudiant etudiant) {
        etudiantsDataSource.add(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        // TODO Auto-generated method stub
        return etudiantsDataSource;
    }


    @Override
    public Etudiant getEtudiantByName(String name) throws EmptyException{
        // TODO Auto-generated method stub
            for(Etudiant etudiant: etudiantsDataSource){
                if (etudiant.getName().equals(name)) {
                    return etudiant;
                }
            }
            return null;
    }

    @Override
    public List<Double> getAllNoteByName(String name) throws EmptyException{
        for (Etudiant etudiant : etudiantsDataSource) {
            if (etudiant.getName().equals(name)) {
                List<Double> notes = new ArrayList<>();
                for (CourSuivie courSuivie : etudiant.getCourSuivie()) {
                    notes.add(courSuivie.getNote());
                }
                return notes;
            }
        }
        return new ArrayList<>(); 
    }

    @Override
    public List<CourSuivie> getAllCourSuivieByName(String name) throws EmptyException{
        // TODO Auto-generated method stub
        for(Etudiant etudiant :etudiantsDataSource){
            if (etudiant.getName().equals(name)) {
                return etudiant.getCourSuivie();
            }else{
                throw new EmptyException("medecin non trouver");
            }
            
        }
        return null;
    }

    @Override
    public CourSuivie getCourSuivieByName(String name,String nom ) throws EmptyException{
        // TODO Auto-generated method stub
        
        for(Etudiant etudiant: etudiantsDataSource){
            if (etudiant.getName().equals(name)) {
                int i =0;
                List<CourSuivie> listeCours = etudiant.getCourSuivie();
                while (i<etudiant.getCourSuivie().size()) {
                    
                    CourSuivie cs = listeCours.get(i);
                    if(cs.getClass().equals(nom)){
                        return cs;
                    }
                    i++;
                }
                throw new EmptyException("Aucun etudiant a ce nom.");
                
            }
        }

        throw new EmptyException("Aucun cours trouvé pour cet étudiant.");
        
    }
    
}
