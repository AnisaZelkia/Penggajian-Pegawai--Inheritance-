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
  import javax.swing.*;

public class hitung {
  
    public double x,y,r;
 
    public hitung(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
  
    }
    public double keliling(){
        return 2*Math.PI*r;
    }
    public double luas(){
        return Math.PI*r*r;
    }

}
class Lingkaran{
 
    public static void main(String[] args){
        hitung objek1 = new hitung(0,0,0);
        String inputX = JOptionPane.showInputDialog("Nilai x = ");
        int A = Integer.parseInt(inputX);
        objek1.x=A;
        
        String inputY = JOptionPane.showInputDialog("Nilai y = ");
        int B = Integer.parseInt(inputY);
        objek1.y=B;
        
        String inputR = JOptionPane.showInputDialog("Nilai r = ");
        int C = Integer.parseInt(inputR);
        objek1.r=C;
        
        double area = objek1.luas();
        double kel = objek1.keliling();
        
        System.out.println("Luas Lingkaran adalah\t\t: " + area);
        System.out.println("Keliling Lingkaran adalah\t: " + kel);
    }
}
