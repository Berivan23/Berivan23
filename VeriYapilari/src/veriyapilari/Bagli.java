
package veriyapilari;
//bağlı listeler, bellekte ihtiyaç kaddar yer açar.
//düğüm=node
 class Eleman{
    int veri;
    Eleman ileri;

    public Eleman(int veri) {
        this.veri= veri;
        ileri=null;
    }
 }  
   class BListe{ //Listenin başını ve sonunu tanımlamalısın
       Eleman ilk;
       Eleman son;
       Eleman yeni;
        public void sonaEkle(Eleman yeni){
           if(ilk==null){
               ilk= yeni;
               son =yeni;
           }
           else{
               son.ileri=yeni;
               son = yeni;
           }
       }
       
        public BListe(){
            ilk = null;
            son=null;
        }
        public String listele(){
            String s="";
            Eleman yedek=ilk;
            while(yedek!=null){
                s+=yedek.veri+"-->";
                yedek= yedek.ileri;
                
            }
            System.out.println(s);
            return s;
        }
        public void basaEkle(){
            if(son==null){
                ilk=yeni;
                son=yeni;
            }else{
                yeni.ileri=ilk;
                ilk=yeni;
            }
        }
   } 

public class Bagli {
    public static void main(String[] args) {
        BListe liste = new BListe();
        Eleman e1= new Eleman(5);
        Eleman e2= new Eleman(7);
        liste.sonaEkle(e1);
        liste.sonaEkle(e2);
        Eleman e4=new Eleman(10);
        //liste.basaEkle(e4);
        Eleman e5= new Eleman(45);
        //liste.basaEkle(e5);
        
    }
}
