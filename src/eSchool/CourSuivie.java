import java.util.List;

public class CourSuivie extends Cours{
    private Double note;

    public CourSuivie(long idCours, String nom, List<String> chapitre, TypeExamen typeExamen,Double note){
        super(idCours,nom,chapitre,typeExamen);
        this.note=note;
    }

    

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }


}
