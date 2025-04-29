package tp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenbreRepository {
    private List<Menbre> menbreDataSource = new ArrayList<Menbre>(Arrays.asList( ));

    public Menbre getFormateurByidCour(long idCour) {
        for (Menbre menbre : menbreDataSource) {
            if (menbre.getCourEnseigne() != null && menbre.getCourEnseigne().getIdCour() == idCour) {
                return menbre;
            }
        }
        return null;
    }
}
