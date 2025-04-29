package tp3;

import java.util.List;

public interface IFormateur {
     
     Menbre getFormateurByidCour(long idCour);
     void addFormateur(Menbre menbre);
     void getAllFormateur();

}
