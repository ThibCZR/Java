public class SuperMutant extends Personnage {
    
    public SuperMutant(String nom) {
        super(nom);
        augmenterCompetence(Competence.AGILITE, 5);
       
    }
    @Override
    public void attaqueSpeciale() {
        System.out.println(getNom() + " utilise son attaque spéciale : Tir de précision !");
    }
}
