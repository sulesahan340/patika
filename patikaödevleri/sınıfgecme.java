import java.util.Scanner;

public class sınıfıgecme {
    public static void main(String[] args) {
        int mat,turkce,fizik,kimya,muzik;

        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat= input.nextInt();

        System.out.println("türkçe notunuzu giriniz:");
        turkce= input.nextInt();

        System.out.println("fizik notunuzu giriniz:");
        fizik= input.nextInt();

        System.out.println("kimya notunuzu giriniz:");
        kimya= input.nextInt();

        System.out.println("müzik notunuzu giriniz:");
        muzik= input.nextInt();


        double ort =(mat+turkce+fizik+kimya+muzik)/5;



        if(ort>55){
            System.out.println("sınıfı geçtiniz tebrikler");
        }
        else{
            System.out.println("sınıf tekrarı üzgünüm");
        }
        System.out.println("ortalamanız:"+ort);
    }
}
