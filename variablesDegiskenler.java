public class Main {
  public static void main(String[] args) {
   	//Değişkenler (Variables)
	  /*
String  - "Merhaba" gibi metinleri saklar. Metinler değerleri çift tırnak içine alınarak yazılır.
int - 123 veya -123 gibi tam sayıları ondalık olmadan saklar.
float - 19.99 veya -19,99 gibi ondalıklı sayıları  saklar.
char - 'a' veya 'B' gibi tek karakterleri saklar. Karakter değerleri tek tırnak içine alınır
boolean - değerleri iki durumla saklar: true veya false
	  */
    /*
    değişken isimlendirme standardına camelCasing denir ... örnek: ogrenciSayisi 
    */
    
    int sayi = 10;
    int ogrenciSayisi = 20;
    String mesaj ="Öğrenci Sayımız :"; //String S si büyük yazılır java da
    System.out.println(sayi);
    System.out.println(ogrenciSayisi);
    System.out.println("Öğrenci Sayısı :"+ ogrenciSayisi);
    System.out.println(mesaj + ogrenciSayisi);         
  }
}
