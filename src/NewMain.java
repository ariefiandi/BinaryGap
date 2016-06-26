/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ariefiandinugraha
 */

import java.math.*;
import java.util.Collections;
import java.*;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("gap : "+Binary(6));;
    }
    
    public static int Binary(int number){
        
        String a = Integer.toBinaryString(number);
        System.out.println("Binary"+a);
        int gap = 0;
        int counter =0;
        boolean firstBinary = false;
        
        for(int i=a.length()-1; i>=0; i--){
            
            if (a.charAt(i)=='1'){
                gap = Math.max(gap, counter);
                counter =0;
                firstBinary = true;
            }
            else if (a.charAt(i)=='0' && firstBinary==true){
                counter++;
            }
        }
        
        gap = Math.max(gap, counter);
        
        return gap;
    }
    
}
