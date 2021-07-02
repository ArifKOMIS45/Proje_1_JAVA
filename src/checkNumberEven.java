import java.util.Scanner;

public class checkNumberEven {

     /*
        Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        // Kodu burdan baslatin ve bu satırdan önceki kodlari değiştirmeyin

        if (number%2==0) System.out.println("true");
        else System.out.println("false");

    }

}
