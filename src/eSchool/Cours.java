import java.util.List;

public class Cours {
     
    private  long idCours;
    private String nom;
    private  List<String> chapitre;
    private TypeExamen  typeExamen;
    
    public Cours(long idCours, String nom, List<String> chapitre, TypeExamen typeExamen) {
        this.idCours = idCours;
        this.nom = nom;
        this.chapitre = chapitre;
        this.typeExamen = typeExamen;
    }
    public long getIdCours() {
        return idCours;
    }
    public void setIdCours(long idCours) {
        this.idCours = idCours;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public List<String> getChapitre() {
        return chapitre;
    }
    public void setChapitre(List<String> chapitre) {
        this.chapitre = chapitre;
    }
    public TypeExamen getTypeExamen() {
        return typeExamen;
    }
    public void setTypeExamen(TypeExamen typeExamen) {
        this.typeExamen = typeExamen;
    }
    
    
}
