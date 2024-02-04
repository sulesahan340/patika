import java.util.Scanner;

public class dairealanı {
    public static void main(String[] args) {
        double yaricap,alan,cevre,pi=3.14,sabit=2;

        System.out.println("Lütfen yarıçapı giriniz:");
        Scanner input = new Scanner(System.in);
        yaricap = input.nextDouble();

        alan = pi*yaricap*yaricap;
        cevre = sabit*pi*yaricap;
        System.out .println("girdiğiniz dairenin alanı: "+alan);
        System.out .println("girdiğiniz dairenin cevresi: "+cevre);



    }
}