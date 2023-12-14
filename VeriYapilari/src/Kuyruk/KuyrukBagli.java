
package Kuyruk;
class dugum{
    int icerik;
    dugum ileri;

    public dugum(int  icerik) {
        this.icerik=icerik;
        ileri=null;
    }
}
class KuyurukB{
    dugum bas;
    dugum son;
    public KuyurukB() {
        bas=null; son=null;
    }
    boolean isEmpty(){
        return bas==null;
    }
    void push(dugum yeni){
        if(!isEmpty()){
            yeni.ileri=son;
            son=yeni;
        }
    }
    dugum pop(){
        dugum sonuc=bas;
        if(!isEmpty()){
            bas=bas.ileri;
            if(bas==null)
                son=null;
        }
        return sonuc;
    }
}

public class KuyrukBagli {
    public static void main(String[] args) {
        
    }
    
}
