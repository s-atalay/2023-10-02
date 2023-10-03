package Day02;

import java.util.Scanner;

public class Emekli {
    /*
    Kullanıcıdan cinsiyetini ve yasini alin, Kadin 60 yas ve üzeri, Erkek 65 yas ve üzeri emekli olabilir.
    Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin" veya "Emekli olmak için ... yil daha çalisman gerekir" yazdirin.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz: ");
        String cnsyt = scan.nextLine();
        while (!cnsyt.equalsIgnoreCase("kadin") && !cnsyt.equalsIgnoreCase("erkek")) {

            System.out.println("Lütfen gecerli cinsiyet bilgisini giriniz :");
            String cnsyt2 = scan.nextLine();
            cnsyt = cnsyt2;

        }
        System.out.println("Lütfen yasinizi giriniz: ");
        int yas = scan.nextInt();

        while (yas < 0 || yas > 100) {

            System.out.println("Lütfen gecerli yas bilgisini giriniz :");
            int yas2 = scan.nextInt();
            yas = yas2;

        }
        if (cnsyt.equalsIgnoreCase("kadin")) {
            if (yas >= 60) {
                System.out.println("Emekli olabilirsin.");
            } else System.out.println("Emekli olmak icin daha " + (60 - yas) + " yil daha calisman gerekli.");
        } else if (cnsyt.equalsIgnoreCase("erkek")) {
            if (yas >= 65) {
                System.out.println("Emekli olabilirsin.");
            } else System.out.println("Emekli olmak icin daha " + (65 - yas) + " yil daha calisman gerekli.");

        }


    }




}
