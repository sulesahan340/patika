import java.util.Scanner;

public class burclar {
    public static void main(String[] args) {
        int day;
        String month;

        Scanner input = new Scanner(System.in);
        System.out.println("doğum ayınız girin:");
        month = input.nextLine();

        System.out.println("doğum gününüzü girin:");
        day = input.nextInt();

        if(month.equals("mart")){
            if(day>=21 && day<31){
                System.out.println("burcunuz:KOÇ");
            }
        }
        if(month.equals("nisan")){
            if(day<=20 && day>0){
                System.out.println("burcunuz:KOÇ");
            }
        }
        if(month.equals("nisan")){
            if(day>=21 && day<31){
                System.out.println("burcunuz:BOĞA");
            }
        }
        if(month.equals("mayıs")){
            if(day<=21 && day>0){
                System.out.println("burcunuz:BOĞA");
            }
        }
        if(month.equals("mayıs")){
            if(day>=22 && day<31){
                System.out.println("burcunuz:İKİZLER");
            }
        }
        if(month.equals("haziran")){
            if(day<=22 && day>0){
                System.out.println("burcunuz:İKİZLER");
            }
        }
        if(month.equals("haziran")){
            if(day>=23 && day<31){
                System.out.println("burcunuz:YENGEÇ");
            }
        }
        if(month.equals("temmuz")){
            if(day<=22 && day>0){
                System.out.println("burcunuz:YENGEÇ");
            }
        }
        if(month.equals("temmuz")){
            if(day>=23 && day<31){
                System.out.println("burcunuz:ASLAN");
            }
        }
        if(month.equals("ağustos")){
            if(day<=22 && day>0){
                System.out.println("burcunuz:ASLAN");
            }
        }
        if(month.equals("ağustos")){
            if(day>=23 && day<31){
                System.out.println("burcunuz:BAŞAK");
            }
        }

        if(month.equals("eylül")){
            if(day<=23 && day>0){
                System.out.println("burcunuz:BAŞAK");
            }
        }
        if(month.equals("eylül")){
            if(day>=23 && day<31){
                System.out.println("burcunuz:TERAZİ");
            }
        }

        if(month.equals("ekim")){
            if(day<=23 && day>0){
                System.out.println("burcunuz:TERAZİ");
            }
        }
        if(month.equals("ekim")){
            if(day>=23 && day<31){
                System.out.println("burcunuz:AKREP");
            }
        }
        if(month.equals("kasım")){
            if(day<=23 && day>0){
                System.out.println("burcunuz:AKREP");
            }
        }
        if(month.equals("kasım")){
            if(day>=22 && day<31){
                System.out.println("burcunuz:YAY");
            }
        }
        if(month.equals("aralık")){
            if(day<=21 && day>0){
                System.out.println("burcunuz:YAY");
            }
        }
        if(month.equals("aralık")){
            if(day>=22 && day<31){
                System.out.println("burcunuz:OĞLAK");
            }
        }
        if(month.equals("ocak")){
            if(day<=21 && day>0){
                System.out.println("burcunuz:OĞLAK");
            }
        }
        if(month.equals("ocak")){
            if(day>=22 && day<31){
                System.out.println("burcunuz:KOVA");
            }
        }
        if(month.equals("şubat")){
            if(day<=19 && day>0){
                System.out.println("burcunuz:KOVA");
            }
        }
        if(month.equals("şubat")){
            if(day>=22 && day<31){
                System.out.println("burcunuz:BALIK");
            }
        }
        if(month.equals("mart")){
            if(day<=20 && day>0){
                System.out.println("burcunuz:BALIK");
            }
        }





    }
}