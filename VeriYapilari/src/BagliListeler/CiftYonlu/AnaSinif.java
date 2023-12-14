
package BagliListeler.CiftYonlu;

public class AnaSinif {
    public static void main(String[] args) {
        CiftListe cl = new CiftListe();
       cl.sonaEkle(new Tanimlama(8));
       cl.basaEkle(new Tanimlama(7));
       cl.basaEkle(new Tanimlama(6));
       cl.basaEkle(new Tanimlama(5));
       cl.sonaEkle(new Tanimlama(9));
       cl.listeSonuSil();
       cl.ilkElemanSilme();
      // cl.ortaEkle(new Tanimlama (7,6,8));
       Tanimlama temp=cl.header;
       while(temp!=null){
           System.out.print(temp.icerik+ "--->");
           temp=temp.next;//bu işlemi yapmazsakk sonsuz döngüye girer
          
           
       }
    }
}
