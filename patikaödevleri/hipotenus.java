import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 3 sayı giriniz:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();


        double u = (a + b + c)/2;
        double alan = u*(u-a)*(u-b)*(u-c);

        System.out.println("girdiğiniz üçgenin alanı:"+ alan);



    }
}