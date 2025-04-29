package tp3;

public class test {

    public static void main (String[] args ){
        MenbreRepository repository = new MenbreRepository();
        Menbre formateur = repository.getFormateurByidCour(2);
    
        if (formateur != null) {
            System.out.println( "nom"+formateur.gettName());
        } else {
            System.out.println("Aucun formateur trouvé pour ce cours.");
        }
    
}
}
