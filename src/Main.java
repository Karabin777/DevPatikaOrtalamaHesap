import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int toplam = 0;
        int adet = 0;
        int sayi = 0;

        while (sayi <= n) {
            if (sayi % 3 == 0 && sayi % 4 == 0) {
                toplam += sayi;
                adet++;
            }
            sayi++;
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı yok.");
        }
    }
}
