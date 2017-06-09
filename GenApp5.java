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
//method generik yang menerima parameter bertipe reference
public interface GenApp5 {
    public static <T> void printArray(T[] a)
    {
	for (Object o : a) {
		System.out.println(o);
	}
    }
}
