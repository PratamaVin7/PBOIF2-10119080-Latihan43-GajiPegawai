/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan43.gajipegawai;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Gaji Pegawai
 */
public class PBOIF210119080Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gajiPegawai = new GajiPegawai();
        
        gajiPegawai.setUangTunjangan(250000);
        int uangTunjangan = gajiPegawai.getUangTunjangan();
        
        gajiPegawai.setUangTransport(300000);
        int uangTransport = gajiPegawai.getUangTransport();
        
        gajiPegawai.setGajiPokok(4500000);
        int gajiPokok = gajiPegawai.getGajiPokok();
        
        int jml = gajiPegawai.totalGaji(uangTunjangan, uangTransport, gajiPokok);
        gajiPegawai.setTotalGaji(jml);
        int totalGaji = gajiPegawai.getTotalGaji();
        
        gajiPegawai.tampilData("Rizki Adam Kurniawan", 
                               "Jalan Semar dlm 4 No 77/66", uangTunjangan, 
                               uangTransport, gajiPokok, totalGaji);
    }
    
}