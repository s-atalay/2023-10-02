package örnekSorular;

import java.util.Scanner;

public class Aylar {

    /*
    Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
    NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
    Kullanici o veya O yazdiginda output Ocak olsun.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: " );
        char harf = scan.next().toLowerCase().charAt(0);

            switch (harf){
                case 'o' :
                    System.out.println("ocak");
                    break;
                case 's' :
                    System.out.println("subat");
                    break;
                case 'm' :
                    System.out.println("mart");
                    break;
                case 'n' :
                    System.out.println("nisan");
                    break;
                case 'h' :
                    System.out.println("haziran");
                    break;
                case 't' :
                    System.out.println("temmuz");
                    break;
                case 'a' :
                    System.out.println("agustos");
                    break;
                case 'e' :
                    System.out.println("eylul");
                    break;
                case 'k' :
                    System.out.println("kasım");
                    break;




            }
    }

}
