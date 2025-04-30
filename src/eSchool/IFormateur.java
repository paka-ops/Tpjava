import java.util.List;

public interface IFormateur {
    void addFormateur(Formateur formateur);
    List<Formateur> getAllFormateur();
    Formateur getFormateurByName(String name)throws EmptyException;
    List<Cours> getAllCoursByName(String name)throws EmptyException;
}
