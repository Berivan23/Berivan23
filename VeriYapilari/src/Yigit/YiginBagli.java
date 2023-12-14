package Yigit;
class Eleman{
    int icerik;
    Eleman ileri;

    public Eleman(int icerik) {
        this.icerik=icerik;
        ileri=null;
    }
}
class Yigin{
    Eleman ust;

    public Yigin() {
        ust=null;
    }
    boolean isEmpty(){
        return ust == null;
    }
    void push(Eleman d){
        if(isEmpty())    ust=d;
        else{
            d.ileri=ust;
            ust=d;
        }
    }
    Eleman pop(){
        Eleman trailer =ust;
        if(!isEmpty()){
            ust=ust.ileri;
        }
        return trailer;
    }
}
public class YiginBagli {
    public static void main(String[] args) {
        Yigin yb = new Yigin();
        yb.push(new Eleman(10));
        yb.push(new Eleman(20));
        System.out.println(yb.pop().icerik);
        yb.push(new Eleman(8));
        yb.push(new Eleman(13));
        yb.push(new Eleman(15));
        while(!yb.isEmpty()){
            System.out.println(yb.pop().icerik);
        }
    }
}


