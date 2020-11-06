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
class NilaiBesarKecil {
    public String petugas;
    public int jumlah;
    public int nilaiMhs[];
    public int terkecil;
    public int terbesar;
    
    public void banyakNilai(){
        Scanner input = new Scanner(System.in);
        int i;
        for (i=0; i<jumlah; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+": ");
            nilaiMhs[i] = input.nextInt();
        }
    }
    
    public void Hasil(){
        terbesar = nilaiMhs[0];
        terkecil = nilaiMhs[0];
        int i;
        for (i=0; i<jumlah; i++){
            if (nilaiMhs[i] < terkecil)
                terkecil = nilaiMhs[i];    
            if (nilaiMhs[i] > terbesar){
                terbesar = nilaiMhs[i];
            }
        }
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (i=0; i<jumlah; i++){
            System.out.printf("Nilai Mahasiswa Ke-%1$d = %2$d%n",i+1,nilaiMhs[i]);
        }
    }
    
}
