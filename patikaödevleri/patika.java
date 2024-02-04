import java.util.Scanner;

public class patika {
    public static void main(String[] args) {
        Scanner ortalama = new Scanner(System.in);
        int a,b,c,d,e,f;

        System.out.println("Lütfen matematik notunuzu giriniz:");
        a = ortalama.nextInt();

        System.out.println("Lütfen fizik notunuzu giriniz:");
        b = ortalama.nextInt();

        System.out.println("Lütfen kimya notunuzu giriniz:");
        c = ortalama.nextInt();

        System.out.println("Lütfen türkçe notunuzu giriniz:");
        d = ortalama.nextInt();

        System.out.println("Lütfen tarih notunuzu giriniz:");
        e = ortalama.nextInt();

        System.out.println("Lütfen müzik notunuzu giriniz:");
        f = ortalama.nextInt();

        int ort = (a + b+ c+ d+ e+ f);
        double sonuc = (ort)/6d;
        System.out.println("ortalamanız:" +sonuc);

        String s = sonuc > 60 ? "sinifigecti": "siniftakaldi";
        System.out.println("Geçme durumunuz:"+s);




    }
}
