/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author bangz
 */
public class Transaksi {
    private String id_transaksi;
    private double total_harga;
    private double total_bayar;
    private String tanggal_transaksi;
    private int total_buku;
    private double diskon;
    private Buku id_buku;
    private Member id_member;
    
    

    public Transaksi() {
    }

    public Transaksi(String id_transaksi, double total_harga, double total_bayar, String tanggal_transaksi, int total_buku, double diskon) {
        this.id_transaksi = id_transaksi;
        this.total_harga = total_harga;
        this.total_bayar = total_bayar;
        this.tanggal_transaksi = tanggal_transaksi;
        this.total_buku = total_buku;
        this.diskon = diskon;
        
    }
   

    /**
     * @return the id_transaksi
     */
    public String getKode_transaksi() {
        return id_transaksi;
    }

    /**
     * @param id_transaksi the id_transaksi to set
     */
    public void setKode_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    /**
     * @return the total_harga
     */
    public double getTotal_harga() {
        return total_harga;
    }

    /**
     * @param total_harga the total_harga to set
     */
    public void setTotal_harga(double total_harga) {
        this.total_harga = total_harga;
    }
    public double getTotal_bayar() {
        return total_bayar;
    }
    
     public void setTotal_bayar(double total_bayar) {
        this.total_bayar = total_bayar;
    }

    /**
     * @return the tanggal_transaksi
     */
    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    /**
     * @param tanggal_transaksi the tanggal_transaksi to set
     */
    public void setTanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    /**
     * @return the total_buku
     */
    public int getTotal_buku() {
        return total_buku;
    }

    /**
     * @param total_buku the total_buku to set
     */
    public void setTotal_buku(int total_buku) {
        this.total_buku = total_buku;
    }

    /**
     * @return the diskon
     */
    public double getDiskon() {
        return diskon;
    }

    /**
     * @param diskon the diskon to set
     */
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
    
    public String showTransaksi(){
    
         return "Kode Transaksi      : "+getKode_transaksi()+ "\n" +
                "Tanggal Transaksi   : "+getTanggal_transaksi() + "\n" +
                "Banyak Buku         : "+getTotal_buku() + "\n" +
                "Total Harga         : "+getTotal_harga() + "\n" +
                "Diskon              : "+getDiskon() + "\n" +
                "Total Bayar         : "+getTotal_bayar();
    }
    
}
