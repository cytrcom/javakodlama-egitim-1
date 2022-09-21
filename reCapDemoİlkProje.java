public class Main {
  public static void main(String[] args) {
   
   //reCapDemo | İlk Proje | Büyük sayıyı bul
	
    int num1=20;
    int num2=25;
    int num3=2;
    
    int maxNum=num1;	//en büyük sayıyı 1. sayı kabul ederek değişkene atadık
    
    if (maxNum < num2){	//şuanda en büyük sayı değişkeni içerisinde sayı1 var bu nedenle sayi2 ile karşılaştırıyoru.
    	maxNum = num2;	//eğer burada şart sağlanırsa sayi2 içerisinde artık en büyük sayı olacak
    }
    if (maxNum < num3){	//yukarıdaki şart burada tekrar kontrol ediliyor.
    	maxNum = num3;
    }
       
    System.out.println("En Büyük Sayı :" + maxNum); //sonuçta en büyük sayı içeriği yansıtılıyor.
    
    //Output/Çıktı : En Büyük Sayı :25
    
  }
}
