/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesi9no1;

/**
 *
 * @author HP 14S
 */
public class MahasiswaKu {
    public static void main(String[] args) {
        Mahasiswa <String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClass(21);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClass());
    }
}