package tp3;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class DataSource extends User implements IEtudiant ,IFormateur {
    public DataSource(String name, String mail,String password){
        super(name, mail, password);
    }
    private List<Menbre> menbres  = new ArrayList<>(
        Arrays.asList(
            new Menbre(
                "Alice Martin",
                "alice.martin@example.com",
                "pass1",
                new Cour(1, "Java", Arrays.asList("POO", "Exceptions", "Interfaces"), TypeExamen.DEVOIR),
                new CourSuivie(101, "Python", Arrays.asList("Syntaxe", "Modules", "Pandas"), TypeExamen.QCM, 15.0),
                Arrays.asList(14, 15, 16, 17, 18)
            ),
            new Menbre(
                "Bob Durand",
                "bob.durand@example.com",
                "pass2",
                new Cour(2, "Python", Arrays.asList("Syntaxe", "Modules", "Pandas"), TypeExamen.QCM),
                new CourSuivie(102, "C++", Arrays.asList("POO", "Templates", "STL"), TypeExamen.MINIPROJET, 12.5),
                Arrays.asList(11, 12, 13, 14, 15)
            ),
            new Menbre(
                "Charlie Dupont",
                "charlie.dupont@example.com",
                "pass3",
                new Cour(3, "C++", Arrays.asList("POO", "Templates", "STL"), TypeExamen.MINIPROJET),
                new CourSuivie(103, "Java", Arrays.asList("POO", "Exceptions", "Interfaces"), TypeExamen.DEVOIR, 17.0),
                Arrays.asList(18, 19, 17, 16, 20)
            ),
            new Menbre(
                "David Lemoine",
                "david.lemoine@example.com",
                "pass4",
                null,
                new CourSuivie(104, "SQL", Arrays.asList("Requêtes", "Jointures", "Index"), TypeExamen.QCM, 14.0),
                Arrays.asList(13, 14, 15, 16, 12)
            ),
            new Menbre(
                "Eva Nguyen",
                "eva.nguyen@example.com",
                "pass5",
                new Cour(5, "SQL", Arrays.asList("Requêtes", "Jointures", "Index"), TypeExamen.QCM),
                null,
                null
            ),
            new Menbre(
                "User6",
                "user6@example.com",
                "pass6",
                new Cour(106, "Cours6", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.QCM),
                new CourSuivie(206, "CoursSuivi6", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.QCM, 16.5),
                Arrays.asList(11, 12, 13, 14, 15)
            ),
            new Menbre(
                "User7",
                "user7@example.com",
                "pass7",
                null,
                new CourSuivie(207, "CoursSuivi7", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.DEVOIR, 17.5),
                Arrays.asList(12, 13, 14, 15, 16)
            ),
            new Menbre(
                "User8",
                "user8@example.com",
                "pass8",
                new Cour(108, "Cours8", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.MINIPROJET),
                null,
                null
            ),
            new Menbre(
                "User9",
                "user9@example.com",
                "pass9",
                null,
                new CourSuivie(209, "CoursSuivi9", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.QCM, 19.5),
                Arrays.asList(14, 15, 16, 17, 18)
            ),
            new Menbre(
                "User10",
                "user10@example.com",
                "pass10",
                new Cour(110, "Cours10", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.DEVOIR),
               null,
               null
            ),
            new Menbre(
                "User11",
                "user11@example.com",
                "pass11",
                null,
                new CourSuivie(211, "CoursSuivi11", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.QCM, 20.0),
                Arrays.asList(15, 16, 17, 18, 19)
            ),
            new Menbre(
                "User12",
                "user12@example.com",
                "pass12",
                null,
                new CourSuivie(212, "CoursSuivi12", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.DEVOIR, 18.0),
                Arrays.asList(17, 18, 19, 20, 19)
            ),
            new Menbre(
                "User13",
                "user13@example.com",
                "pass13",
                new Cour(113, "Cours13", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.MINIPROJET),
                new CourSuivie(213, "CoursSuivi13", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.MINIPROJET, 17.0),
                Arrays.asList(18, 19, 17, 20, 19)
            ),
            new Menbre(
                "User14",
                "user14@example.com",
                "pass14",
                new Cour(114, "Cours14", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.QCM),
                null,
                null
            ),
            new Menbre(
                "User15",
                "user15@example.com",
                "pass15",
                new Cour(115, "Cours15", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.DEVOIR),
                null,
                null
            ),
            new Menbre(
                "Alice Martin",
                "alice.martin@example.com",
                "pass1",
                new Cour(1, "Java", Arrays.asList("POO", "Exceptions", "Interfaces"), TypeExamen.DEVOIR),
                null,
                null
            ),
            new Menbre(
                "Bob Durand",
                "bob.durand@example.com",
                "pass2",
                null,
                new CourSuivie(102, "C++", Arrays.asList("POO", "Templates", "STL"), TypeExamen.MINIPROJET, 12.5),
                Arrays.asList(11, 12, 13, 14, 15)
            ),
            new Menbre(
                "Charlie Dupont",
                "charlie.dupont@example.com",
                "pass3",
                new Cour(3, "C++", Arrays.asList("POO", "Templates", "STL"), TypeExamen.MINIPROJET),
                null,
                null
            ),
            new Menbre(
                "David Lemoine",
                "david.lemoine@example.com",
                "pass4",
                new Cour(4, "Web", Arrays.asList("HTML", "CSS", "JS"), TypeExamen.DEVOIR),
                new CourSuivie(104, "SQL", Arrays.asList("Requêtes", "Jointures", "Index"), TypeExamen.QCM, 14.0),
                Arrays.asList(13, 14, 15, 16, 12)
            ),
            new Menbre(
                "Eva Nguyen",
                "eva.nguyen@example.com",
                "pass5",
                null,
                new CourSuivie(105, "Web", Arrays.asList("HTML", "CSS", "JS"), TypeExamen.DEVOIR, 16.5),
                Arrays.asList(14, 15, 13, 17, 18)
            ),
            new Menbre(
                "User6",
                "user6@example.com",
                "pass6",
                new Cour(106, "Cours6", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.QCM),
                null,
                null
            ),
            new Menbre(
                "User7",
                "user7@example.com",
                "pass7",
                null,
                new CourSuivie(207, "CoursSuivi7", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.DEVOIR, 17.5),
                Arrays.asList(12, 13, 14, 15, 16)
            ),
            new Menbre(
                "User8",
                "user8@example.com",
                "pass8",
                null,
                new CourSuivie(208, "CoursSuivi8", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.MINIPROJET, 18.5),
                Arrays.asList(13, 14, 15, 16, 17)
            ),
            new Menbre(
                "User9",
                "user9@example.com",
                "pass9",
                new Cour(109, "Cours9", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.QCM),
                null,
                null
            ),
            new Menbre(
                "User10",
                "user10@example.com",
                "pass10",
                new Cour(110, "Cours10", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.DEVOIR),
                new CourSuivie(210, "CoursSuivi10", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.DEVOIR, 10.5),
                Arrays.asList(10, 11, 12, 13, 14)
            ),
            new Menbre(
                "User11",
                "user11@example.com",
                "pass11",
                null,
                new CourSuivie(211, "CoursSuivi11", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.QCM, 20.0),
                Arrays.asList(15, 16, 17, 18, 19)
            ),
            new Menbre(
                "User12",
                "user12@example.com",
                "pass12",
                null,
                new CourSuivie(212, "CoursSuivi12", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.DEVOIR, 18.0),
                Arrays.asList(17, 18, 19, 20, 19)
            ),
            new Menbre(
                "User13",
                "user13@example.com",
                "pass13",
                new Cour(113, "Cours13", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.MINIPROJET),
                null,
               null
            ),
            new Menbre(
                "User14",
                "user14@example.com",
                "pass14",
                new Cour(114, "Cours14", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.QCM),
                new CourSuivie(214, "CoursSuivi14", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.QCM, 16.0),
                Arrays.asList(17, 18, 19, 20, 19)
            ),
            new Menbre(
                "User15",
                "user15@example.com",
                "pass15",
                new Cour(115, "Cours15", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.DEVOIR),
                new CourSuivie(215, "CoursSuivi15", Arrays.asList("Chap1", "Chap2", "Chap3"), TypeExamen.DEVOIR, 13.0),
                Arrays.asList(12, 13, 14, 15, 16)
            )
        
            // Continuez jusqu'à User50
        )
    );
    public void addMenbre(Menbre menbre) {
        menbres.add(menbre);
    }
    public List<Menbre> getAllMenbre(){
        return menbres;
    }
    public List<Menbre> getEtudiants() {
        List<Menbre> etudiants = new ArrayList<>();
    
        for (Menbre menbre : menbres) {
            if (menbre.getCourSuivie() != null) {
                etudiants.add(menbre);
            }
        }
    
        return etudiants;
    }
    public List<Menbre> getFormateur(){
        List <Menbre> formateurs = new ArrayList<>();

        for(Menbre menbre : menbres){
            if (menbre.getCourSuivie()==null) {
                formateurs.add(menbre);
            }
        }
        return formateurs;
        
    }
    @Override
    public List<Menbre> findAll() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Menbre findEtudiantByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public List<Double> getAllNotes() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public List<Cour> getListCourByStudentName(String name) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void addFormateur(Menbre menbre) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void getAllFormateur() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public Menbre getFormateurByidCour(long idCour) {
        // TODO Auto-generated method stub
        return null;
    }


}
