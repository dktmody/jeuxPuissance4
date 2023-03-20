import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ExoUnQuatre {
    public static void main(String[] args) {

        // Nous allons avoir besoin de 3 variables comme suit
        double largeur, longeur, surface;
        // Il faudrait saisir 2 valeur au clavier

        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Valeur de la largeur ?");

        largeur = lectureClavier.nextDouble();

        Scanner lectureClavierLonquer = new Scanner(System.in);
        System.out.println("Valeur de la longueur ?");
        longeur = lectureClavier.nextDouble();
        // Calculer le périmètre du carré
        surface = largeur *longeur;
        // Afficher le résultat

        System.out.println("La surface du rectangle est  " + surface);
        /*
        char c1=  'o', c2 = 'u', c3 ='i';
        String ok  ;
        ok = ""+c1+c2+c3;
        System.out.println(ok);
        int i, j, valeur;
        int a = 5, b = 7;
        a = b; b = a;
        System.out.println(a);
        System.out.println(a);


        int i, j;
        double x = 2.0, y = 3.0;
        j = 100 % 6;
        i = 5 % 8;
        // (3 * i - 2 * j)/ (2 * x - y);
        // 2 * ((i/5) + (4*(j-3)) % (1+j-2))
        // (i-3*j) / (x +2*y) / (i-j)
        int valeur = 7, chiffre =2, i1, i2;
        float f1, f2;
        i1 =   valeur /chiffre ;
        i2 =  chiffre / valeur ;
        f1 = (float) (valeur/chiffre);
        f2 = (float) (valeur/chiffre) + 0.5f;
        i1 = (int) f1;
        i2 =(int) f2;
        f1 = (float) valeur / (float) chiffre;
        f2 = (float) valeur / (float) chiffre +0.5f;
        i2 = (int) f2;
        Date date=  new Date();
        System.out.println("i1 égale : "+ i2);
        int i = 223, j = 135;
        float a = 355.5f, b = 20.5f;
        char R = 'R', T = 'T';
        System.out.println("Vous avez entré : " + i);
        System.out.println("Pour un montant de " + a + " le montant vaut : " + i + j);
        System.out.print("Après réduction de  : " + b + " %, vous gagnez : ");
        System.out.println((a*b) /100 + " euros");
        System.out.print("La variable R = " + R + " et T = " + T);
        int i, j;
        i = 2;
        j = ++i;
        //i = 2 et j = 1
        System.out.print("La valeur de i = " + i + ", ainsi que la valeur de j = " + j);
        int[] tab = new int[4];

        tab[0] = 9;
        tab[2] = 10;
        tab[3] = 56;
        tab[1] = 23;

        for (int v : tab) {
            System.out.println(v);
        }
        */


        List<String> names = Arrays.asList("tom", "john", "shishi");
        List<Integer> nums = Arrays.asList(1, 2, 6, 9);
        //nums.foreach(n -> System.out.println(n));
        nums.forEach(n ->System.out.println(n));










































    }
}
