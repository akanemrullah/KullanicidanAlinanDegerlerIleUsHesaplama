import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degiskenler tanimlandi.
        int a = 1, b = 1, total = 1;

        // Scanner sinifina ait eleman projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan degerler alinip ilgili degiskenlere atandi.
        System.out.print("Hangi sayinin ussunu almak istemistiniz? : ");
        a = input.nextInt();

        System.out.print(a + "sayisinin hangi ussunu hesaplamak istemistiniz? : ");
        b = input.nextInt();

        // Mantiksal islemler yapilip kullaniciya sonuc iletildi.
        for (int i = 0; i < b; i++){
            total *= a;
        }
        System.out.println("Sonuc : " + total);
    }
}