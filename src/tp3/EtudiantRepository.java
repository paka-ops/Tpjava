package tp3;

<<<<<<< HEAD
import java.lang.reflect.Member;
=======
>>>>>>> ea8aa00 (Sauvegarde locale avant rebase)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

<<<<<<< HEAD
import tp3.IEtudiant;
import tp3.Menbre;

public class EtudiantRepository implements IEtudiant {
    

    @Override
    public List<Double> getAllNotes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllNotes'");
    }

    @Override
    public List<Cour> getListCourByStudentName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getListCourByStudentName'");
    }

    @Override
    public Menbre findEtudiantByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findEtudiantByName'");
    }

    @Override
    public List<Menbre> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

=======
public class EtudiantRepository implements IEtudiant {

    private List<Menbre> EtudiantDataSource= new ArrayList<Menbre> (Arrays.asList(new Membre(11, "Ndiaye", "El Hadj", "781234567", "Cardiologie"),
    new Menbre("Alice", "alice@mail.com", "1234",
    new Cour(1, "Mathématiques", Arrays.asList("Algèbre", "Analyse"), TypeExamen.DEVOIR)),
    new Menbre("Bob", "bob@mail.com", "abcd",
    new Cour(2, "Informatique", Arrays.asList("Java", "Python"), TypeExamen.MINIPROJET)
      ));

    @Override
    public int getAllNotesByName(String name) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<String> getListCourByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }
    
>>>>>>> ea8aa00 (Sauvegarde locale avant rebase)
}
