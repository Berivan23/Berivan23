
package recursivemetodlar;
//kendisine parametre olarak gelen stringin palindrom olup olmadığını geri döndüren recursive fonk.
public class Palindrom {
    public static void main(String[] args) {
        String s= "ababa";
        //String x = Palindrom(s, 0, 5);
        System.out.println(Palindrom(s, 0, s.length()-1));
        
    }
    public static String Palindrom(String str, int baslangıc, int son){
        if(baslangıc>=son) return "sirali";
        else if (str.charAt(son)!=str.charAt(baslangıc))  return "sirasiz";
        else     return Palindrom(str, baslangıc+1, son-1);
    }
    
    
}
