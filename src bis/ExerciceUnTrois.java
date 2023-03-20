import java.util.Scanner;

public class ExerciceUnTrois {
    public static void main(String[] args) {

        // Déclaration des variables représentant le périmètre et le coté
        double perimetre, cote;

        // Déclaration de la variable représentant la lecture du clavier
        Scanner lectureClavier = new Scanner(System.in);

        // Afficher le message "Valeur du côté : " à l'écran
        System.out.println("Valeur du côté ?");

        // Lire au clavier une valeur
        // valeur  5 par exemple
        //Placer cette valeur dans la variable correspondante
        cote = lectureClavier.nextDouble();
        // Calculer le périmètre du carré
        perimetre = cote *4;
        // Afficher le résultat

        System.out.println("Le périmètre égal à " + perimetre);
    }
}
