package Day03;

import java.util.Scanner;

public class StringManipulations2 {


    /*
    Kullanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son iki harfini 3 kere yan yana yazdirin,
    degil ise girilen kelimeyi yazdirin.
     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz:");
        String kelime = scan.nextLine();
        if (kelime.length() >= 3){
            for (int i=0 ; i<3 ; i++ ) {
                System.out.print(kelime.substring(kelime.length() - 2, kelime.length()));
            }
        }else System.out.println(kelime);






        }


    }

