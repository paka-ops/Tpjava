package tp3;

import java.util.List;

public class Cour{
    private long idCour;
    private String nom;
    private List<String> chapitre;
    private TypeExamen typeExamen;

    public Cour (long idCour, String nom,List<String> chapitre,TypeExamen typeExamen){
        this.idCour=idCour;
        this.nom=nom;
        this.chapitre=chapitre;
        this.typeExamen=typeExamen;
    }

    public long getIdCour() {
        return idCour;
    }
    public void setIdCour(long idCour) {
        this.idCour = idCour;
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