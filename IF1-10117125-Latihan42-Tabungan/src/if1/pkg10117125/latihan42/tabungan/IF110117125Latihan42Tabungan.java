/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan42.tabungan;
import java.util.Scanner;

/**
 *
 * NAMA     : Zulfi Ihzam Rahmat
 * KELAS    : IF-1
 * NIM      : 10117125
 * Deskripsi Program : berisi program penarikan uang yang hasilnya jelas
 * 
 */
public class IF110117125Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        tabungan tabungan = new tabungan();

        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukkan Saldo Awal\t: " );
        
        int saldo = scan1.nextInt();
        tabungan.tabungan(saldo);
       
        
        System.out.print("Jumlah uang yang diambil: ");
        int jumlah = scan2.nextInt();
        saldo = tabungan.tabungan(saldo) - tabungan.ambilUang(jumlah);        
        System.out.println("Saldo Anda sekarang\t: " +saldo);
        
    }
    
}
