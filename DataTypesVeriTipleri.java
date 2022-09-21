public class Main {
  public static void main(String[] args) {
   
   //DATA TYPES VERİ TİPLERİ
   //Primiteve Types = İlkel Tip (En temel veri tipleri)
   
   	int myNum = 5;               // integer (whole number)
    float myFloatNum = 5.99f;    // floating point number
    char myLetter = 'D';         // character (tek karakter tutar 2 byte alan kaplar 'DD' olmaz)
    boolean myBool = true;       // boolean (0 veya 1, yanlış veya doğru değerlerini tutar)
    String myText = "Hello, Selam";     // String
    byte sayi1=127; //-128,  +127 arası veri kabul eder 128 veya 1270 vb. yazdığınızda hata verir.
    int sayi2=1; //ondalıklı sayı kullanılmaz bunun için double veya float kullanılır.
    double sayi3=1.5;
    
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
    System.out.println(sayi1);
    System.out.println(sayi2);
    System.out.println(sayi3);
    
  }
}
