package Day09;

public class Runner {
    public static void main(String[] args) {

        Kare kare = new Kare();

        int kareCevre = 4 * kare.kenarKare;
        int kareAlan = kare.kenarKare * kare.kenarKare;

        System.out.println("Karenin çevresi = "+kareCevre);
        System.out.println("Karenin alanı = "+kareAlan);

        int dikdortgenCevre = 2 * kare.kisaKenarDikdortgen + 2 * kare.uzunKenarDikdortgen;
        int dikdortgenAlan = kare.kisaKenarDikdortgen * kare.uzunKenarDikdortgen;

        System.out.println("Dikdörtgenin çevresi = "+dikdortgenCevre);
        System.out.println("Dikdörtgenin alanı = "+dikdortgenAlan);

        Cember cember = new Cember();

        double cemberCevre = 2 * Math.PI * cember.yaricap;
        double cemberAlan = Math.PI * cember.yaricap * cember.yaricap;

        System.out.println("Çemberin çevresi = "+cemberCevre);
        System.out.println("Çemberin alanı = "+cemberAlan);

    }
}
