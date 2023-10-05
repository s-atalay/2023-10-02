package Day03;

import java.util.Arrays;

public class Array {

    /*
    Verilen bir array'deki tum elementleri bir saga kaydirip, sondaki elementi de basa tasiyacak bir method olusturun.
    Array'i yeni haliyle kaydedin.
     */
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,8,9};

        System.out.println(Arrays.toString(kaydirma(arr)));

    }
    public static int[] kaydirma(int[] arr){

        int [] arr2 = new int[arr.length];

        for(int i=0 ; i< arr.length-1 ; i++ ){

            arr2[i+1]= arr[i];
        }
        arr2[0] = arr[arr.length-1];



        return arr2;

    }
}
