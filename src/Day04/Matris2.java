package Day04;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Matris2 {
     /*
     Kullanicinin girdigi ögrenci sayisi ve kullanicinin girdigi toplam soru sayisina bagli olarak, ogrencilerin soruya verdigi cevaplari tutan bir matris düzenleyin.
     Bu degerleri rastgele olarak olusturun. Degerler A,B,C,D,E olmali.
     Bir de dogru cevaplari tutan tek boyutlu bir diziniz olsun. Bu da rastgele olusturulmali.
     Sonrasinda bu degerleri karsilastirarak her bir ogrencinin kac dogru ve yanlisi oldugunu gosteren programi yaziniz.
      */
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        String karakter = "ABCDE";

        System.out.println("Lütfen öğrenci sayısını giriniz: ");
        int ogrenciSayisi = scan.nextInt();

        System.out.println("Lütfen soru sayısını giriniz: ");
        int soruSayisi = scan.nextInt();

        char [][] cevaplar = new char[ogrenciSayisi][soruSayisi];
        char [] dogruCevaplar = new char[soruSayisi];
        System.out.print("Doğru cevaplar ==> ");

        for (int i = 0; i < soruSayisi; i++) {

            dogruCevaplar[i] = karakter.charAt(random.nextInt(5));

            System.out.print(dogruCevaplar[i]+" ");

            }
        System.out.println();


        for (int i = 0; i < ogrenciSayisi; i++) {
            int sayacDogru=0;
            int sayacYanlis=0;
            for (int j = 0; j < soruSayisi; j++) {



                cevaplar[i][j] = karakter.charAt(random.nextInt(5));
                System.out.print(cevaplar[i][j]+" ");

                if (cevaplar[i][j]==dogruCevaplar[j]){

                    sayacDogru+=1;
                }else sayacYanlis+=1;

            }
            System.out.println();
            System.out.println(i+1+". öğrencinin doğru cevap sayisi==>"+sayacDogru);
            System.out.println(i+1+". öğrencinin yanlış cevap sayisi==>"+sayacYanlis);



        }



    }

}
