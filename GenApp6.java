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
//sebuah kelas kongkkrit yang berisi 1 variabel get-set dan sebuah method generik
public class GenApp6<T, N> {
  private T type;
    private N type1;
    
    public T getType(){
        return type;
    }
    public void setType(T type){
        this.type = type;
    }
    
    public N getType1(){
        return type1;
    }
    
    public void setType1(N type1){
        this.type1 = type1;
    }
    
    public static void main(String[] args){
    GenApp6<Integer, String> a = new GenApp6<>();
    a.setType(1);
    a.setType1("STT Bandung");
    
    System.out.println(a.getType());
    System.out.println(a.getType1());
    
} 
}
