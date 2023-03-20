import java.util.Scanner;

public class ExoCptbancaire {
    public static void main(String[] args) {
        double francs, euros, tauxConvertion = 6.55957;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saissisez le ombre de francs !");
        Scanner scanner = new Scanner(System.in);
        francs = scanner.nextDouble();
        System.out.println("Nombre de francs : " +francs);
        System.out.println("Conversion F/E : " +tauxConvertion);
    }

    public static double convertEuroInFranc(double n){
        return n * 6.55957;
    }
}
