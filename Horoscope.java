import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        int gun,say;
        String ay;
        String ay1 = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Türkçe ay ismi giriniz\nNot:ilk harf büyük olacak");
        System.out.println("Hangi ayda doğdunuz ? ");
        ay = input.nextLine();

        System.out.println("Hangi günde doğdunuz ?");
        gun = input.nextInt();

        switch (ay){
            case "Ocak" :
                ay1= "100";
                break;
            case "Şubat" :
                ay1= "200";
                break;
            case "Mart" :
                ay1= "300";
                break;
            case "Nisan" :
                ay1= "400";
                break;
            case "Mayıs" :
                ay1= "500";
                break;
            case "Haziran" :
                ay1= "600";
                break;
            case "Temmuz" :
                ay1= "700";
                break;
            case "Ağustos" :
                ay1= "800";
                break;
            case "Eylül" :
                ay1= "900";
                break;
            case "Ekim" :
                ay1= "1000";
                break;
            case "Kasım" :
                ay1= "1100";
                break;
            case "Aralık" :
                ay1= "1200";
                break;
            default:
                System.out.println("Lütfen Türkçe ay ismi giriniz\nNot:ilk harf büyük olacak");
        }
        assert ay1 != null;
        int ayi = Integer.parseInt(ay1);
        say = ayi + gun;
        System.out.print("Burcunuz : ");
        if ((say>=321)&&(say<=420)){
            System.out.println("Koç");
        } else if ((say>=421)&&(say<=521)) {
            System.out.println("Boğa");
        } else if ((say>=522)&&(say<=622)) {
            System.out.println("İkizler");
        } else if ((say>=623)&&(say<=722)) {
            System.out.println("Yengeç");
        } else if ((say>=723)&&(say<=822)) {
            System.out.println("Aslan");
        } else if ((say>=823)&&(say<=922)) {
            System.out.println("Başak");
        } else if ((say>=923)&&(say<=1022)) {
            System.out.println("Terazi");
        } else if ((say>=1023)&&(say<=1121)) {
            System.out.println("Akrep");
        } else if ((say>=1122)&&(say<=1221)) {
            System.out.println("Yay");
        } else if ((say>=122)&&(say<=219)) {
            System.out.println("Kova");
        } else if ((say>=220)&&(say<=320)) {
            System.out.println("Balık");
        } else {
            System.out.println("Oğlak");
        }

    }
}
