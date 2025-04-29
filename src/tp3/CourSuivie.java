package tp3;

import java.util.List;

import tp3.TypeExamen;

public class CourSuivie extends Cour {
    private Double note;
    
    public CourSuivie(long idCour,String nom,List<String> chapitres,TypeExamen typeExamen,double note){
        super(idCour,nom,chapitres,typeExamen);
        this.note = note;

    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    
}
