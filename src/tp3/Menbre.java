package tp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menbre extends User implements IEtudiant, IFormateur {

    private Cour courEnseigne;
    private CourSuivie courSuivie;
    @Override
    public List<String> getListCourByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Menbre getFormateurByidCour(long idCour) {
        // TODO Auto-generated method stub
        return null;
    }

    private List<Integer> notes;

    public Menbre(String name, String mail, String password, Cour courEnseigne, CourSuivie courSuivie, List<Integer> notes) {
        super(name, mail, password);
        this.courEnseigne = courEnseigne;
        this.courSuivie = courSuivie;
        this.notes = notes;
    }

    private List<Menbre> menbreDataSource = new ArrayList<>(Arrays.asList(
        new Menbre("Alice", "alice@mail.com", "1234",
            new Cour(1, "Mathématiques", Arrays.asList("Algèbre", "Analyse"), TypeExamen.DEVOIR),
            new CourSuivie(14.5),
            Arrays.asList(12, 14, 16)
        ),
        new Menbre("Bob", "bob@mail.com", "abcd",
            new Cour(2, "Informatique", Arrays.asList("Java", "Python"), TypeExamen.MINIPROJET),
            new CourSuivie(18.0),
            Arrays.asList(17, 18, 19)
        ),
        new Menbre("Claire", "claire@mail.com", "pass",
            new Cour(3, "Physique", Arrays.asList("Mécanique", "Optique"), TypeExamen.QCM),
            new CourSuivie(12.75),
            Arrays.asList(10, 13, 15)
        ),
        new Menbre("David", "david@mail.com", "secret",
            new Cour(4, "Chimie", Arrays.asList("Organique", "Minérale"), TypeExamen.MINIPROJET),
            new CourSuivie(16.25),
            Arrays.asList(15, 16, 18)
        )
    ));

    public Cour getCourEnseigne() {
        return courEnseigne;
    }

    public void setCourEnseigne(Cour courEnseigne) {
        this.courEnseigne = courEnseigne;
    }

    public CourSuivie getCourSuivie() {
        return courSuivie;
    }

    public void setCourSuivie(CourSuivie courSuivie) {
        this.courSuivie = courSuivie;
    }

    public List<Integer> getNotes() {
        return notes;
    }

    public void setNotes(List<Integer> notes) {
        this.notes = notes;
    }

    @Override
    public int getAllNotes() {
        return 0; // ou la logique réelle si tu l’as
    }

   
}
