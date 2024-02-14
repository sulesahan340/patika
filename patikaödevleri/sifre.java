import java.util.Scanner;

public class sifre {
    public static void main(String[] args) {
        String userName,password;

        Scanner input = new Scanner(System.in);
        System.out.print("kullanıcı adınızı giriniz:");
        userName=input.nextLine();

        System.out.print("şifrenizi giriniz:");
        password=input.nextLine();
        //kullanıcı adı: sule//
        //     şifre: sahan//

        if(userName.equals("sule")&&password.equals("sahan")){
            System.out.println("giriş başarılı");
        }
        else{
            System.out.println("giriş başarısız");
            System.out.println("yeni bir şifre oluşturunuz..");
            String yeni;
            yeni = input.nextLine();
            if(yeni.equals("sahan")){
                System.out.println("eski şifrenizi kullanamazsınız..");
            }
        }



    }
}