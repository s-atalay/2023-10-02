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
        Scanner scan = new Scanner(System.in);
        ArrayList<String> kahve = new ArrayList<>(Arrays.asList("1.Türk Kahvesi","2.Filtre Kahve","3.Americano"));
        System.out.println("Hangi kahveyi istersiniz?");
        for (String each:kahve) {
            System.out.println(each);
        }
        int secim = scan.nextInt();

        System.out.println("Süt eklemek ister misiniz?Evet icin E'ye Hayir icin H'ye basiniz.");
        char süt = scan.nextLine().toUpperCase().charAt(0);

        System.out.println("Şeker ister misiniz? Evet icin E'ye Hayir icin H'ye basiniz.");
        char seker = scan.nextLine().toUpperCase().charAt(0);

        System.out.println("Hangi boyutta olsun? (Büyük Boy - Orta Boy - Küçük Boy olarak giriniz.)");
        String boy = scan.nextLine();
        System.out.println(kahve.get(secim-1).substring(2)+" "+boy+" hazirdir. Afiyet olsun.");
    }

}
