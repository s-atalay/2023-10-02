package Day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Basit bir Kahve makinesi oluşturun.
1. Şart
 3 çeşit kahvemiz olsun.
  Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

  Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Americano
2.Şart
  Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
3. Şart
  Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
  sorusunu sorsun.
4. Şart
  Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
  sorusunu sorsun.
Sonuç
   Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!
 */
public class KahveMakinesi {

    public static void main(String[] args) {


        System.out.println(kahveSecimi().substring(2)+" "+boySecimi()+" "+sutSecimi()+" "+sekerSecimi()+" kahveniz hazırdır. Afiyet olsun.");

    }
    public static String kahveSecimi(){

        Scanner scan = new Scanner(System.in);
        ArrayList<String> kahve = new ArrayList<>(Arrays.asList("1.Türk Kahvesi","2.Filtre Kahve","3.Americano"));
        System.out.println("Hangi kahveyi istersiniz?");
        for (String each:kahve) {
            System.out.println(each);
        }
        int secim = scan.nextInt();
        while (secim < 1 || secim > 3){
            System.out.println("Lütfen seceneklerden birini giriniz: ");
            int secim2 = scan.nextInt();
            secim=secim2;
        }return kahve.get(secim-1);
    }
    public static String sekerSecimi(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Şeker ister misiniz? Evet icin E'ye Hayir icin H'ye basiniz.");
        char seker = scan.nextLine().toUpperCase().charAt(0);
        String sekerSecimi = "Şekerli";
        String sekerSecimi2 = "Sade";
        while(!(seker =='E'||seker =='H')){

            System.out.println("Şeker ister misiniz? Evet icin E'ye Hayir icin H'ye basiniz.");
            char seker2 = scan.nextLine().toUpperCase().charAt(0);
            seker = seker2;
        }
        if (seker=='E'){

            return sekerSecimi;

        }else return sekerSecimi2;
    }

    public static String sutSecimi(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Süt ister misiniz? Evet icin E'ye Hayir icin H'ye basiniz.");
        char sut = scan.nextLine().toUpperCase().charAt(0);
        String sutSecimi = "Sütlü";
        String sutSecimi2 = "Sütsüz";
        while(!(sut =='E'||sut =='H')){

            System.out.println("Süt ister misiniz? Evet icin E'ye Hayir icin H'ye basiniz.");
            char sut2 = scan.nextLine().toUpperCase().charAt(0);
            sut = sut2;
        }
        if (sut=='E'){

            return sutSecimi;

        }else return sutSecimi2;
    }
    public static String boySecimi(){


        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi boyutta olsun? (Büyük Boy - Orta Boy - Küçük Boy olarak giriniz.):");
        char boy = scan.nextLine().toUpperCase().charAt(0);
        String boySecim = null;
        while(!(boy =='O'||boy =='B' ||boy =='K')){

            System.out.println("Hangi boyutta olsun? (Büyük Boy - Orta Boy - Küçük Boy olarak giriniz.):");
            char boy2 = scan.nextLine().toUpperCase().charAt(0);
            boy = boy2;
        }
        switch(boy){
            case 'B': boySecim = "Büyük Boy";
            case 'O': boySecim = "Orta Boy";
            case 'K': boySecim =  "Küçük Boy";

        }
       return boySecim;
    }

}
