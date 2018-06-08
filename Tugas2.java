/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

public class Tugas2 {

 
    public static void main(String[] args) {
       
        System.out.println("Perbedaan penggunaan 'equals' dan '=='");
        System.out.println("");
        
        String s1 = "saya suka nasi goreng";
        String s2 = "saya suka nasi goreng";
        String s3 = "saya suka ";
        String s4 = "makan ";
        String s5 = "nasi goreng";
        String s6 = s3 + s4 + s5;
        
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
        
        System.out.println("s1 == s2 : " + (s1==s2));
        System.out.println("s6 == s1 : " + (s6==s1));
        System.out.println("s6 == s2 : " + (s6==s2));
        System.out.println("s1 equals s2 : " + (s1.equals(s2)));
        System.out.println("s6 equals s1 : " + (s6.equals(s1)));
        System.out.println("s6 equals s2 : " + (s6.equals(s2)));
        
        
    }
    
}
