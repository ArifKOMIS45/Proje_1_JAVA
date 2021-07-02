import java.util.Scanner;

public class countE {

    /*
    Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        String str=text.replaceAll("[^b]","");
        int sayi=str.length();
        System.out.println(sayi);

    }
}
