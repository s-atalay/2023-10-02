package Day03;

public class Regex {
      /*
      String şekilde verilen fiyatların toplamini bulunuz.
       */
    public static void main(String[] args) {

        String str1 = "13,99£";
        String str2 = "10,55£";
        int fyt1 = Integer.parseInt(str1.replaceAll("\\D",""));
        int fyt2 = Integer.parseInt(str2.replaceAll("\\D",""));
        System.out.println((double)(fyt1+fyt2)/100 + "'£'");




    }
}
