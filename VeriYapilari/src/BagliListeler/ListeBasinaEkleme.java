
package BagliListeler;
class eleman{
    int icerik;
    int once;
    eleman ileri;
    public eleman(int icerik) {
        this.icerik=icerik;
        
        ileri=null;
    }
}
class liste{
    eleman bas;
    eleman son;

    public liste() {
        bas=null;
        son=null;
    }
    public void basaEkle(eleman e){
        if(son==null){//listenin boş olduğu anlamına gelir
            bas=e;
            son=e;
        }else{//listede en az bir eleman varsa
            e.ileri=bas;
            bas=e;
        }
    }
    public void OrtaEkle (eleman once, eleman e){//e=yeni
        if(bas==null){
           bas = e;
           son=e;
        }else{
            once.ileri=e;
            e.ileri=once.ileri;
        }
    }
}
public class ListeBasinaEkleme {
    public static void main(String[] args) {
        liste l1=new liste();
        l1.basaEkle(new eleman(5));
        l1.basaEkle(new eleman(6));
        l1.basaEkle(new eleman(8));
       // l1.OrtaEkle(new eleman((6,7 ));
        
      //  l1.OrtaEkle(new eleman(6,7));
        eleman tmp = l1.bas;//bağlı listede baş eleman mutlaka tutulmalı. baş tutulmazsa liste üzerinde gezinemeyiz
        while(tmp!=null){//ekrana elemanları yazdırmak için döngü oluşturduk 
            System.out.print(tmp.icerik+"--->");
            tmp=tmp.ileri;
//Döngü Bitimi: Döngü, tmp değişkeni null olduğunda sona erer. Bu, listenin sonuna ulaştığınız anlamına gelir ve döngüden çıkarsınız.            
        }
    }
  
}
