package ikiEkim;

import java.util.Scanner;

public class DataCastingSoru1 {

    /*
    Kullanicidan double olarak alinan 3 degerin ortalamasini int olarak yazdıralım
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 tamsayı giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();

        int toplam = (int) (sayi1+sayi2+sayi3);

        System.out.println("Toplam = "+ toplam);
    }
}
