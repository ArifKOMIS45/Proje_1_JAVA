import java.util.Scanner;

public class age {
    /*
               Kullanıcıdan yaş bilgisini isteyiniz

               Eğer yaş 10 dan küçük veya eşit ise
               "facebook hesabi acmak icin cok gencsin"  şeklinde yazdırın

               Eğer yaş 16 dan küçük veya eşit ise
               "ehliyet almak icin cok gencsin"  şeklinde yazdırın

               Eğer yaş 18 den küçük veya eşit ise
               "dovme yaptirmak icin cok gencsin" şeklinde yazdırın

               Eğer yaş 21 den küçük veya eşit ise
               "alkol icmek icin cok gencsin" şeklinde yazdırın

               Eğer yaş 21 den büyük ise
               "istedigini yapabilirsin"  şeklinde yazdırın
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yasiniz giriniz=");
        int myAge = scanner.nextInt();

        // kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin

        if (myAge <= 10) {
            System.out.println("facebook hesabi acmak icin cok gencsin");
        } else
            if (myAge <= 16){ System.out.println("ehliyet almak icin cok gencsin");
        }
    else if (myAge <= 18) {
            System.out.println("dovme yaptirmak icin cok gencsin");
        } else if (myAge < 21)
            System.out.println("alkol icmek icin cok gencsin");
    else System.out.println("istedigini yapabilirsin");
        }
    }



