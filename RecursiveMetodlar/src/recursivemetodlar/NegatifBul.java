
package recursivemetodlar;
//kendisine parametre olarak gelen tam sayı dizisi içinde negatif olanların sayısını bulup geri döndüren recursive metot
public class NegatifBul {
    public static void main(String[] args) {
        int dizi[] = {-67, 23, -12, 89, 65, -2, -98};
        System.out.println(nBul(dizi, 0));
    }
    public static int nBul(int [] dizi, int i ){
        if(i>=dizi.length)    return 0;
        else if(dizi[i]<0)    return 1+ nBul(dizi, i+1);
        else                  return nBul(dizi, i+1);
    }
}
