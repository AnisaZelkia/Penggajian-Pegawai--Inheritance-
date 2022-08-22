/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak5_181270;

/**
 *
 * @author anisa
 */
public class satu {
        int x,y;
    
    void tampilXY(){
        System.out.println("Nilai x = " +x+ " dan Nilai y = " +y);
        System.out.println("");
    }
}

class dua extends satu{
    int z;
    
    void jumlah(){
        
        System.out.println("Nilai z\t\t= " +z);
        System.out.println("jumlah (XYZ)\t= " +(x+y+z));
    }
}

class Main_Pewarisan{
    public static void main(String[]args){
        satu Super_Objek = new satu();
        dua Sub_objek = new dua();
        
        System.out.println("Super class");
        Super_Objek.x = 10;
        Super_Objek.y = 20;
        Super_Objek.tampilXY();
        
        System.out.println("SubClass");
        Sub_objek.x = 15;
        Sub_objek.y = 25;
        Sub_objek.tampilXY();
        Sub_objek.z = 30;
        
        Sub_objek.jumlah();
    }
}
