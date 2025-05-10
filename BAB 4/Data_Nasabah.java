/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keuangan.BAB4;

/**
 *
 * @author brili
 */
public class Data_Nasabah {
    private String norek;
    private String nama;
    private String jenisAkun;
    private String status;
    private String tglBuka;

    public Data_Nasabah(String norek, String nama, String jenisAkun, String status, String tglBuka) {
        this.norek = norek;
        this.nama = nama;
        this.jenisAkun = jenisAkun;
        this.status = status;
         this.tglBuka = tglBuka;
    }
    public String getNoRekening() { return norek; }
    public String getNama() { return nama; }
    public String getJenisAkun() { return jenisAkun; }
    public String getStatus() { return status; }
    public String getTglBuka() { return tglBuka; }
}
