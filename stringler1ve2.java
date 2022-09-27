import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Stringler {
    //bütün komutları yorum satırı yapmak için kısa yol
    //Ctrl+Shift+/ veya İntellij ide de Code menüsünden Comment With Comment Block tıklanır
    public static void main(String[] args) {
        //STRINGLER 2
        String mesaj = "Bugün hava çok güzel";
        String mesaj1 = "    Bugün hava çok güzel    ";//başında sonunda boşluk var aşağıda trim fonk ile kaldırılacak.
        System.out.println(mesaj);

        String yeniMesaj = mesaj.replace(' ', '-');//boşluk gördüğü yere - koyacak
        //örnek url verirken boşlukları nokta yap gibi.
        //burada ayrıca dikkat et System.out.println yerine string ile yeni bir değişken
        //tanımlayıp fonksiyonu aynı şekilde kullandık.
        System.out.println(yeniMesaj);
        //belirlenen indexten itibaren parçalama yapar,
        System.out.println(mesaj.substring(2));
        //farklı kullanım 2. indexten 5. indexe kadar kes
        System.out.println(mesaj.substring(2, 5));
        //output/çıktı = gün

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime); //belirlenen aralıktan ayırarak alt alta yazar split fonksiyonu
        }
//büyük küçük harf çevirme

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        //nerede kullanılır veri tabanlarında arama ifadesinde kullanılır
        //örnek tümünü küçük harfe çevirip aramayı buna göre yaptırmak.

        System.out.println(mesaj.trim());


        //bütün komutları yorum satırı yapmak için kısa yol
        //Ctrl+Shift+/ veya İntellij ide de Code menüsünden Comment With Comment Block tıklanır

        //STRINGLER 1
        /*String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("Eleman Sayısı :" + mesaj.length());
        System.out.println("5. Eleman Sayısı :" + mesaj.charAt(4));
        //length değerinde 5. elemanı almak için 4 yazma sebebimizi
        //artık biliyoruz değerler 0 sıfırdan başlıyor.
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        //B ile mi başlıyor mesaj değişkeni evet ise true döner hayır ise false
        //b yazılırsa koda false döner büyük küçük harf farklı değerlerdir.
        System.out.println(mesaj.endsWith("."));
        // az kullanılan fonksiyon
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler,0);
        System.out.println(karakterler);

        //yoğun kullanılan bir fonksiyon
        System.out.println(mesaj.indexOf('a')); //soldan ilk a yı bulur
        System.out.println(mesaj.lastIndexOf("e")); //sağdan ilk e yi bulur*/
    }
}
