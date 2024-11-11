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
public class Buku {
    protected String id_buku;
    protected String judul_buku;
    protected String penerbit_buku;
    protected String penulis_buku;
    protected KategoriBuku kategori_buku;
    protected int tahun_terbit;
    protected int stok;
    protected int harga_buku;
 

    public Buku() {
    }

    public Buku(String id_buku, String judul_buku, String penulis_buku, String penerbit_buku, int tahun_terbit, int stok, int harga_buku, KategoriBuku kategori_buku) {
        this.id_buku = id_buku;
        this.judul_buku = judul_buku;
        this.penulis_buku = penulis_buku;
        this.penerbit_buku = penerbit_buku;
        this.tahun_terbit = tahun_terbit;
        this.stok = stok;
        this.harga_buku = harga_buku;
        this.kategori_buku = kategori_buku;
    }

    public String getId_buku() {
        return id_buku;
    }

    public void setId_buku(String id_buku) {
        this.id_buku = id_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getPenerbit_buku() {
        return penerbit_buku;
    }

    public void setPenerbit_buku(String penerbit_buku) {
        this.penerbit_buku = penerbit_buku;
    }

    public String getPenulis_buku() {
        return penulis_buku;
    }

    public void setPenulis_buku(String penulis_buku) {
        this.penulis_buku = penulis_buku;
    }

    public KategoriBuku getKategori_buku() {
        return kategori_buku;
    }

    public void setKategori_buku(KategoriBuku kategori_buku) {
        this.kategori_buku = kategori_buku;
    }
    
    public int getStok() {
        return stok;
    }

    public void setStok(int Stok) {
        this.stok = stok;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public float getHarga_buku() {
        return harga_buku;
    }

    public void setHarga_buku(int harga_buku) {
        this.harga_buku = harga_buku;
    }
    
    public String showBuku(){
    return "--------------------------------"+
        "ID Buku        : "+id_buku+
        "Judul          : "+judul_buku+
        "Penerbit       : "+penerbit_buku+
        "Pengarang      : "+penulis_buku+
        "Tahun          : "+tahun_terbit+
        "Harga Buku     : "+harga_buku+
        "Kategori Buku  : "+kategori_buku.getKategori()+"    "+kategori_buku.getKategori()+"\n";
    }
//    
//    public void showBukuByKategori(){
//    
//     System.out.println("| "+id_buku+ "|"+judul_buku+ "|");
//    
//    }

}
