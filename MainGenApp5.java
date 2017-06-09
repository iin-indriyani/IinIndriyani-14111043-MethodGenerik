/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.methodgenerik;

import static oop.methodgenerik.GenApp5.printArray;

/**
 *
 * @author iin
 */
//method generik yang menerima parameter bertipe reference
public class MainGenApp5 implements GenApp5 {
    
    public static void main(String[] args){ 
        System.out.println("Ini dengan tipe data Integer");
        Double dArr[] = new Double[3];
        dArr[0] = 1.32;
        dArr[1] = 2.42;
        dArr[2] = 3.65;
        
        printArray(dArr);
}

   
}