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
public class GenApp7 {
    String mahasiswa;
    
    public String getMahasiswa(){
        return mahasiswa;
    }
    public void setMahasiswa(String mhs){
     this.mahasiswa= mhs;   
    
    }
 
    private static <T> void newMahasiswa (T free) {
        System.out.println(free);
    }    
    public static void main (String[] Args){
        GenApp7 nw = new GenApp7();
        
        nw.setMahasiswa("Iin Indriyani");
        System.out.println(nw.getMahasiswa());
        newMahasiswa("Teknik Informatika");
        
    }
}
