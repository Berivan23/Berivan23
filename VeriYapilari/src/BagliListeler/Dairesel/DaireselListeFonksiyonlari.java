
package BagliListeler.Dairesel;

public class DaireselListeFonksiyonlari {
    DaireListe header;// Dairesel listenin başı
    DaireListe trailer;// Dairesl listenin sonu
    
    void basaEkle(DaireListe yeni){
        if(header==null){
            yeni.next=yeni;
            yeni.prev= yeni;
        }
        else{
            yeni.next= header;
            yeni.prev= header.prev;// header.prev yani son eleman
            header.prev.next = yeni;
            header.prev= yeni;
        }
        header = yeni;
    }
    void ilkElemanSil(){
        if(header.next==header){
            header= null;
        }
        else{
            header.prev.next= header.next;
            header.next.prev= header.prev;
            header= header.next;
        }
    }
    void sonaEkle(DaireListe yeni){
        if(trailer==null){
            yeni.next=yeni;
            trailer=yeni;
        } else{
            trailer.next= yeni;
            yeni.prev=trailer;
            yeni.next=header;
            header.prev=yeni;
        }
        trailer=yeni;

    }
}
