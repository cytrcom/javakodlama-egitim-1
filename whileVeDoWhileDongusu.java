public class Main {
  public static void main(String[] args) {
   //WHILE Döngüsü
   //DO-WHILE Döngüsü

   int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
    }  
    System.out.println("While döngüsü bitti");
 //Do-While Döngüsü
 int j = 0;
 do{
      System.out.println(j);
      j++;
 }while (j < 5);
   
    System.out.println("Do-While döngüsü bitti");
    
    /* do-while ile while döngüsü arasındaki fark nedir
    şart sağlanmasa bile do-while ile kod çalışır. ancak while çalışmaz. while döngüsündeki değeri 20 yap mesala çıktı da olayı anlarsın.
    do-while de program satır satır çalıştığı için devam eder kod.
    bu nerede kullanılır : 
    örnek server da log kaydı oluştup oluşmadığı anlaşılması için kullanılabilir gibi.
    */
  }
 
}
