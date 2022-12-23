/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi9no2;

import java.util.ArrayDeque;

/**
 *
 * @author HP 14S
 */
public class Delivery {
  public static void main(String[] args) {
    ArrayDeque<String> antrianKasir = new ArrayDeque<>();

    // Menambahkan beberapa pelanggan ke antrianKasir
    antrianKasir.add("Pelanggan 1");
    antrianKasir.add("Pelanggan 2");
    antrianKasir.add("Pelanggan 3");
    antrianKasir.add("Pelanggan 4");
    antrianKasir.add("Pelanggan 5");

    // Mencetak daftar Pelanggan di antrianKasir
    System.out.println("Daftar Pelanggan:");
    for (String Kasir : antrianKasir) {
      System.out.println(Kasir);
    }

    // Membayar untuk Pelanggan pertama di antrianKasir
    String PelangganSedangDiproses = antrianKasir.poll();
    System.out.println("\nSedang melakukan pembayaran untuk pelanggan: " + PelangganSedangDiproses);

    
    // Mencetak daftar kendaraan di antrianKasir setelah diproses
    System.out.println("\nDaftar Pelanggan Setelah Diproses:");
    for (String kendaraan : antrianKasir) {
      System.out.println(kendaraan);
    }
  }
}
