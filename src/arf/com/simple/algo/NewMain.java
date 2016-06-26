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
        //System.out.println("gap : "+Binary(6));
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {};
        System.out.println((CycleicRotation(arr2,3)).toString());
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
    
   
     public static int[] CycleicRotation(int[] A, int K) {
        // write your code in Java SE 8
        if(A.length<1 || K <0){
            return A;
        }
        else{
            System.out.println("2");
            int []copy = A.clone();
            int offset = A.length - K% A.length;
            for(int i=0;i<=A.length-1;i++){
                int idx = (i+offset)%A.length;
                A[i] = copy[idx];
                System.out.print(A[i]+"  ");
            }
            return A;
        }
        
    }
    
}
