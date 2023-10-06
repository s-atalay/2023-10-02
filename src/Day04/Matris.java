package Day04;

import java.util.Random;
import java.util.Scanner;

public class Matris {
    /*
    5*5 bir matris olusturun ve bu matrisin elemanlari 0-9 arasinda rastgele sayilar olsun.
    Bu matrisi ekrana yazdiran ve capraz sayilarin (sol ustten sag asagiya) toplamini yazdiran bir kod yazin.
     */
    public static void main(String[] args) {

        Random random = new Random();

        int toplam = 0 ;
        int [] arr = new int[5];

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                arr[j]= random.nextInt(10);
                System.out.print(arr[j]+" ");

            }
            toplam+=arr[i];

            System.out.println();


        }
        System.out.println();
        System.out.println("Toplam= "+toplam);
    }


}
