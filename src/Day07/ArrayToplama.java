package Day07;

import java.util.Arrays;

/*
Verilen arrayin elemanlarini ardisik toplamini hesaplayan metodu yaziniz.
input = {3,5,1,2,7,9,2,3,5,7}
output = {3,5+1,2+7+9,2+3+5+7}
         {3, 6 ,  18  ,  17  }
 */
public class ArrayToplama {
    public static void main(String[] args) {

      int [] arr = {3,5,1,2,7,9,2,3,5,7};

        int[] arr2 = new int[4];
        int sayac = 0;
        int toplam = 0;
        int index = 1;

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j <= sayac; j++) {
                toplam += arr[index-1 + j];
            }
            arr2[i] = toplam;
            sayac++;
            index += sayac;
            toplam = 0;
    }
        System.out.println(Arrays.toString(arr2));

    }
}
