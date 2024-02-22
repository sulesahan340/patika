import java.util.Scanner;

public class ucakbileti2 {
    public static void main(String[] args) {
        int yas, mesafe, yTipi;

        Scanner input = new Scanner(System.in);
        System.out.println("yaşınızı giriniz:");
        yas = input.nextInt();

        System.out.println("gideceğiniz mesafeyi giriniz:");
        mesafe = input.nextInt();

        System.out.println("yolculuk tipinizi seçiniz:1=> tek yön  2=> gidiş dönüş");
        yTipi = input.nextInt();

        double normalTutar,yasIndirimOrani,tipIndirimi;


        if (yas > 0 && mesafe>0 && (yTipi==1 || yTipi==2)) {
            normalTutar = mesafe * 0.10;
            if (yas < 12) {
                yasIndirimOrani = normalTutar * 0.50;
            } else if (yas > 12 && yas < 25) {
                yasIndirimOrani = normalTutar * 0.10;
            } else if (yas > 65) {
                yasIndirimOrani = normalTutar * 0.30;
            } else {
                yasIndirimOrani = 0;
            }
            normalTutar -= yasIndirimOrani;
            if (yTipi == 2) {
                tipIndirimi = normalTutar * 0.20;
                normalTutar = (normalTutar - tipIndirimi) * 2;
            }
            System.out.println("bilet tutarı:" + normalTutar);

        }else{
            System.out.println("geçersiz bir sayı girdiniz");
        }




    }
}