package Day03;

public class MountainArray {

    public static void main(String[] args) {

        int [] arr = {0,2,5,3,1};
        kontrol(arr);

    }

    public static boolean kontrol(int[] arr){


        boolean bl = false;



        for (int i=0 ; i<=arr.length/2 ; i++) {

            if (arr[i] < arr[i + 1]) {
                bl = true;
                break;
            }
        }


        for (int a=(arr.length/2)+1; a<arr.length ; a++) {

            if (arr[a] > arr[a + 1]) {

                bl = true;

                break;
            }

        }


        return bl;


    }
}


