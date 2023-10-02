package ikiEkim;

import java.util.Scanner;

public class ModulusSoru {

    /*
    Kullanıcıdan 4 basamaklı pozitif bir tamsayı alıp rakamlar toplamını bulalım
    Eger yanlıs sayi girerse tekrar isteyelim
     */
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir tamsayı giriniz:");
        int sayi = scan.nextInt();

        while (sayi<1000 || sayi>9999){

            System.out.println("Lutfen 4 basamaklı bir tamsayı giriniz:");
           int sayi2 = scan.nextInt();
           sayi=sayi2;

        }

        while (!(sayi<1000 || sayi>9999)){

            int sonBasamak = sayi % 10 ;
            sayi = sayi/10;
            int ücüncüBasamak = sayi%10;
            sayi = sayi/10;
            int ikinciBasamak = sayi % 10 ;
            sayi = sayi/10;

            int toplam = sonBasamak+ücüncüBasamak+ikinciBasamak+sayi;

            System.out.println("Sayinin rakamlar toplami = "+toplam);


        }

    }
}

