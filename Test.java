/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bioproject;

/**
 *
 * @author hyperlink
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("Enter DNA: ");
         Scanner in = new Scanner(System.in);
        String d= in.next();
        d = d.toUpperCase();
       
        TranslationNew t1= new TranslationNew();
         TranslationNew t2= new TranslationNew();
        t1.setDNA(d);
        t1.setComplement();
        t1.setRNA();
        System.out.println("RNA : "+t1.getRNA());
        System.out.println("Rna 2"+t2.getRNA());
        System.out.println("Comple "+t1.getComplement());
        
//        System.out.println("1st: "+t1.get1st());
//        
//        t1.get1p();
//        System.out.println("2: "+t1.get2nd());
//        
//        t1.get2p();
//        
//        System.out.println("3: "+ t1.get3rd());
//       
//        t.get3p();
//        System.out.println("4: "+t.get4th());
//       
//       
//        t.get4p();
//        
//        System.out.println("5: "+ t.get5th());
//       
//       
//        t.get5p();
//        System.out.println("6: "+ t.get6th());
//        t.get6p();
    }
    
}
