
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package Control;

import DAO.Dao;
import Model.Admin;
import Model.Buku;
import Model.KategoriBuku;
import Model.Member;
import Model.Transaksi;
import Model.Keranjang;
import java.util.List;
import Tables.TableKategoriBuku;
import Tables.TableMember;
import Tables.TableBuku;
import Tables.TableKeranjang;
//
///**
// *
// * @author bangz
// */
public class Controller {

    Buku B = new Buku();
    KategoriBuku KB = new KategoriBuku();
    Member M = new Member();
    Transaksi T = new Transaksi();
    Keranjang K = new Keranjang();
   
    Dao dao = new Dao();
    
    public Controller(){
    }
    public void setKategoriBuku(String id_kategori, String kategori){
           KB = new KategoriBuku(id_kategori, kategori);
       }
       public void setBukuString(String id_buku, String judul_buku, String penulis_buku, String penerbit_buku, int tahun_terbit, int stok, int harga_buku, KategoriBuku kategori_buku){
           B=new Buku(id_buku, judul_buku, penulis_buku, penerbit_buku, tahun_terbit, stok, harga_buku, kategori_buku);
       }
       public void setMember(String id_member, String nama_member, String jenis_kelamin, String no_hp, String alamat){
          M = new Member(id_member, nama_member, jenis_kelamin, no_hp, alamat);
       }
        
       public TableKeranjang showKeranjang(List <Keranjang> dataKeranjang){
        TableKeranjang tableKeranjang = new TableKeranjang(dataKeranjang);
        return tableKeranjang;
    }
       
//       public TableMember showListMember(){
//        dao.makeConnection();
//        List<Member> dataMember = dao.showMember();
//        TableMember tblmem = new TableMember(dataMember);
//        dao.closeConnection();
//        
//        return tblmem;
//    }
       
       public List<Member> searchMember(String query){
        dao.makeConnection();
        List<Member> dataMember = dao.searchMember(query);
        dao.closeConnection();
        
        return dataMember;
    }
       
       public TableMember showDataMember(String query){
        dao.makeConnection();
        List<Member> dataMember = dao.searchMember(query);
        TableMember tableMember = new TableMember(dataMember);
        dao.closeConnection();
        
        return tableMember;
    }
       
       public void showMember()
    {
        dao.makeConnection();
        dao.showMember();
        dao.closeConnection();
    }
       
    public void insertMember(Member M)
    {
        dao.makeConnection();
        dao.insertMember(M);
        dao.closeConnection();
    }
    
    //Digunakan untuk menapilkan dengan bentuk list pada GUI
//    public String showDepartemen2() {
//        dao.makeConnection();
//        List<Member> departemen = dao.showDepartemen2();
//        dao.closeConnection();
//        String departemenString = "";
//        for (int i=0; i < departemen.size(); i++) {
//            departemenString = departemenString + departemen.get(i).showDepartemen() + "\n";
//        }
//        
//        return departemenString;
//    }
    
    public void updateMember(Member M)
    {
        dao.makeConnection();
        dao.updateMember(M);
        dao.closeConnection();
    }
    
    public void deleteMember(String kode)
    {
        dao.makeConnection();
        dao.deleteMember(kode);
        dao.closeConnection();
    }
    
//    public Member searchMember(String kode)
//    {
//        Membertemp = new Member();
//        dao.makeConnection();
//        temp = dao.searchDepartemen(kode);
//        dao.closeConnection();
//        return temp;
//    }
        
    
    public Admin searchAdmin(String username, String password)
    {
        Admin temp = null;
        dao.makeConnection();
        temp = dao.searchAdmin(username, password);
        dao.closeConnection();
        return temp;
    }
    
// Buku
    
    public void insertBuku (Buku B)
    {
        dao.makeConnection();
        dao.insertBuku(B);
        dao.closeConnection();
    }
    
    public void updateBuku (Buku B)
    {
        dao.makeConnection();
        dao.updateBuku(B);
        dao.closeConnection();
    }
    
    public void deleteBuku(String kode)
    {
        dao.makeConnection();
        dao.deleteBuku(kode);
        dao.closeConnection();
    }
   
//    public Buku searchBuku(String kode)
//    {
//        Buku temp = null;
//        dao.makeConnection();
//        temp = dao.searchBuku(kode);
//        dao.closeConnection();
//        return temp;
//    }
    
