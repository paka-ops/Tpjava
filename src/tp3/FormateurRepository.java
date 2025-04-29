package tp3;

import java.util.ArrayList;
import java.util.List;

public   class FormateurRepository implements IFormateur{
     private List<Menbre> formateursDataSource = new ArrayList<>();
    @Override
    public void addFormateur(Menbre menbre) {
        // TODO Auto-generated method stub
    
            if (menbre.getCourEnseigne() != null) {
                formateursDataSource.add(menbre);
            } else {
                System.out.println("Ce membre n’enseigne aucun cours !");
            }
        
    }

    @Override
    public void getAllFormateur() {
        // TODO Auto-generated method stub
        for (Menbre formateur : formateursDataSource) {
            System.out.println(formateur); // ou formateur.getName() etc.
        }
    }

    @Override
    public Menbre getFormateurByidCour(long idCour) {
        for (Menbre formateur : formateursDataSource) {
            if (formateur.getCourEnseigne() != null &&
                formateur.getCourEnseigne().getIdCour() == idCour) {
                return formateur;
            }
        }
        return null; 
    }
    }

   
