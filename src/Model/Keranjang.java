/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Buku;
import Model.Transaksi;

/**
 *
 * @author ASUS
 */
public class Keranjang {
//    private String id_transaksi;
//    private String id_keranjang;
    private Buku buku;
    private int jumlah_pesanan;
    private int harga_total;

    public Keranjang() {
    }

    public Keranjang( Buku buku, int jumlah_pesanan, int harga_total) {
      
        this.buku = buku;
        this.jumlah_pesanan = jumlah_pesanan;
        this.harga_total = harga_total;
    }

//   
// @Override
//    public String toString(){
//        return id_transaksi;
//    }

    public Keranjang(String id_buku, String judul_buku, float harga_buku, int parseInt, float parseFloat) {
    }
  

    public Buku getBuku() {
        return buku;
    }

    public void setId_transaksi(Buku buku) {
        this.buku = buku;
    }
    
//    public String toString(){
//        return jumlah_pesanan;
//    }
     public int getJumlah_pesanan() {
        return jumlah_pesanan;
    }

    public void setId_transaksi(int jumlah_pesanan) {
        this.jumlah_pesanan = jumlah_pesanan;
    }
    
     public int getHarga_total() {
        return harga_total;
    }

    public void setHargaTotal(int harga_total) {
        this.harga_total = harga_total;
    }
    
//    public String showKeranjang(){
//    return "--------------------------------"+
//        "ID Keranjang       : "+id_keranjang;
//}
}

