package Day06;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
 2. SORU
Kullanıcı tarafından girilen metni "Sezar Şifreleme Yöntemi" ne göre şifreleyiniz.
Sezar Şifreleme: Sezar şifrelemesi, ilk kez Romalı lider Jül Sezar tarafından kullanılmış olan şifreleme tekniğidir.
Bu şifreleme en basit ve en bilinen şifreleme tekniklerinden biridir.
Düz metindeki her harfin, alfabeden belirli bir sayı ileride konumlu olan bir harfle değiştirildiği bir şifreleme türüdür.
//hello ----> ıfmmp --->1 birim kaydırılmış hali
 */
public class SezarSifreleme {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen şifrelemek istediginiz metni giriniz:");
        String metin = scan.nextLine();

        String yeniMetin = metin.replaceAll("\\W","");

        for (int i = 0; i < yeniMetin.length(); i++) {
            System.out.print((char)(yeniMetin.charAt(i)+1));
        }


    }
}
