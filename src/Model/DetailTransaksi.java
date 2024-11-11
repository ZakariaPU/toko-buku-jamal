/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Buku;

/**
 *
 * @author ASUS
 */
public class DetailTransaksi {
    private int id_detail;
    private Buku buku;
    private int jumlah_pesanan;
    private int harga_total;

    public DetailTransaksi(int id_detail, Buku buku, int jumlah_pesanan, int harga_total) {
        this.id_detail = id_detail;
        this.buku = buku;
        this.jumlah_pesanan = jumlah_pesanan;
        this.harga_total = harga_total;
    }
    
    public int getId_detail() {
        return id_detail;
    }

    public void setId_detail(int id_detail) {
        this.id_detail = id_detail;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public int getJumlah_pesanan() {
        return jumlah_pesanan;
    }

    public void setJumlah_pesanan(int jumlah_pesanan) {
        this.jumlah_pesanan = jumlah_pesanan;
    }

    public int getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(int harga_total) {
        this.harga_total = harga_total;
    }
    
    
}

    

