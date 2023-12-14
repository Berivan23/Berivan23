
package BagliListeler.Dairesel;

public class AnaClass {
    public static void main(String[] args) {
        DaireselListeFonksiyonlari dl = new DaireselListeFonksiyonlari();
        dl.basaEkle(new DaireListe(8));
        dl.basaEkle(new DaireListe(7));
        dl.basaEkle(new DaireListe(6));
        dl.ilkElemanSil();
        dl.sonaEkle(new DaireListe(9));
        DaireListe tmp = dl.header;
        while(tmp!= null){
            System.out.print(tmp.icerik+"--->");
            tmp=tmp.next;
            if(tmp==dl.header)
                System.exit(0);
        }

    }
    
}


