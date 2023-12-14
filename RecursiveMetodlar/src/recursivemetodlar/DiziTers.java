/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivemetodlar;

public class DiziTers {
    public static void main(String[] args) {
        int x[]= {1,2,3,4};
        int y[]= new int[x.length];
        y=diziTers(x, 0);
        for(int i=0;i<y.length; i++){
            System.out.println(y[i]+" ");
        }
    }
    public static int [] diziTers(int []x,int i){
        if(i>=x.length/2)    return x;
        else{
            int temp;
            temp = x[i];
            x[i]=x[x.length-1-i];
            x[x.length-1-i]= temp;
            
        }
        return diziTers(x, i+1);
    }
    
}
