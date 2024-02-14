import java.util.Scanner;

public class vücutkitleindeksi {
    public static void main(String[] args) {

        double boy,kilo,vki;
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen boyunuzu giriniz(metre cinsinden):");
        boy = input.nextDouble();

        Scanner girdi = new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz(kilogram cinsinden):");
        kilo = girdi.nextDouble();

        vki = kilo/(boy*boy);
        System.out.println("vücut kitle indeksiniz:"+ vki);






    }
}