
package BagliListeler.CiftYonlu;

public class CiftListe {
    Tanimlama header;//Liste başı = header
    Tanimlama trailer;//liste sonu = trailer
    //private CiftListe next;
    //private CiftListe prev;//Global tanımlama
    public CiftListe() {
        header= null;
        trailer= null;
    }
    public void basaEkle(Tanimlama yeni){
         if(trailer==null)
             trailer=yeni;
         header.prev=yeni;    //else
         yeni.next=header;
         header=yeni;
    }
    public void sonaEkle(Tanimlama yeni){
       if(header== null){
           header=yeni;
       } 
       else{
           trailer.next=yeni;
           yeni.prev=trailer;
           trailer=yeni;
       } 
    }
    public void ortaEkle(Tanimlama once, Tanimlama yeni){
        yeni.next=once.next;// yani öncenin ilerisi, yeni elemandan sonra gelecek olan 
        yeni.prev=once;
        once.next=yeni;
        once.next.prev=yeni;
    }
    public void listeSonuSil() {
        trailer=trailer.prev;
        if(trailer==null)
            header=null;
        trailer.next=null;// else
    }
    void ilkElemanSilme(){
        header=header.next;
        if(header==null)
            trailer=null;
        else
            header.prev=null;
    }
}
