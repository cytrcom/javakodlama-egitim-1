public class miniProjeAsalSayi {

    public static void main(String[] args) {
        int number = 1;
        //bir sayının başka bir sayıya bölündüğünde kalanı veren operatör remainder (kalan)
        int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = true;
        //isPrime asal mı demek ingilizce de

        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return;
            //1 girildiğinde sayı asal değildir yazar ve buradan sonra return ile kodu devam ettirmez
        }

        if (number < 1) {
            System.out.println("Geçersiz sayı");
        }

        for (int i = 2; i < number; i++) {
            //burada 2 den 24 e kadar bi döngü kurduk
            if (number % i == 0) {
                //sayi mod 1,2,3... şeklinde hepsini kontrol edecek 25 e kadar
                isPrime = false;

            }
        }

        if (isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }
    }
}
