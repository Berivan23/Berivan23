
package recursivemetodlar;

public class Artirma {
    public static void main(String[] args) {
        int x[] ={1,2,3,4};
        int y[]= artirma(x, 0);
        for(int i=0; i<y.length;i++){
            System.out.println(y[i]+" ");
        }
    }
    public static int [] artirma(int []x, int i){
        if(i>=x.length)  return x;
        else   x[i]=x[i]+1;
        return artirma(x, i+1);
    }
    
}
