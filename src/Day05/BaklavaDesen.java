package Day05;
/*
 Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;

               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *


           şeklini konsola yazdiriniz.
 */
public class BaklavaDesen {

    public static void main(String[] args) {

       int satir = 9;
       int bosluk = satir/2;
       int yildiz =1;

        for (int i = 1; i<=satir ; i++) {

            for (int j = 1; j<=bosluk ; j++) {

                System.out.print(" ");

            }
            for (int k = 0; k < yildiz; k++) {

                System.out.print("* ");

            }

            if (i<=satir/2){
                bosluk--;
                yildiz++;
            }
            else {
                bosluk++;
                yildiz--;}
            System.out.println();
        }
    }
}
