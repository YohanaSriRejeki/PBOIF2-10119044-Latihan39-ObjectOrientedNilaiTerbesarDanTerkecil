/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan39.objectorientednilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan nilai terbesar dan 
 * terkecil dari nilai yang dimasukkan oleh user dengan metode object oriented
 */
public class PBOIF210119044Latihan39ObjectOrientedNilaiTerbesarDanTerkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        NilaiBesarKecil nbk = new NilaiBesarKecil();
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa");
        System.out.print("Masukkan Nama Petugas : ");
        nbk.petugas = input.next();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nbk.jumlah = input.nextInt();
        
        nbk.nilaiMhs = new int[nbk.jumlah];
        nbk.banyakNilai();
        nbk.Hasil();
        
        System.out.println();
        System.out.println("Nilai Terbesar adalah "+nbk.terbesar);
        System.out.println("Nilai Terkecil adalah "+nbk.terkecil);
        System.out.println();
        System.out.println("Petugas : "+nbk.petugas);
    }
    
}
