
package BagliListeler;
class eleman{
    int icerik;
    eleman ileri;
    public eleman(int icerik){
        this.icerik=icerik;
        ileri=null;
    }
}
class Ara{
    eleman bas;
    eleman son;
    public Ara(){
        bas=null;
        son=null;
    }
    public eleman listedeAra(int deger){
        eleman tmp=bas;//tmp burada gezici
        while(tmp!=null){
            if(tmp.icerik==deger)
                return tmp;
            tmp=tmp.ileri;// basında else var değilse
        }
        return null;//listede bulunamamsı halinde
    }
}
public class listeAra {
    public static void main(String[] args) {
        Ara a = new Ara();
        eleman aranan = a.listedeAra(2);
         if(aranan==null) 
             System.out.println("listede bulunamadı");
         else
             System.out.println("aranan eleman: "+aranan.icerik);
        
    }
    
}
