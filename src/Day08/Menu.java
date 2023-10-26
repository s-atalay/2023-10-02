package Day08;

import javax.swing.*;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Menu {
    /*
    ====================KİTAPÇI PROJESİ==============================
* bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun program baslayinca menu isminde bir method calissin
Menude olacak özellikler
* 1-kitap ekle
* 2-numara ile kitap goruntule
* 3-kitap adı ile kitap goruntule
* 4-numara ile kitap sil
* 5-tum kitaplari listele
* 6-cikis
 ************************************
* 1-her kitaba ait kitap no, kitap adi, yazar adi, kitap fiyati ve kayıt tarihi olacak
* 2-kitap numarasi 1000'den baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir (count=1000);
* 3-menu isminde bir method olusturmaliyim ve menüye ait özellikler bu metod içinde metodlar çeklinde oluşturulmalıdır.
* 4-Kitaba ait özellikler farklı bir classta tutulmalıdır.
     */

    static Scanner scan = new Scanner(System.in);
    static String adi = "";
    static String yazari = "";
    static Integer fiyati;
    static Integer sayac = 1004;
    static DateTimeFormatter tarih = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    static LocalDate localTarih = LocalDate.now();
    static Map<Integer, String> kitap = Kitap.mevcutKitap();
    static Set<Map.Entry<Integer, String>> kitapEntry = kitap.entrySet();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("===========T127 KİTAPÇISI===========");
        System.out.println("1-Kitap Ekle\n2-Numara ile Kitap Görüntüle\n3-Kitap Adı ile Kitap Görüntüle\n4-Numara ile Kitap Sil\n5-Tüm Kitapları Listele\n6-Çıkış");

        int secim = scan.nextInt();
        if (secim < 1 || secim > 6) {
            System.out.println("Geçersiz giriş yaptınız.");
            menu();
        } else {
            switch (secim) {
                case 1:
                    kitapEkle();
                    break;
                case 2:
                    numaraIleKitapGoruntule();
                    break;
                case 3:
                    kitapAdiIleKitapGoruntule();
                    break;
                case 4:
                    numaraIleKitapSil();
                    break;
                case 5:
                    tumKitaplariListele();
                    break;
                case 6:
                    Cikis();
                    break;

            }
        }
    }

    public static void kitapEkle() {


            sayac++;
            System.out.print("Lütfen eklemek istediğiniz kitabın adını-yazarini-fiyatini giriniz: ");
            Scanner scan1 = new Scanner(System.in);
            adi = scan1.nextLine();
            String ad = adi + "-" + tarih.format(localTarih);
            kitap = Kitap.kitapEkleme(sayac, ad);
            eklemeyeDevamMı();


    }
    public static void eklemeyeDevamMı(){
        char devam;
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Eklemeye devam etmek istiyor musunuz?(E/H)");
        devam = scan3.next().toUpperCase().charAt(0);


        if (devam=='E'){
            kitapEkle();
        }
        else if(devam == 'H'){
            menu();

        }
        else{
            System.out.println("Yanlış giriş yaptınız.");
            eklemeyeDevamMı();

        }
    }

    public static void numaraIleKitapGoruntule() {
        System.out.println("Lütfen aramak istediğiniz kitabın no'sunu giriniz: ");
        int sayi= scan.nextInt();
        for (Map.Entry<Integer,String> each : kitapEntry) {

            if((Integer)each.getKey()==sayi) {
                System.out.println(each);
            }
        }

    }

    public static void kitapAdiIleKitapGoruntule() {
        Scanner scan2=new Scanner(System.in);
        String value ;
        String [] valueArr;
        System.out.println("Lütfen aramak istediğiniz kitabın adını giriniz: ");
        String kitapAdi = scan2.nextLine();
        for (Map.Entry<Integer,String> each : kitapEntry) {
            value= each.getValue();
            valueArr=value.split("-");
            if (kitapAdi.equalsIgnoreCase(valueArr[0])){
                System.out.println(each);
            }
            else System.out.println("Aradığınız kitap bulunmamaktadır.");

        }
        menu();
    }

    public static void numaraIleKitapSil() {
        int sayi;
        System.out.print("Lütfen silmek istediğiniz kitabın numarasını giriniz: ");
        sayi = scan.nextInt();
        if(kitap.containsKey(sayi)){
            kitap.remove(sayi);
            System.out.println("Kitap silinmiştir.");

        }else {
            System.out.println("Aradığınız kitap bulunmamaktadır.");
        }
        menu();
    }

    public static void tumKitaplariListele() {
        System.out.println(kitap);
        menu();
    }

    public static void Cikis() {
        System.out.println("Çıkış yapılıyor.İyi günler.");
    }
}