    //Kategori Buku
    
    public void insertKategoriBuku (KategoriBuku KB)
    {
        dao.makeConnection();
        dao.addKategori(KB);
        dao.closeConnection();
    }
    
//    public KategoriBuku searchKategori(String kode)
//    {
//        KategoriBuku temp = null;
//        dao.makeConnection();
//        temp = dao.searchKategoriBuku(kode);
//        dao.closeConnection();
//        return temp;
//    }
     public List<Buku> searchBuku(String query){
        dao.makeConnection();
        List<Buku> dataBuku = dao.searchBuku(query);
        dao.closeConnection();
        return dataBuku;
    
        }
    
        public List<KategoriBuku> searchKategoriBuku(String query){
        dao.makeConnection();
        List<KategoriBuku> dataKategoriBuku = dao.searchKategoriBuku(query);
        dao.closeConnection();
        
        return dataKategoriBuku;
    
        }
        
        public List<KategoriBuku> showListKategoriBuku() {
        dao.makeConnection();
        List<KategoriBuku> dataKB= dao.showKategoriBuku();
//        TableKategoriBuku tableKategori = new TableKategoriBuku(dataKB);
        dao.closeConnection();
        return dataKB;
    }
        
        public TableKategoriBuku showDataKategoriBuku(String query){
        dao.makeConnection();
        List<KategoriBuku> dataKategori = dao.searchKategoriBuku(query);
        TableKategoriBuku tableKategori = new TableKategoriBuku(dataKategori);
        dao.closeConnection();
        
        return tableKategori;
    }
         
       
        public TableBuku showDataBuku(String query){
        dao.makeConnection();
        List<Buku> dataBuku = dao.searchBuku(query);
        TableBuku tableBuku = new TableBuku(dataBuku);
        dao.closeConnection();
        
        return tableBuku;
    }
//         public TableMember showDataMember(String query){
//        dao.makeConnection();
//        List<Member> dataMember = dao.searchMember(query);
//        TableMember tableMember = new TableMember(dataMember);
//        dao.closeConnection();
//        
//        return tableMember;
//    }
        
        public List<KategoriBuku> showListKategoriBukuComboBox() {
        dao.makeConnection();
        List<KategoriBuku> dataKB= dao.showKategoriBukuComboBox();
        dao.closeConnection();
        return dataKB;
    }
         public List<Buku> showBukuCombobox() {
        dao.makeConnection();
        List<Buku> dataKB= dao.showbukucombo();
        dao.closeConnection();
        return dataKB;
    }
        
//        public String showListKategoriBukuComboBox() {
//        dao.makeConnection();
//        List<KategoriBuku> kategoriBuku = dao.showKategoriBukuComboBox();
//        dao.closeConnection();
//        String kategoriBukuString = "";
//        for (int i=0; i < kategoriBuku.size(); i++) {
//            kategoriBukuString = kategoriBukuString + kategoriBuku.get(i).showKategori() + "\n";
//        }
//        
//        return kategoriBukuString;
//    }
         
//        public TableKeranjang showDataKeranjang(String query){
//        dao.makeConnection();
//        List<Keranjang> dataKeranjang = dao.search;
//        TableKeranjang tableKeranjang = new TableKeranjang(dataKeranjang);
//        dao.closeConnection();
//        
//        return tableKeranjang;
//    }
        
    public void InsertTransasksi (Transaksi T){
     dao.makeConnection();
     dao.insertTransaksi(T);
     dao.closeConnection();
    }
    
    public void InsertDetailTransaksi(String id_transaksi, String id_buku){
        dao.makeConnection();
        dao.insertDetailTransaksi(id_transaksi, id_buku);
        dao.closeConnection();
    }
    
    public void clearKeranjang (){
        dao.makeConnection();
        dao.clearKeranjang();
        dao.closeConnection();
    }
    
    public void ShowTransaksi(){
        dao.makeConnection();
        dao.showTransaksi();
        dao.closeConnection();
    }
    
    public void ShowNota(){
        dao.makeConnection();
        dao.ShowNota();
        dao.closeConnection();      
    }
}
