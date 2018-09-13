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
public class Tugas1 {
    private static void tampilJudul(String identitas){
        System.out.println("Identitas : "+identitas);
        
         System.out.println("\nHitung Kombinasi Pecahan Uang");
         System.out.println("Jenis pecahan uang : 100 ; 500 ; 1000 ; 2000 ; 5000");
    }
    public static void main(String[] args){
        String identitas="Muhammad Hafidz Arrayyan Ramadhani / XRPL / 5";
        
        tampilJudul(identitas);
        System.out.print("Masukkan nilai uang anda : ");
        Scanner baca=new Scanner(System.in);
        int uang=baca.nextInt();
        int pecahan[] = new int[]{5000,2000,1000,500,200};
        int jumlah;
        
        for(int i=0; i<pecahan.length;i++){
            if(uang>=pecahan[i]){
                jumlah=uang/pecahan[i];
                uang=uang%pecahan[i];
                System.out.println("Pecahan "+pecahan[i]+" sebanyak "+jumlah+" lembar");
            }
        }
    }
    
}
