import java.util.Scanner;

public class ExoCompteBancairePage19 {
    public static void main(String[] args) {
        double francs, euros, tauxConvertion = 6.55957;
        int saisiUtilisateur;
        System.out.println("1. Créer un compte ");
        System.out.println("2. Afficher un compte ");
        System.out.println("3. Créer une ligne comptable ");
        System.out.println("4. Sortir ");
        System.out.println("5. De l'aide ");

        Scanner scanner = new Scanner(System.in);
        saisiUtilisateur = scanner.nextInt();
        switch ((int)saisiUtilisateur){
            case 1 :
                optionOne(saisiUtilisateur);
                break;
            case 2 :
                System.out.println("you're guest");
                break;
            default:
                System.out.println("unknown role");


        }

    }

    public static double convertEuroInFranc(double n){
        return n * 6.55957;
    }
    public static void optionOne(int n){
        System.out.println("Type de compte [types possibles : courant, joint, épargne]");
        System.out.println("Numéro du compte :");
        System.out.println("Prémière valeur créditée :");
        System.out.println("Taux de placement :");
    }
    public static void optionTwo(int n){
        String saisiUtilisateur;
        System.out.println("Quel est votre numéro de compte ?" +
         " un compte est en général constitué de 12 à chiffres!");
        Scanner scanner = new Scanner(System.in);
        saisiUtilisateur = scanner.nextLine();
        System.out.println("Votre numéro de compte est le suivant: " + saisiUtilisateur);

    }
    public static void optionTwhree(int n){
        System.out.println("Type de compte [types possibles : courant, joint, épargne]");
        System.out.println("Numéro du compte :");
        System.out.println("Prémière valeur créditée :");
        System.out.println("Taux de placement :");
    }
    public static void optionFour(int n){
        System.out.println("Type de compte [types possibles : courant, joint, épargne]");
        System.out.println("Numéro du compte :");
        System.out.println("Prémière valeur créditée :");
        System.out.println("Taux de placement :");
    }
    public static void optionFive(int n){
        System.out.println("Type de compte [types possibles : courant, joint, épargne]");
        System.out.println("Numéro du compte :");
        System.out.println("Prémière valeur créditée :");
        System.out.println("Taux de placement :");
    }
}

