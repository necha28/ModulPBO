/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author necha
 */
public class TugasPraktikum1 {
    public static void main(String[] args) {
        int p=5;
        int l=10;
        int t=5;
        double pi=3.14;
        int r=7;
        System.out.println("===MENGHITUNG LUAS PERMUKAAN BALOK===");
        System.out.println("Nilai Panjang Balok = "+p);
        System.out.println("Nilai Lebar Balok   = "+l);
        System.out.println("Nilai Tinggi Balok  = "+t);
        System.out.println("Luas Permukaan Balok= "+((2*p*l)+(2*p*t)+(2*l*t)));
        System.out.println("==================================");
        System.out.println("===MENGHITUNG LUAS PERMUKAAN BOLA===");
        System.out.println("Nilai Jari Jari Bola= "+r);
        System.out.println("Nilai pi            = "+pi);
        System.out.println("Luas Permukaan Bola = "+(4*pi*r*r));
        System.out.println("==================================");
    }
}


