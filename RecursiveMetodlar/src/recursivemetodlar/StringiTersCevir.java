
package recursivemetodlar;
//kendisine parametre olarak gelen stringi ters çevirip geri döndüren recursive metot
public class StringiTersCevir {
    public static void main(String[] args) {
        String s= "Berivan";
        System.out.println(TerCevir(s, s.length()-1));
        
    }
    public static String TerCevir(String str, int i){
        if(i>=0)   return str.charAt(i)+TersCevir(str,i-1);
        
    }
}
