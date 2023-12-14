
package recursivemetodlar;
import java.util.Scanner;
// problemin çözümündeki matematiksel modeli biliyorsak öncelikle hangi geğer için en kolay çözüme ulaşıyorsak o degeri 
//geri döndürürüz. Daha sonra diğer değerler için bir algoritma geliştiririz. Yani döngü (loops) kullanmak yerine özyinelemeli
//algoritmik yapıyı kullanırız.
// Recursive fonksiyonlar interaktive metotlara göre daha dezavantajlıdır çünkü daha yavaş çalışır 

public class RecursiveMetodlar {
    public static void main(String[] args) {
        // tümevarım tasarım mantığı
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir deger giriniz: ");
        int deger = input.nextInt();
        
        System.out.println("1'den "+deger+"'e kadar olan sayıların toplamı "+ToplamBul1(deger));
        System.out.println("Recursive(özyinelemeli) metod ile hesaplana değer "+ ToplamBul2(deger));
        System.out.println("");
        
        System.out.println(deger+"! sonucu: "+ Faktoriyel1(deger));
        System.out.println("Recursive ile hesaplanan deger "+ Faktoriyel2(deger));
        System.out.println("");
        
        System.out.println(deger+". Fibonacci sayısı: "+ Fibonacci1(deger));
        System.out.println( "Recursive ile hesaplanan deger: "+ Fibonacci2(deger));
        System.out.println("");
        
        System.out.print("Lütfen taban degerini giriniz: ");
        int taban=input.nextInt();
        System.out.print("Lütfen us degerini giriniz: ");
        int us= input.nextInt();
        System.out.println(taban+"^"+us+" isleminin sonucu:"+ UstAl1(taban, us));
        System.out.println("Recursive(ozyinelemeli) metot ile hesaplanan deger: "+ UstAl2(taban, us));
    }
    
    public static int ToplamBul1(int n){
        int sonuc=0;
        int i=n;
        while( i>=0){
            sonuc+=i;
            i--;
        }
        return sonuc;
    }
    
    public static int ToplamBul2(int n){
        if(n==1)    return   1;
        else        return   n + ToplamBul2(n-1);
    }
    
    public static int Faktoriyel1(int n){
        int sonuc=1;
        int i=1;
        while(i<=n){
            sonuc*=i;
            i++;
        }
        return sonuc;
    }
    
    public static int Faktoriyel2(int n){
        if(n==0)    return 1;
        else        return n*Faktoriyel2(n-1);
    }
    
    public static int Fibonacci1(int n){  //1,1,2,3,5,8,13,21,34,55,89,144...
        int sonuc=1;
        if(n==1 || n==2)   return sonuc;
        else{
            int sayi1=1, sayi2=1;
            int i=3;// başlangıç değerini 3'ten başladık çünkü ilk ikisinin sonucunu yukarıda geri döndürdük
            while(i<=n){
                sonuc = sayi1+sayi2;
                sayi1=sayi2;
                sayi2=sonuc;
                i++;
            }
        }
        return sonuc;
        
    }
    
    public static int Fibonacci2(int n){
        if(n==1 || n==2)   return 1;
        else              return  Fibonacci2(n-1)+ Fibonacci2(n-2);
    }
    
    public static int UstAl1(int x, int y){ // x^y
        int sonuc =1;
        int i=1;
        while(i<=y){
           sonuc*=x;
           i++;
        }
        return sonuc;
    }
    
    public static int UstAl2(int x, int y){
        if(x==0)  return 0;
        else if(x==1 || y==0)   return 1;
        else       return x*UstAl2(x, y-1);
    }
    
}
