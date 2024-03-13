import java.util.Scanner;

public class AppAscenseur {
    public static void main(String[] args) {
        Ascenseur ascenseur = new Ascenseur(-2, 8);

        System.out.println(ascenseur.toString()+"\n");
        
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            System.out.print("Entrez l'étage appelé (-2 / 8) : ");
            int etageAppel = scanner.nextInt();
            ascenseur.va(etageAppel);

            System.out.print("Ascenseur arrivé à l'étage " + ascenseur.getEtageCourant() + ". Entrez l'étage de destination (-2 / 8) : ");
            int etageDestination = scanner.nextInt();
            ascenseur.va(etageDestination);
        }
    }
}
