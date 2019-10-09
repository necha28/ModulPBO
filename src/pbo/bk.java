/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author necha
 */
public class bk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        bk objek = new bk();
        int a;
        String x;
        int pilihan;
        System.out.println("Selamat datang di ruang BK.....SAHABAT SISWA!!!");
        System.out.println("[1]Guru1\n[2]Guru2\n[3]Guru3\n[4]Kursi\n[5]Meja\n[6]Gambar\n[7]Lemari\n[8]Kipas\n[9]Laptop\nMasukkan pilihan anda:");
        pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                objek.Guru1("");
                break;
            case 2:
                objek.Guru2("");
                break;
            case 3:
                objek.Guru3("");
                break;
            case 4:
                objek.Kursi("");
                break;
            case 5:
                objek.Meja("");
                break;
            case 6:
                objek.Gambar("");
                break;
            case 7:
                objek.Lemari("");
                break;
            case 8:
                objek.Kipas("");
                break;
            case 9:
                objek.Laptop("");
                break;
        }
    }
    private void Guru1(String guru){
        System.out.println("======GURU 1======");
        guru = "Dra.Peni Wardayani";
        String alamat = "Pandanwangi, Belimbing";
        String nohp = "085100077830";
        String jadwal = "Senin-Jumat waktu jam kerja";
        char jeniskelamin = 'P';
        System.out.println("Nama Guru     : "+guru);
        System.out.println("Alamat        : "+alamat);
        System.out.println("No HP         : "+nohp);
        System.out.println("Jadwal Kerja  : "+jadwal);
        System.out.println("Jenis Kelamin : "+jeniskelamin);
        System.out.println("==============================");
    }
    private void Guru2(String guru){
        System.out.println("======GURU 2======");
        guru = "Endah Kurniawati,M.Pd";
        String alamat = "Jl.Tapaksiring No.56 Samaan Klojen, Malang";
        String nohp = "082244329758";
        String jadwal = "Senin-Jumat waktu jam kerja";
        char jeniskelamin = 'P';
        System.out.println("Nama Guru     : "+guru);
        System.out.println("Alamat        : "+alamat);
        System.out.println("No HP         : "+nohp);
        System.out.println("Jadwal Kerja  : "+jadwal);
        System.out.println("Jenis Kelamin : "+jeniskelamin);
        System.out.println("==============================");
    }
    private void Guru3(String guru){
        System.out.println("======GURU 3======");
        guru = "Drs.Siswaroso";
        String alamat = "Jl.Bandulan gg8 B No 394D Bandulan,Malang";
        String nohp = "085100077831";
        String jadwal = "Senin-Jumat waktu jam kerja";
        char jeniskelamin = 'L';
        System.out.println("Nama Guru     : "+guru);
        System.out.println("Alamat        : "+alamat);
        System.out.println("No HP         : "+nohp);
        System.out.println("Jadwal Kerja  : "+jadwal);
        System.out.println("Jenis Kelamin : "+jeniskelamin);
        System.out.println("==============================");
    }
    private void Kursi(String kursi){
        System.out.println("======KURSI======");
        String warna = "Coklat";
        int jumlah = 20;
        System.out.println("Warna Kursi  : "+warna);
        System.out.println("Jumlah Kursi : "+jumlah);
        System.out.println("==============================");
    }
    private void Meja(String meja){
        System.out.println("======MEJA======");
        String warna = "Coklat";
        int jumlah = 9;
        System.out.println("Warna Meja  : "+warna);
        System.out.println("Jumlah Meja : "+jumlah);
        System.out.println("==============================");
    }
    private void Gambar(String gambar){
        System.out.println("======GAMBAR======");
        String warna = "Warna terang";
        int jumlah = 7;
        String model = "Batik(geometris) dan contoh hasil fotografi";
        System.out.println("Warna Gambar : "+warna);
        System.out.println("Jumlah Gambar: "+jumlah);
        System.out.println("Model Gambar : "+model);
        System.out.println("==============================");
    }
    private void Lemari(String lemari){
        System.out.println("======LEMARI======");
        String warna = "Coklat";
        int jumlah = 1;
        System.out.println("Warna Kursi  : "+warna);
        System.out.println("Jumlah Kursi : "+jumlah);
        System.out.println("==============================");
    }
    private void Kipas(String kipas){
        System.out.println("======KIPAS======");
        String warna = "Putih";
        int jumlah = 1;
        System.out.println("Warna Kursi  : "+warna);
        System.out.println("Jumlah Kursi : "+jumlah);
        System.out.println("==============================");
    }
    private void Laptop(String laptop){
        System.out.println("======LAPTOP======");
        String warna = "Hitam";
        int jumlah = 1;
        String merk = "Asus";
        System.out.println("Merk Laptop : "+merk);
        System.out.println("Warna Kursi : "+warna);
        System.out.println("Jumlah Kursi: "+jumlah);
        System.out.println("==============================");
    }
}