
import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18,kdvtutar, kdvlitutar;
        Scanner kdv = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        tutar = kdv.nextDouble();


        kdvtutar = tutar * kdvOran;
        kdvlitutar = kdvtutar + tutar;

        System.out.println("girdiğiniz sayı:" + tutar);
        System.out.println("girdiğiniz sayının kdv oranı:" + kdvOran);
        System.out.println("girdiğiniz sayının kdv tutarı:" + kdvtutar);
        System.out.println("girdiğiniz sayının kdvli hali:" + kdvlitutar);


    }
}
