/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivemetodlar;

public class KucukBul {
    public static void main(String[] args) {
        String s = "BeriVAn";
        System.out.println(KBul(s, 0));
    }
    public static int KBul(String str, int i){
        if(i>=str.length())   return 0;
        else if(str.charAt(i)>='a'&& str.charAt(i)<='z')   return 1+KBul(str, i+1);
        else                  return KBul(str, i+1);
    }
  
}
