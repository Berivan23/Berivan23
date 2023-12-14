
package BagliListeler.Dairesel;

public class DaireListe {
    int icerik;
    DaireListe next;
    DaireListe prev;

    public DaireListe(int icerik) {
        this.icerik=icerik;
        next=null;
        prev= null;
    }
    
}
