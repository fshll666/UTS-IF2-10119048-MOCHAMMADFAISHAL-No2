/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119048.mochammadfaishal.no2;

import java.util.Scanner;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : UTS 2
 */
public class UTSIF210119048MOCHAMMADFAISHALNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        
        int kredit;
        
        System.out.println("=====Program Penarikan Uang=====");
        System.out.printf("Masukan saldo Awal : " ); tabungan.Tabungan(scanner.nextInt());
        System.out.printf("Jumlah uang yang diambil : "); kredit = scanner.nextInt();
        System.out.printf("Saldo Anda Sekarang : %d\n",tabungan.tarik(kredit));
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
    }
}
