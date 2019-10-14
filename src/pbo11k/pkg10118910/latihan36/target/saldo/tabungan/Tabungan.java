/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan36.target.saldo.tabungan;

/**
 *
 * @author syifa
 * NAMA     : Muhamad Syifa Amruloh
 * KELAS    : IF11K
 * NIM      : 10118910
 * 
 * Deskripsi Program : Program ini berisi program untuk Menampilkan Target Saldo Tabungan
 * dengan konsep Objek
 */
public class Tabungan {

    private int saldo;
    private double bunga;
    
    public void target_tabungan(){
    saldo =3500000;
    int i=1;
        do {            
            bunga = saldo*0.08;
            saldo = (int)(saldo + bunga);
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,10d%n",saldo);
            i++;
        } while (saldo <= 6000000);
    }
    
    public static void main(String[] args) {
        //Inisialisasi Objek
        Tabungan tb = new Tabungan();
        tb.target_tabungan();
    }
    
}
