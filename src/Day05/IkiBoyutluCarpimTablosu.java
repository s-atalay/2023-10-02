package Day05;


    /*
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
    */
public class IkiBoyutluCarpimTablosu {

    public static void main(String[] args) {

        int [][] arr = new int[5][5];
        int carpim = 0;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
               carpim = i * j ;
               if (carpim>=10){
                   System.out.print(carpim);
               }else
                System.out.print(carpim);
               if(i+j<=5){
                   System.out.print("  ");
               }else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
