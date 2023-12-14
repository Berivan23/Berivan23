
package BagliListeler.CiftYonlu;

public class Tanimlama {
    int icerik;
    Tanimlama next;  //ileri
    Tanimlama  prev;  //geri
    public Tanimlama(int icerik) {
        this.icerik=icerik;
        next= null;
        prev = null;
    }
    
}
