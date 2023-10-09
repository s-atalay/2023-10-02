package Day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Kullanicidan alinan bir tamsayiya kadar FIBONACCI dizisi olusturun.
1-1-2-3-5-8-13-21-34...
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen FIBONACCI dizisi olusturmak icin bir tamsayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println(fibonacci(sayi));

    }
    public static List<Integer> fibonacci(int üstSinir){
        ArrayList<Integer> fibonacci = new ArrayList<>();

        if(üstSinir==0){
            fibonacci.add(0);

        } else if (üstSinir == 1) {
            fibonacci.add(1);

        } else{

            fibonacci.add(0);
            fibonacci.add(1);
            int yeniSayi = 0;
            int i = 2;
            while(yeniSayi<=üstSinir){

            yeniSayi = fibonacci.get(i-1)+fibonacci.get(i-2);

            if (yeniSayi<=üstSinir){
                fibonacci.add(yeniSayi);
            }
            i++;
            }
        }
        return fibonacci;
        }

    }

