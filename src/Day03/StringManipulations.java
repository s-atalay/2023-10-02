package Day03;

import java.util.Scanner;

public class StringManipulations {

    /*
    Kullanicidan bir e-posta adresi girmasini isteyin, ardindan "hotmail" iceriyorsa "gmail" ile degistirin.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir e-posta adresi giriniz: ");
        String eposta = scan.nextLine();


        if (eposta.substring(eposta.length() - 11, eposta.length() - 4).equalsIgnoreCase("hotmail")) {
            System.out.println(eposta.replace("hotmail", "gmail"));
        }
        else System.out.println(eposta);



    }
}
