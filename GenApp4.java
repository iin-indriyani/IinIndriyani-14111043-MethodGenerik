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
//method generik dengan tidak memiliki parameter
public class GenApp4 <T , N>{
    private T type;
    private N type1;
    
    public T getType(){
        return type;
    }
    public void setType(){
        this.type = type;
    }
    
    public N getType1(){
        return type1;
    }
    
    public void setType1(){
        this.type1 = type1;
    }
    public static void main(String[] args){
    GenApp4<Integer, String> a = new GenApp4<>();
    a.setType();
    a.setType1();
    
    System.out.println(a.getType());
    System.out.println(a.getType1());
    
}
}