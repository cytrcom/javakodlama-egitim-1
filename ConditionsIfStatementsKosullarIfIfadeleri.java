public class Main {
  public static void main(String[] args) {
   
    //Conditions and If Statements | Koşullar(Şartlar) ve İf İfadeleri

	/*
    Less than: a < b 					      (a, b den küçükse)
	Less than or equal to: a <= b 		(a, b den küçük veya eşit ise)
	Greater than: a > b 				      (a, b den büyükse)
	Greater than or equal to: a >= b 	(a, b den büyük veya eşit ise)
	Equal to a == b 					        (a, b ye eşit ise) 
	Not Equal to: a != b 				      (a, b ye eşit değil ise)
    */
        
    //1. Örnek
    int num = 20;		//Buradaki değeri değiştirerek sonuçları görebiliriz.
    
    if (num < 20){
    System.out.println("Sayı 20'den küçüktür.");
    }
    else if(num ==20){
    System.out.println("Sayı 20'ye eşittir.");
    }
    else{
    System.out.println("Sayı 20'den büyüktür.");
    }
    
    //2. Örnek
    
    int time = 22;
    
	if (time < 10) {
  		System.out.println("Günaydın.");
	} 
    else if (time < 20) {
  	System.out.println("İyi günler.");
	} 
    else {
  	System.out.println("İyi akşamlar.");
	}
 
  }
}
