
package BagliListeler;
class dugum{
    int icerik ;
    dugum ileri;
    public dugum(int icerik){//listenin içeriğindeki sayıları tutmak için bu işlem yapıldı
        this.icerik=icerik;
        ileri=null;
    }
}
class BListe{
    dugum bas, son;
    public BListe(){
        bas=null; son=null;
    }
    void SonaEkle(dugum yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }
        else{
            son.ileri=yeni;
            son=yeni;
        }
    }
}
public class ListeSonunaEkle {
    public static void main(String[] args) {
        BListe b= new BListe();
        b.SonaEkle(new dugum(56));
        b.SonaEkle(new dugum(-71));
        b.SonaEkle(new dugum(12));
        dugum tmp= b.bas;
        while(tmp!=null){
            System.out.print(tmp.icerik+"--->");
            tmp=tmp.ileri;
        }
    }
}
