/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keuangan.BAB5;




/**
 *
 * @author brili
 */
public class Cetak_Data {
    public static void main(String[] args) {
     // membuat object dengan nama “mhs” dari class Mahasiswa
     Data_Nasabah nasabah = new Data_Nasabah(); 
     //ketika akan menggunakan method dari class Mahasiswa maka harus menyertakan nama object
     nasabah.dataNama("Brilianty Sekar Mustika");
     nasabah.dataTglLahir("2001-01-03");
     nasabah.dataJenisKelamin("Perempuan");
     nasabah.dataAlamat("Jalan Dorowati Selatan No 26");
     nasabah.dataKontak("Malang");
     System.out.println("Data Nasabah Bank Sekar Pradana\n");
     System.out.println("------------------------------------"); 
     System.out.println("Nama           : "+ nasabah.cetakNama()); 
     System.out.println("Tanggal Lahir  : "+ nasabah.cetakTglLahir()); 
     System.out.println("Jenis Kelamin  : "+ nasabah.cetakJenisKelamin()); 
     System.out.println("Alamat         : "+ nasabah.cetakAlamat()); 
     System.out.println("Kontak         : "+ nasabah.cetakKontak()); 
    }
}
