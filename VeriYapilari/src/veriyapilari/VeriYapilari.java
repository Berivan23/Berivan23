
package veriyapilari;

//import javax.xml.validation.SchemaFactoryLoader;

public class VeriYapilari {
    
    }
class ogrenci2{
        String ad;
        String soyad;
        int yas;
        char cinsiyet; 
        public ogrenci2(String ad, String soyad, int yas, char cinsiyet){
            this.ad= ad;
            this.soyad= soyad;
            this.yas= yas;
            this.cinsiyet= cinsiyet;//bu yapı bir veri yapısına örnektir. this tanımlaması her zaman constructor içine yazılır
        }
    public static void main(String[] args) {
         ogrenci2  ogr= new ogrenci2("Deniz", "Okur", 32, 'K');
         System.out.print(ogr.ad+" "+ogr.soyad+" "+ogr.cinsiyet+" "+ogr.yas);
         ogrenci2 [] o = new ogrenci2[30];
         for(int i=0; i<o.length; i++){
             o[i]= new ogrenci2("A", "B", 21, 'E');//diziye eleman atama
               System.out.println(o[i].ad+" "+o[i].soyad+" "+o[i].cinsiyet+" "+o[i].yas);
         }
    }
    
}
