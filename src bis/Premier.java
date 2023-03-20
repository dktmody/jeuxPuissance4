import java.util.Scanner;

public class Premier {
    public static void main(String[] args) {

        double a ;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Entrez une valeur: ");
        a = lectureClavier.nextDouble();
        System.out.print("Vous avez entré : " + a);
    }

    /*
    a) Les instructions définissant la fonction main sont :
    La main fonction sert de point de départ pour l'exécution du programme. Elle contrôle généralement l'exécution du programme en dirigeant les appels à d'autres fonctions du programme.
    b) L'instruction d'affichage dans ce petit programme est System.out.print
    c) Le rôle de l'instruction double a; est le fait qu'on a déclaré un variable nommé a, de type double.
    d) Le programme s'exécute comme suit:
    ligne 6 déclaration de variable nommé a de type double
    ligne 7 création de variable avec le mot clé new de type scanner, cette variable nous sert à manipuler les entrées de l'utilisateur
    ligne 8 on affiche "Entrez une valeur: "
    ligne 9 on affecte à la variable a le double de valeur saisie par l'utilisateur, car elle a été stocké dans la variable lectureClavier
    ligne 10 on affiche la chaine de caractère "vous avez entré: " concaténée avec la valeur de la variable a




     */

}