
package recursivemetodlar;

public class BasamakSayisiBul {
    public static void main(String[] args) {
        int x= Bul(432);
        System.out.println(x);
        
    }
    public static int Bul(int deger){
        if(deger>=0 && deger<10) return 1;//durma şartı
        else                     return 1+Bul(deger/10);
    }
    
}
