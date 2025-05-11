/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keuangan.BAB5;




/**
 *
 * @author brili
 */
public class Data_Nasabah {
    String nama,JenisKelamin, TglLahir, Alamat, Kontak;
      
    void dataNama(String Nama){
        this.nama = Nama;
    }
    void dataJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }  
    void dataTglLahir(String TglLahir){
        this.TglLahir = TglLahir;
    }
  
    void dataAlamat(String alamat){
        this.Alamat = alamat;
    }  
    
    void dataKontak(String Kontak){
        this.Kontak = Kontak;
    } 
    
    String cetakNama(){
        return nama;
    }
    String cetakJenisKelamin(){
        return JenisKelamin;
    }
    String cetakTglLahir(){
        return TglLahir;
    }
    
    String cetakAlamat(){
        return Alamat;
    }
    
    String cetakKontak(){
        return Kontak;
    }

    
}
