package Day03;

public class DesimalToBinary {

    public static void main(String[] args) {

        System.out.println(cevir(1100));

    }

    public static int cevir(int i) {

        int x = 1;
        int b = 0;
        int toplam = 0;
        int a = 0;


        do {
            b = i % 10;
            i = i / 10;
            a = b * x;
            x = x * 2;

            toplam += a;

        } while (i != 0);


        return toplam;

    }
}
