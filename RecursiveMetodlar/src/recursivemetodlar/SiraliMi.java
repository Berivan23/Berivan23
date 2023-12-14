
package recursivemetodlar;

public class SiraliMi {
    public static void main(String[] args) {
        int x[]= {1,2,3};
        boolean t= SiraliMi(x, 0, true);
        if(t)  System.out.println("sirali");
        else System.out.println("sirasiz");
        System.out.println(t);
    }
    public static boolean SiraliMi(int []x, int i, boolean b){
        if(i==x.length-1)  return true;
        else if(x[i]<x[i+1])   return SiraliMi(x, i+1, true);
        else    return false;
    }
}
