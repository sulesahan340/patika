import java.util.Scanner;

public class sicaklik {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input= new Scanner(System.in);
        System.out.println("sıcaklığı giriniz:");
        sicaklik= input.nextInt();

        if (sicaklik<5){
            System.out.println("kayak yapabilirsiniz");
        }
        else if (sicaklik>5 && sicaklik<15){
            System.out.println("sinemaya gidebilirsiniz");
        }
        else if (sicaklik>15 && sicaklik<25){
            System.out.println("pikniğe gidebilirsiniz");
        }
        else{
            System.out.println("yüzmeye gidebilirsiniz");
        }


    }
}