package Day05;

import java.util.Scanner;

/*
Basit bir 5 ürünlü manav alisveris programi yaziniz.

  1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
  2. Adim : Baska bir urun almak isteyip istemedigini sor.
             istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
             Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
  3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
  4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

 */
public class Manav {
    public static void main(String[] args) {

        System.out.println("*******MANAV*******");
        System.out.println("0- Cikis\n1- Domates\n2- Patlican\n3- Kabak\n4- Biber\n5- Elma");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen almak istediginiz urunu girin/Çikmak için sifira basin: ");
        int urn = scan.nextInt();

        System.out.println("Lütfen almak istediginiz kiloyu girin: ");
        int klo = scan.nextInt();
        System.out.println("Odenmesi gereken tutar: "+tutarHesaplama(urn, klo));
    }

    public static int tutarHesaplama (int urun,int kilo) {

        int[] urunListesi = {1, 2, 3, 4, 5, 0};
        int[] fiyatListesi = {1, 20, 35, 15, 10, 12};
        Scanner scan = new Scanner(System.in);
        int toplam=fiyatListesi[urun] * kilo;

        do {
            System.out.println("Lütfen almak istediginiz urunu girin/Çikmak için sifira basin: ");
            urun = scan.nextInt();
            if(urun==0)break;

            System.out.println("Lütfen almak istediginiz kiloyu girin: ");
            kilo = scan.nextInt();
            int tplm = fiyatListesi[urun] * kilo;
            toplam+=tplm;

        } while (urun != 0);

        return toplam;
    }

}

