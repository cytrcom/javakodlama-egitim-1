public class Main {
  public static void main(String[] args) {
   
   //reCapDemoSwitch | 2. Proje | Java Switch Statements | Java Switch (Anahtar) İfadeleri
	
   char grade = 'B';
   
  switch(grade) {
  case 'A':
    System.out.println("Mükkemel : Geçtiniz");
    break;
  
  case 'B':
    System.out.println("Çok Güzel : Geçtiniz");
    break;
    
  case 'C':
    System.out.println("İyi : Geçtiniz");
    break;
    
  case 'D':
    System.out.println("Fena Değil : Geçtiniz");
    break;
    
  case 'E':
    System.out.println("Maalesef Kaldınız");
    break;
       
  default:
    System.out.println("Geçersiz Not Girdiniz! Yeniden Deneyin");
  
  }
}
}
