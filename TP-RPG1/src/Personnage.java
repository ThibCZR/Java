import java.util.EnumMap;
import java.util.Map;

public class Personnage {
    private String nom;
    private Map<Competence, Integer> competences;

    // Constructeur
    public Personnage(String nom) {
        this.nom = nom;
        this.competences = new EnumMap<>(Competence.class);
        initialiserCompetences();
    }

    private void initialiserCompetences() {
        for (Competence competence : Competence.values()) {
            competences.put(competence, 0);
        }
    }
    
    public void augmenterCompetence(Competence competence, int points) {
        int niveauActuel = competences.get(competence); // Récupérer le niveau actuel de la compétence
        int nouveauNiveau = niveauActuel + points; // Calculer le nouveau niveau en ajoutant les points
        competences.put(competence, nouveauNiveau); // Mettre à jour le niveau de la compétence dans la map
    }
    
    public int getNiveauCompetence(Competence competence) {
        return competences.get(competence);
    }

    // Méthode pour afficher les compétences du personnage
    public void afficherCompetences() {
        System.out.println("Compétences de " + nom + " :");
        for (Competence competence : Competence.values()) {
            System.out.println(String.format("%-10s \t niveau : %d",competence, getNiveauCompetence(competence)));
        }
    }

    public void attaqueSpeciale(){

    }
    
  
}