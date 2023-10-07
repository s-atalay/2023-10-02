package Day04;



import java.util.Arrays;
import java.util.Scanner;

public class Ortalama {

    /*
    Kullanicidan kac tane sayinin ortalamasini bulmasini istedigini sorun ve buna bagli olarak aldiginiz degerleri bir array'de saklayin.
    Kullanicidan verileri aldiktan sonra tum sayilari ve ortalamasini yazdirin.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen kaç tane sayinin ortalamasini bulmak istediginizi girin: ");
        int sayi = scan.nextInt();

        int [] arr= new int[sayi];

        double ortalama ;
        int toplam =0;

        for (int i = 1; i < sayi+1; i++) {
            System.out.println("Lütfen "+i+". degeri girin: ");
            int deger = scan.nextInt();
            arr[i-1]=deger;
            toplam+=deger;
        }
        
        System.out.println(toplam);
        ortalama=(double) toplam/sayi;
        System.out.println("Array ==> "+ Arrays.toString(arr));
        System.out.println("Ortalama==> "+ortalama);
    }
}
