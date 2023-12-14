
package Kuyruk;

class Eleman{
    int data;
    Eleman(int data){
        this.data=data;
    }
}
class Kuyruk{
    Eleman dizi[];
    int bas, son;
    int N;
    Kuyruk(int N){
        dizi= new Eleman[N];
        this.N=N;
        bas=0;
        son=0;
    }
    boolean doluMu(){
        return bas==(son+1)%N;//Bu yazım şekliyle if(bas==(son+1)%N)  return true   else return false syntax aynıdır.
    }
    boolean isEmpty(){
        return bas==son;
    }
    Eleman Ekle(Eleman yeni){
        if(!doluMu()){
            dizi[son]=yeni;
            son= (son+1)%N;//dizi boyutu aşma hatası almamak için bu kod
        }
        return yeni;
    }
    Eleman sil(){
        if(!isEmpty()){
            Eleman sonuc;
        sonuc=dizi[bas];
        bas=(bas+1)%N;
        return sonuc;
        }
        else
            return null;
    }
}
public class Kuyruk_Uygulamalari {
    public static void main(String[] args) {
        Kuyruk k = new Kuyruk(10);
        k.Ekle(new Eleman(5));
        k.Ekle(new Eleman(8));
        k.Ekle(new Eleman(13));
        while(!k.isEmpty()){
            Eleman s = k.sil();
            System.out.println(s.data);
        }
    }
    
}
