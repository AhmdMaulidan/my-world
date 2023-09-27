/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PernyataanifElseif {
    public static void main(String[] args) {
     
    int nilai;
    Scanner input = new Scanner(System.in);
     
    System.out.print("Input Nilai Anda (0 - 100): ");
    nilai = input.nextByte();
     
    
    if (nilai >= 90 ) {
      System.out.println("A!");
    }
    else if( nilai <0 || nilai >100){
        System.out.println("Nilai anda tidak ada");
    }
    else if (nilai >= 80 && nilai < 90) {
      System.out.println("B");
    }
    else if (nilai >= 60 && nilai < 80) {
      System.out.println("C");
    }
    else if (nilai >= 40 && nilai < 60) {
      System.out.println("D");
    }
    else if (nilai < 40) {
      System.out.println("E");
    }
    else {
      System.out.println("Maaf, format nilai tidak sesuai");
    }
    
  }
    }
