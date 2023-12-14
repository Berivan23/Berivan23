/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivemetodlar;

public class Simetrik {
    public static void main(String[] args) {
        int[] x={1,1,1,1};
        int  t = simetrik(x, 0, 1);
        if(t==1)   System.out.println("simetrik");
        else System.out.println("simetrik değilaa");
    }
    public static int [] simetrik(int []x, int i, int b){
        if(i>=x.length/2)  return 1;
        else if(x[i]==x[x.length-1-i])   return simetrik(x, i+1, 1);
        else return-1;
    }
}
