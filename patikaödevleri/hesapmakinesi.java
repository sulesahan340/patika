import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        int number1,number2,sayi;

        Scanner input = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz:");
        number1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz:");
        number2 = input.nextInt();

        System.out.println("yapmak istediğiniz işlemi seçiniz :\n 1= Toplama\n2= çıkarma\n3= çarpma\n4=bölme\n");
        sayi = input.nextInt();




        switch (sayi){
            case 1:
                System.out.println("toplam= "+(number1 + number2));
                break;

            case 2:
                System.out.println("cıkarma işlemi sonucunuz:"+(number1 - number2));
                break;

            case 3:
                System.out.println("çarpma işlemi sonucunuz:"+(number1 *  number2));
                break;

            case 4:
                if (number2==0){
                    System.out.println("hiçbir sayı sıfıra bölünemez!!");
                }
                System.out.println("bölme işlemi sonucunuz:"+(number1 / number2) );
                break;

            default:
                System.out.println("geçersiz bir işlem girdiniz");

        }



    }
}