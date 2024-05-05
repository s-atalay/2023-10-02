package Day08;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class DepoMenu {
    static Scanner scan = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    static String tercih="";
    static String eklenecekValue = "";

    public static void sekil(){
        System.out.println("*********************** KİTAP LİSTESİ **************************");
        System.out.println("Kitap No   Kitap Adı            Yazarı          Fiyatı   Kayıt Tarihi");
        System.out.println("*********************************************************************");
    }
    public static void anaMenu() throws InterruptedException {
        System.out.println("");
        System.out.println("*********************  KİTAPÇI  *****************");
        System.out.println(" ");
        System.out.println("*********************   Menü  ********************");
        System.out.println("1 - Kitap Ekle\n" +
                "2 - Numara ile Kitap Görüntüleme\n" +
                "3 - Kitap Adı ile Görüntüleme\n" +
                "4 - Numara ile Kitap Sil\n" +
                "5 - Tüm Kitaplari Listele\n" +
                "6 - Çıkış  ");
        System.out.println("***************************************************");
        System.out.println("Lütfen menüden tercihinizi giriniz.");
        tercih = scan.next();
        scan.nextLine();
        switch (tercih){
            case "1":
                kitapEkle();
                anaMenu();
            case "2":
                numaraIleArama();
                anaMenu();
            case "3" :
                isimIleArama();
                anaMenu();
            case "4":
                numaraIleSilme();
                anaMenu();
            case "5":
                kitapListele();
                anaMenu();
            case "6":
                cikis();
                break;
            default:
                System.out.println("Geçerli bir tercih giriniz");
                anaMenu();
        }
    }
    public static void kitapEkle() throws InterruptedException{

        try {
            System.out.println("Eklemek istediğiniz kitabın ismi ");
            Kitaplik.kitapAdi = scan.nextLine();
            System.out.println("Yazar ismi ");
            Kitaplik.yazarAdi = scan.nextLine();
            System.out.println("Kitabın Fiyatı ");
            Kitaplik.kitapFiyati = scan.nextDouble();

            eklenecekValue = Kitaplik.kitapAdi + "-" +
                    Kitaplik.yazarAdi +"-" +Kitaplik.kitapFiyati +"₺-" +Kitaplik.tarih.format(Kitaplik.kayitTarihi);
            Kitaplik.kitaplarMap.put(Kitaplik.sayac, eklenecekValue);
            //System.out.println(Kitaplik.sayac+ " " + eklenecekValue);
            Kitaplik.sayac ++ ;
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Yanlış giriş yaptınız");
            scan.nextLine();
            kitapEkle();
        }

    }
    public static void numaraIleArama() throws InterruptedException {
        try {
            System.out.println("Lütfen aradığınız kitabın numarasını giriniz: ");
            int arananKitapNo= Integer.parseInt(scanner.next());
            Set<Map.Entry<Integer, String>> aranankitapEntrySet = Kitaplik.kitaplarMap.entrySet();

            if(Kitaplik.kitaplarMap.containsKey(arananKitapNo)){
                for (Map.Entry<Integer, String> each : aranankitapEntrySet) {
                    int eachKey = each.getKey();
                    String eachValue = each.getValue();
                    String[] eachValuArr = eachValue.split("-");
                    if (arananKitapNo == eachKey) {
                        sekil();
                        System.out.printf("%-10s %-20s %-15s %-8s %-8s %n",eachKey,eachValuArr[0],eachValuArr[1],eachValuArr[2],eachValuArr[3]);
                    }
            }

                // scan.nextLine();
            }else{
                System.out.println("Aradığınız kitap bulunmamaktadır.");
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Yanlış giriş yaptınız");
            //scan.nextLine();
            numaraIleArama();

        }
    }
    public static void isimIleArama() throws InterruptedException {
        try {
            System.out.println("Lütfen aradığınız kitabın ismini giriniz: ");
            String arananKitapIsmi = scan.nextLine();
            Set<Map.Entry<Integer,String>> aranankitapEntrySet = Kitaplik.kitaplarMap.entrySet();
            boolean flag=false;

            for (Map.Entry<Integer, String> each : aranankitapEntrySet) {
                int eachKey = each.getKey();
                String eachValue = each.getValue();
                String[] eachValuArr = eachValue.split("-");
                if (arananKitapIsmi.equalsIgnoreCase(eachValuArr[0])) {
                    sekil();
                    System.out.printf("%-10s %-20s %-15s %-8s %-8s %n",eachKey,eachValuArr[0],eachValuArr[1],eachValuArr[2],eachValuArr[3]);
                    flag=true;
                }

            }
            if(!flag){
                System.out.println("Aradığınız kitap bulunmamaktadır.");
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Yanlış giriş yaptınız");
            //scan.nextLine();
                isimIleArama();
        }
    }
    public static void numaraIleSilme() throws InterruptedException {
        try {
            System.out.println("Silmek istediğiniz kitabın numarasını giriniz: ");
            int silinecekKitap = Integer.parseInt(scan.next());
            if(Kitaplik.kitaplarMap.containsKey(silinecekKitap)){
                Kitaplik.kitaplarMap.remove(silinecekKitap);
                System.out.println("Kitap silinmiştir.");
            }else {
                System.out.println("Silmek istediğiniz kitap bulunamadı.");
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Yanlış giriş yaptınız");
            //scan.nextLine();
            numaraIleSilme();
        }

    }
    public static void kitapListele() throws InterruptedException{
        Set<Map.Entry<Integer,String>> kitapEntrySet = Kitaplik.kitaplarMap.entrySet();
        System.out.println("*********************** KİTAP LİSTESİ **************************");
        System.out.println("Kitap No   Kitap Adı            Yazarı          Fiyatı   Kayıt Tarihi");
        System.out.println("*********************************************************************");
        for (Map.Entry<Integer,String> each : kitapEntrySet) {
            int eachKey = each.getKey();

            String  eachValue = each.getValue();
            String [] eachValuArr = eachValue.split("-");
            System.out.printf("%-10s %-20s %-15s %-8s %-8s %n",eachKey,eachValuArr[0],eachValuArr[1],eachValuArr[2],eachValuArr[3]);

        }
        Thread.sleep(1000);
    }
    public static void cikis() {
        System.out.println("Programdan çıkış yapıyorsunuz.....");
        System.exit(0);
    }
}
