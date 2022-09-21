public class Main {
  public static void main(String[] args) {
   
   //Java For Loop | For Döngüsü 

	// 1 den (1 dahil) 10 kadar (10 dahil) olan sayıları yazdırma
    
   for (int i=1;i<=10;i++){ 
   /*
   i=1 ifadesi i'yi 1 e eşitledik (Sayaç Tanıma)
   i<10 ifadesi şart kısmı (Şart)
   i++ veya i=i+1 ifadesi i'yi birer birer artır demektir. i-- de birer birer azaltır. (Artış Değeri)
   */
   System.out.println(i);
   //i 1 den başlar 10 olunca kadar bu satır ile for satırı arasında işlem devam eder. buna döngü diyoruz.
   }
   
   //Tek Sayıları Yazdırma 
   System.out.println("Tek Sayılar:");
  for (int i=1;i<=10;i+=2){
      System.out.println(i);
  
   }
   
    //Tek Sayıları Yazdırma 
   System.out.println("Çift Sayılar:");
  for (int i=2;i<=10;i=i+2){
      System.out.println(i);
  
  /*Output / Çıktı
  
1
2
3
4
5
6
7
8
9
10
Tek Sayılar:
1
3
5
7
9
Çift Sayılar:
2
4
6
8
10
  
  */
  
  
   }
   
   }
}
