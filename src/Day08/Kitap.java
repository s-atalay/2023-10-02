package Day08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Kitap{

    static HashMap<Integer, String> kitap = new HashMap<Integer, String>();


public static Map<Integer,String> mevcutKitap(){

    kitap.put(1000,"Yabancı-Albert Camus-55-19/10/2023");
    kitap.put(1001,"Kayıp Zamanın İzinde-Marcel Proust-60-20/10/2023");
    kitap.put(1002,"Dava-Franz Kafka-100-21/10/2023");
    kitap.put(1003,"Küçük Prens-Antoine de Saint-75-22/10/2023");
    kitap.put(1004,"Sefiller-Victor Hugo-50-23/10/2023");

    return kitap;
}

public static HashMap<Integer, String> kitapEkleme(int sayac, String adi){

    kitap.put(sayac,adi);

    return kitap;
}

}
