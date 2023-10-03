package Day01;

import java.util.Scanner;

public class Ascıı {

    /*
    Kullanıcıdan bir harf alin ve alfabede o harften sonraki 3 harfi yazdırın
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz : ");

        char girilenHarf = scan.next().charAt(0);

        System.out.print("Sonraki 3 harf : ");

        for( int i = girilenHarf+1; i<girilenHarf+4 ; i++ ){

          //  String str = new Character((char) i).toString();
            char c = (char) i;

            System.out.print(c+" ");

        }

    }
}
