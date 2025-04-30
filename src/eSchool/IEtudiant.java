import java.util.List;

public interface IEtudiant {
    void addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantByName(String name)throws EmptyException;
    List<Double> getAllNoteByName(String name)throws EmptyException;
    List<CourSuivie> getAllCourSuivieByName(String name)throws EmptyException;
    CourSuivie getCourSuivieByName(String name,String nom)throws EmptyException;
}
