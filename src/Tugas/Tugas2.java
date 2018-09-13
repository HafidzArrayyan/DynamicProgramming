/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Tugas2 {
    private static void tampilJudul(String identitas){
        System.out.println("Identitas : "+identitas);
        
         System.out.println("\nHitung Bayaran Tukang");
         System.out.println("Jenis Barang : A (4 Kg)=Rp.5000 ; B (5 Kg)=Rp.7000; C (2 Kg)=Rp.2000; D (3 Kg)=Rp.3000; E (7 Kg)=Rp.10000");
    }
    public static void main(String[] args){
         String identitas="Muhammad Hafidz Arrayyan Ramadhani / XRPL / 5";
        
        tampilJudul(identitas);
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan Jumlah Berat : ");
        int uang=scan.nextInt();
        int berat[]={7,5,4,3,2};
        String nama[]={"E","B","A","D","C"};
        int upah[]={10000,7000,5000,3000,2000};
        int jumlah;
        
        for(int i=0;i<berat.length;i++){
            if(uang>= berat[i]){
                jumlah=uang/berat[i];
                int banyak=jumlah*berat[i];
                uang=uang%berat[i];
                int harga=jumlah*upah[i];
                System.out.println("Barang "+nama[i]+" sejumlah "+jumlah+" buah dengan total berat "+banyak+"kg \nBayaran "+harga);
            }
        }
        
    }
}
    
