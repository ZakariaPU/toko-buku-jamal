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
public class Nota {
    
    private Transaksi transaksi;

    /**
     * @return the transaksi
     */
    
    public Nota(Transaksi transaksi){
        this.transaksi = transaksi;
        
    }
    
    
    public Transaksi getTransaksi() {
        return transaksi;
    }

    /**
     * @param transaksi the transaksi to set
     */
    public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
    }
   
    
    public String showNota(){
        return "---------------------"+
               "ID Transaksi        : "+ transaksi.getKode_transaksi()+
               "Tanggal Transaksi   : "+ transaksi.getTanggal_transaksi()+
               "Total Diskon        : "+ transaksi.getDiskon()+
               "Total Buku          : "+ transaksi.getTotal_buku()+
               "Total Harga         : "+ transaksi.getTotal_harga()+
               "Total Bayar         : "+ transaksi.getTotal_bayar();
        
    }
}


