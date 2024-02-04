import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {


        double yol,tutar,baslangic=10,sabit=2.20;

        System.out.print("Gittiğiniz kilometreyi yazınız:");
        Scanner girdi = new Scanner(System.in);
        yol = girdi.nextDouble();

        tutar = baslangic + (yol*sabit);
        tutar= (tutar <= 20) ? 20 : tutar;
        System.out.println("taksi ücretiniz:"+ tutar);






    }
}