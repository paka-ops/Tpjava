package tp3;

import java.lang.reflect.Member;
import java.util.List;

import tp3.Cour;

public interface IEtudiant {

    public List<Double> getAllNotes();
     List<Cour> getListCourByStudentName(String name);
     Menbre findEtudiantByName(String name);
     List<Menbre> findAll();
     

}
