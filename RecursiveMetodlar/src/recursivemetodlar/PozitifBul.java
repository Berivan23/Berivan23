
package recursivemetodlar;
//kendisine parametre olarak gelen tam sayı dizisinde pozitif olanların sayısını bulup geri döndüren recursive fonk.
public class PozitifBul {
    public static void main(String[] args) {
        int [] x = {1, -98, 67, 45};
        System.out.println(pBul(x, 0));
    }
    public static int pBul(int [] x, int i){
        if(i>=x.length)  return 0;
        else if(x[i]>0) return 1+ pBul(x, i+1);
        else            return pBul(x, i+1);
    }
    
}
