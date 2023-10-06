package Day03;

public class MountainArray {
    /*
    Verilen herhangi bir arrayin Mountain Array olup olmadigini kontrol ediniz.
    Mountain Array  ==> [0,2,5,3,1]
    Mountain Array degil ==> [5,2,7,1,4]
     */
    public static void main(String[] args) {

        int [] arr = {0,2,5,3,1};
        kontrol(arr);

    }

    public static void kontrol(int[] arr){


        boolean bl = true;


        for (int i=1 ; i<=arr.length/2 ; i++) {

            if (arr[i-1] > arr[i]) {
                bl = false;

               break;
            }
        }


        for (int a = arr.length/2 ; a < arr.length-1; a++) {

            if (arr[a] < arr[a + 1]) {
                bl = false;

                break;
            }

        }
        if(bl){

            System.out.println("Mountain Array");
        }
        else System.out.println("Mountain Array degil");




    }
}


