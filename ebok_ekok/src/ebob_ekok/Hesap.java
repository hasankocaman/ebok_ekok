package ebob_ekok;

import java.util.Scanner;

public class Hesap implements Ihesap {
    static Scanner scanner = new Scanner(System.in);
    static int sayi1;
    static int sayi2;

    @Override
    public int ebobHesapla(int sayi1, int sayi2) {
        int ebobSonuc = 0;
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebobSonuc = i;
            }
        }
        return ebobSonuc;
    }

    @Override
    public int ekokHesapla(int sayi1, int sayi2) {
        int ekokSonuc = 0;
        int max = sayi1 * sayi2;
        for (int i = max; i > 0; i--) {
            if (i %sayi1  == 0 && i % sayi2 == 0) {
                ekokSonuc = i;
            }
        }
        return ekokSonuc;
    }

    public static void sayiGir() {
        System.out.println("1. sayiyi giriniz:");
        sayi1 = scanner.nextInt();
        System.out.println("2. sayiyi giriniz:");
        sayi2 = scanner.nextInt();
    }


}
