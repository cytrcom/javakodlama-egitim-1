public class miniProjeArkadasSayilar {

    public static void main(String[] args) {
        //220-284 örnek 1 den başlayıp 220 kadar 220 dahil değil
        //1 den başlayıp 284 kadar 284 dahil değil sayıların pozitif ortak bölenleri toplamı 220
        //ise bunlar kardeş sayıdır.

        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 = total1 + i;

            }
        }
        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 = total2 + i;

            }
        }

        if (number1 == total2 && number2 == total1) {
//&& şartın ikisininde sağlanması gerek || ile de şartın birinin sağlanması yeterli ve, veya
            System.out.println("Bu iki sayı arkadaştır");
        } else {

            System.out.println("Bu iki sayı arkadaş değildir");
        }

    }
}
