package ebob_ekok;

import static ebob_ekok.Hesap.sayi1;
import static ebob_ekok.Hesap.sayi2;

public class Main {
    public static void main(String[] args) {
        Hesap hesap = new Hesap();
        hesap.sayiGir();
        System.out.println("EBOB=" + hesap.ebobHesapla(sayi1, sayi2));
        System.out.println("EKOK=" + hesap.ekokHesapla(sayi1, sayi2));
    }

}
