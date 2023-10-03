package örnekSorular;

import java.util.Scanner;

public class Variables_Soru8 {

    /*
    Kullanıcıdan iki sayi alıp,
    üçüncü bir değişken kullanmadan ikisinin değerlerini değiştirin(swap)
     */
    public static <scanner> void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lütfen ikinci bir sayı giriniz");
        int sayi2 = scan.nextInt();

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("sayi1= "+sayi1+"\nsayi2= "+sayi2);
    }
}
