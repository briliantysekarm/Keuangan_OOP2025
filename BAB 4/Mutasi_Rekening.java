/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keuangan.BAB4;

/**
 *
 * @author brili
 */
public class Mutasi_Rekening extends Data_Nasabah {
    private double saldoAwal;
    private double setoran;
    private double penarikan;
    private final double biayaAdmin = 5000.0;

    public Mutasi_Rekening(String noRek, String nama, String jenis, String status, String tglBuka,
                           double saldoAwal, double setoran, double penarikan) {
        super(noRek, nama, jenis, status, tglBuka);
        this.saldoAwal = saldoAwal;
        this.setoran = setoran;
        this.penarikan = penarikan;
    }

    public double hitungSaldoAkhir() {
        return saldoAwal + setoran - penarikan - biayaAdmin;
    }

    public double getBiayaAdmin() {
        return biayaAdmin;
    }

    public double getSaldoAwal() {
    return saldoAwal;
    }

   public double getSetoran() {
    return setoran;
    }

    public double getPenarikan() {
    return penarikan;
    }
}

