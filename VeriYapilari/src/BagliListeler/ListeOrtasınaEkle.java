
package BagliListeler;
class Eleman{
    int icerik;
    int yeni;
    Eleman ileri;
    public Eleman(int icerik, int yeni) {
        this.icerik=icerik;
        ileri=null;
    }
}
class List{
    Eleman bas;
    Eleman son;
    List(){
        bas=null;
        son=null;
    }
    public void OrtaEkle (Eleman once, Eleman yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }else{
            yeni.ileri=once.ileri;
            once.ileri=yeni;
        }
    }
}
public class ListeOrtasınaEkle {
    public static void main(String[] args) {
        List x = new List();
        x.OrtaEkle(new Eleman(5, 8));
        x.OrtaEkle(new Eleman(97, 9));
        Eleman tmp=x.bas;
        while(tmp!=null){
            System.out.print(tmp.icerik+"--->");
            tmp=tmp.ileri;
        }
    }
}
