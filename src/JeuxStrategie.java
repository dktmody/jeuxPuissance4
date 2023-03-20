import java.util.Scanner;
public class JeuxStrategie {
    public static void main(String[] args) {
        char[][] jeux = new char[6][7];
        afficheDebut();
        String[] jouer1 = initialiseJoueur();
        String[] jouer2 = initialiseJoueur();
        afficheJoueur(jouer1);
        afficheJoueur(jouer2);
        initialisationGrille(jeux);
        afficheGrille(jeux);
        demande_placement_de_jeton(jeux, jouer1, jouer2);
    }
    public static void afficheDebut() {
        System.out.println("---------------------------*-----------------------");
        System.out.print("----------------");
        System.out.print("Commencement du jeu");
        System.out.println("----------------");
    }
    public static String[] initialiseJoueur(){
        String nom, couleurJeton;
        System.out.println("Quel est le nom du joueur  ");
        Scanner scanner = new Scanner(System.in);
        nom = scanner.nextLine();
        System.out.println("Quel est la couleur de votre jeton ?");
        couleurJeton = scanner.nextLine();
        String[] joueur = {nom,couleurJeton , "21"};
        return joueur;
    }
    public static String afficheJoueur(String[] joueur){
        String infojoueur= joueur[0] + " a la couleur du jeton " + joueur[1] + " et a " + joueur[2] + " jeton(s)";
        System.out.println(infojoueur);
        return infojoueur;
    }
    public static char[][] initialisationGrille(char[][] tab){
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                tab[i][j] = '.';
            }
        }
        return tab;
    }
    public static void afficheGrille(char[][] tab){
        System.out.println(" 1 2 3 4 5 6 7");
        for (int i = 0; i < tab.length; i++){
            System.out.print("|");
            for (int j = 0; j < tab[i].length; j++){
                System.out.print(tab[i][j]);
                if ( j == 6){
                    System.out.print("");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
    }
    public static void demande_placement_de_jeton(char[][] tab, String[] jou1,String[] jou2){
        int col;
        int i = 1, numlig;
        boolean colVide =true;
        boolean victoire = false;
        boolean liveVerified = false;
        while(i<=42){
            if (i%2==0){
                System.out.println("Tour n° "+ i + ", joueur " + jou2[0]);
                System.out.println("Quelle est la colonne où vous souhaitez jouer ?");
                do{
                    System.out.println("Choissisez un nombre entre 1 et 7 !");
                    System.out.println("Si la colonne est remplie, veillez en choisir une autre!");
                    Scanner scanner = new Scanner(System.in);
                    col = scanner.nextInt();
                    colVide = verifCol(col, tab);
                }while(!colVide);
                modifColonne(tab, col, jou2);
                numlig = numLig(tab, col, jou2);
                victoire = verificationVictoireCol(jou2, tab, col);
                liveVerified = verificationVictoireLig(jou2, tab, numlig);
                System.out.println(numlig);
                if(victoire || liveVerified){
                    afficheVictoire(jou2, tab);
                    break;
                }else{
                    afficheGrille(tab);
                }
            }else {
                System.out.println("Tour n° "+ i + ", joueur " + jou1[0]);
                System.out.println("Quelle est la colonne où vous souhaitez jouer ?");
                do{
                    System.out.println("Choissisez un nombre entre 1 et 7 !");
                    System.out.println("Si la colonne est remplie, veillez en choisir une autre!");
                    Scanner scanner = new Scanner(System.in);
                    col = scanner.nextInt();
                    colVide = verifCol(col, tab);
                }while(!colVide);
                modifColonne(tab, col, jou1);
                numlig = numLig(tab, col, jou1);
                victoire = verificationVictoireCol(jou1, tab, col);
                liveVerified = verificationVictoireLig(jou1, tab, numlig);
                if(victoire || liveVerified){
                    afficheVictoire(jou1, tab);
                    break;
                }else{
                    afficheGrille(tab);
                }
            }
            i++;
        }
    }
    public static void modifColonne(char[][] tab, int n, String[] joueur){
        int num = numCol(tab, n); // n correspond à la colonne
        while((num == -1)){
            System.out.println("Veillez réessayer !");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            num = numCol(tab, n);
        };
            tab[num][n-1] = joueur[1].charAt(0);

    }
    public static int numCol(char[][] tab, int col){
        int num = -1; //
        for (int i = tab.length-1; i >= 0; i--){
            if (tab[i][col -1] == '.'){
                num = i;
                return num;
            }
        }

        return num;
    }
    public static int numLig(char[][] tab, int col, String [] joueur){
        int num = -1;
        for (int i = 0; i <= tab.length-1; i++){
            if (tab[i][col-1] == joueur[1].charAt(0)){
                num = i;
                return num;
            }
        }
        return num;
    }
    public static boolean verifCol(int col, char[][] tab){
        boolean vide = false;
        for (int i = tab.length-1; i >= 0; i--){
            if (tab[i][col -1] == '.'){
                vide = true;
            }
        }
        return vide;
    }
    public static boolean verificationVictoireCol (String[] joueur, char[][]tab, int col) {
        boolean victoire = false;
        int score = 0;
        for (int i = tab.length-1; i >= 0; i--){
            if (tab[i][col -1] == joueur[1].charAt(0)){
                score = score +1;
            }else{
                score = 0;
            }
            if (score == 4){
                victoire = true;
            }
        }
        return victoire;
    }
    public static boolean verificationVictoireLig (String[] joueur, char[][]tab, int lign) {
        boolean victoire = false;
        int score = 0;
        for (int i = tab[lign].length-1; i >= 0; i--){
                if (tab[lign][i] == joueur[1].charAt(0)){
                    score = score +1;
                }else{
                    score = 0;
                }

            if (score == 4){
                victoire = true;
            }
        }
        return victoire;
    }
    public static boolean verificationVictoireDia (String[] joueur, char[][]tab,int col, int lign) {
        boolean victoire = false;
        int score = 0;
        for (int i = tab[lign].length-1; i >= 0; i--){
            for (int j = 0; j < tab.length -1; j++){
                if (tab[lign][i] == joueur[1].charAt(0)){
                    score = score +1;
                }else{
                    score = 0;
                }
                if (score == 4){
                    victoire = true;
                }
            }
        }
        return victoire;
    }
    public static void afficheVictoire(String[] joueur, char[][] tab){
        System.out.println("Bravo " + joueur[0] + ", félicitations vous avez gagné! ");
        System.out.println("------------------*---------------------");
        System.out.print("--------------");
        System.out.print("Fin du jeu");
        System.out.println("----------------");
        afficheGrille(tab);
    }
}


