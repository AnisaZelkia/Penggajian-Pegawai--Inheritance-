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
import java.util.Scanner;
class Pegawai
{
                String NIP,Nama;            
                public void input()
                {
                                Scanner a=new Scanner (System.in);
                                System.out.print("Masukkan Nama\t: ");
                                Nama=a.nextLine();      
                                System.out.print("Masukkan NIP\t: ");
                                NIP=a.nextLine();           
                }
                public void cetak()
                {
                                System.out.println ("Nama\t: "+Nama);
                                System.out.println ("NIP\t: "+NIP);
                }
}
class tetap extends Pegawai
{
                char Gol;
                int J_masuk,Gj_pokok,U_transp,total_gaji;        
                public void input1()
                {
                                input();
                                Scanner b=new Scanner (System.in);
                                Scanner c=new Scanner (System.in);
                                System.out.println("+------------------------------------------+");
                                System.out.println("+------------------------------------------+");
                                System.out.println(" Ket Golongan : ");
                                System.out.println(" A\t : Staff");
                                System.out.println(" B\t : Kepala Bagian");
                                System.out.println(" A\t : Kepala Biro");
                                System.out.println("+------------------------------------------+");
                                System.out.println("+------------------------------------------+");
                                
                                System.out.print("Masukkan Golongan = ");
                                Gol=b.nextLine().charAt(0);
                               
                                System.out.print("Masukkan Jam Masuk = ");
                                J_masuk=c.nextInt();
                }             
                public void cetak1()
                {
                                cetak();
                                if(Gol=='A')
                                {
                                                Gj_pokok=2500000;
                                                U_transp=20500;
                                }
                                else if(Gol=='B')
                                {
                                                Gj_pokok=4000000;
                                                U_transp=27500;
                                }
                                else if (Gol=='C')
                                {
                                                Gj_pokok=8000000;
                                                U_transp=37000;
                                }
else
                                {
                                                System.out.println("Tidak Ada");
                                }
                               
                                total_gaji= Gj_pokok+(J_masuk*U_transp);                      
                                System.out.println("Total Gaji = "+total_gaji);                   
                }
}
class tidak_tetap extends Pegawai
{
                int jml_hadir;
                int gaji=150000;
                public void input2()
                {
                                input();
                                Scanner a=new Scanner (System.in);
                                System.out.print("Masukkan Jumlah Hadir = ");
                                jml_hadir=a.nextInt();
                }             
                public void cetak2()
                {
                                int total_gaji2;
                                cetak();               
                                total_gaji2= jml_hadir*gaji;                        
                                System.out.println("Total Gaji = "+total_gaji2);
                }
}
public class inheritance{

    public static void main(String[]args)
    {
                tetap t=new tetap();
                tidak_tetap tt=new tidak_tetap();          
                int lanjut;
                int pilihan;        
        System.out.println("+------------------------------------------+");
        System.out.println("| Tugas Pemograman Java Materi Inheritance |");
        System.out.println("|            Menghitung Gaji Pegawai       |");
        System.out.println("============================================");
                do
                {
                                Scanner AA=new Scanner(System.in);
        System.out.println("[1] Pegawai Tetap");
        System.out.println("[2] Pegawai Tidak Tetap");
        System.out.println("[3] Exit");
        System.out.print("PILIH MENU> ");
                                pilihan=AA.nextInt();
                               
                                if(pilihan==1)
                                {
                                                t.input1();
                                                t.cetak1();
                                }
                                else if(pilihan==2)
                                {
                                                tt.input2();
                                                tt.cetak2();
                                }
                                else if(pilihan==3)
                             {
                                  System.exit(0);
                                }
                                else
                                {
                                                System.out.println("Data Tidak Ada");
                                }
                               
                                System.out.print("Lanjutkan? YA(1) /TIDAK(2) = ");
                                lanjut=AA.nextInt();
                                System.out.println("");                
                }
                while(lanjut==1);
                System.out.println("TERIMA KASIH");
    }


}