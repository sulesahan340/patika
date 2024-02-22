import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {

        int dogumYili;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz:");
        dogumYili = input.nextInt();

        if(dogumYili%12 == 0){
            System.out.println("çin zodyağı burcunuz: MAYMUN");
        }else if (dogumYili%12 ==1) {
            System.out.println("çin zodyağı burcunuz:HOROZ");
        }else if (dogumYili%12 ==2) {
            System.out.println("çin zodyağı burcunuz:KÖPEK");
        }else if (dogumYili%12 ==3) {
            System.out.println("çin zodyağı burcunuz:DOMUZ");
        }else if (dogumYili%12 ==4) {
            System.out.println("çin zodyağı burcunuz:FARE");
        }else if (dogumYili%12 ==5) {
            System.out.println("çin zodyağı burcunuz:ÖKÜZ");
        }else if (dogumYili%12 ==6) {
            System.out.println("çin zodyağı burcunuz:KAPLAN");
        }else if (dogumYili%12 ==7) {
            System.out.println("çin zodyağı burcunuz:TAVŞAN");
        }else if (dogumYili%12 ==8) {
            System.out.println("çin zodyağı burcunuz:EJDERHA");
        }else if (dogumYili%12 ==9) {
            System.out.println("çin zodyağı burcunuz:YILAN");
        }else if (dogumYili%12 ==10) {
            System.out.println("çin zodyağı burcunuz:AT");
        }else if (dogumYili%12 ==11) {
            System.out.println("çin zodyağı burcunuz:KOYUN");
        }



    }
}