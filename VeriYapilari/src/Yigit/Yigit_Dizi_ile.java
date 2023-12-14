
package Yigit;
class Eleman{
    int icerik;
    int N;

    public Eleman(int icerik) {
        this.icerik=icerik;
    }
}
class Yigin{
    Eleman dizi [];
    int ust;
    int N;

    public Yigin(int N) {
        this.N=N;
        ust=-1;// yığıt başlangıçta boş olduğu için -1
        dizi= new Eleman[N];
    }
    boolean isEmpty(){
        return ust==-1; // üst -1'e eşitse boştur.
    }
    boolean doluMu(){
        return ust == N-1;// N-1 olmasının sebebi: önce üstü artırıp sonra eleman ekleriz. üst -1'den bşaladığından N eleman
    }                      //dönenilmesi için ust N-1 olmalı
    void push(Eleman e){
        if(!doluMu()){
            ust++;
            dizi[ust] = e;
        }
    }
    Eleman pop(){// pop() metodu en son eklenen elemanı çıkartıp geri döndürür
        if(!isEmpty()){
            ust--;
            return dizi[ust+1];
        }
        else
            return null;
    }
    Eleman top(){// top() metodu en son eklenen nessneyi çıkartmadan geri döndürür
        if(!isEmpty())    return dizi[ust];
        else              return null;
    }
}
public class Yigit_Dizi_ile {
    public static void main(String[] args) {
        Yigin y = new Yigin(15); // 15 elemanlı bir yığın
        for (int i = 0; i < 10; i++) {
            y.push(new Eleman(i));
        }
       y.pop();//son elemanı sildi
       y.top();//son elemanı silmeden gei döndürdü
        while(!y.isEmpty()){
            System.out.println(y.pop().icerik);
        }
    }
    
}
