/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.methodgenerik;

/**
 *
 * @author iin
 */
//method generik dengan mempunyai lebih dari satu type
public class GenApp3 {
    private static <T, N> void printArray(T[] a, N[] b)
    {
	for (Object o : a) {
		System.out.println(o);
	}
        for (Object i : b){
            System.out.println(i);
        }
    }

public static void main(String[] args){
	Character cArr[] = new Character[3];
        cArr[0] = '5';
        cArr[1] = '9';
        cArr[2] = '8';
        
        Double dArr[] = new Double[3];
        dArr[0] = 0.32;
        dArr[1] = 0.42;
        dArr[2] = 2.65;
        
        printArray(cArr, dArr);
        
        
        
    }
    
}
