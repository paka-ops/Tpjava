public class test {
    public static void main (String[] args){
        EtudiantRepository er = new EtudiantRepository();
        //System.out.println("le nom de tout les prof: "+er.getAllEtudiants());

    
    //for(Etudiant etudiant : er.getAllEtudiants()){
     //   System.out.println("nom:"+etudiant.getName());
   // }
   try {
    er.getCourSuivieByName("Sow", "Informatique");
} catch (EmptyException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
}
}
