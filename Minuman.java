/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi9no2;

import java.util.ArrayList;

/**
 *
 * @author HP 14S
 */
public class Minuman {
  public static void main(String[] args) {
    // Membuat ArrayList bernama menuMinuman
    ArrayList<String> menuMinuman = new ArrayList<>();

    // Menambahkan beberapa makanan ke menuMinuman
    menuMinuman.add("Jus Alpukat");
    menuMinuman.add("Jus Jeruk");
    menuMinuman.add("Es Teh Manis");
    menuMinuman.add("Milkshake");
    menuMinuman.add("Mineral");

    // Mencetak daftar makanan di menuMakanan
    System.out.println("Daftar Minuman:");
    for (int i = 0; i < menuMinuman.size(); i++) {
      System.out.println((i+1) + ". " + menuMinuman.get(i));
    }

    // Menghapus minuman dari menuMinuman
    menuMinuman.remove(3); // Menghapus "Jus Jeruk"
    menuMinuman.remove(2); // Menghapus "Milkshake"

    // Mencetak daftar minuman di menuMinuman setelah dihapus
    System.out.println("\nDaftar Minuman Setelah Dihapus:");
    for (int i = 0; i < menuMinuman.size(); i++) {
      System.out.println((i+1) + ". " + menuMinuman.get(i));
    }
  }
}
