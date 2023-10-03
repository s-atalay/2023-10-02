package örnekSorular;

import java.util.Scanner;

public class ByteSorusu {

    /*
      Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
      ile 127 arasindaki bir sayiya donusturup yazdirin.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz: ");

        int sayi = scan.nextInt();

        sayi = (byte) sayi;

        System.out.println("Sayinin byte hali: "+sayi);
    }
}
