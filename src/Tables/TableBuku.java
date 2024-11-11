/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import Model.Buku;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class TableBuku extends AbstractTableModel {
    private List<Buku> list;

    public TableBuku(List<Buku> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount(){
        return 8;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId_buku();
            case 1:
                return list.get(rowIndex).getJudul_buku();
            case 2:
                return list.get(rowIndex).getKategori_buku();
            case 3:
                return list.get(rowIndex).getPenulis_buku();
            case 4:
                return list.get(rowIndex).getPenerbit_buku();
            case 5:
                return list.get(rowIndex).getTahun_terbit();
            case 6:
                return list.get(rowIndex).getStok();
            case 7:
                return list.get(rowIndex).getHarga_buku();
            default:
                return null;
                       
        }   
    }
    
     public String getColumnName(int column){
        switch(column){
            case 0: return "ID Buku";
            case 1: return "Judul";
            case 2: return "Kategori Buku";
            case 3: return "Penulis Buku";
            case 4: return "Penerbit Buku";
            case 5: return "Tahun Terbit";
            case 6: return "Stok";
            case 7: return "Harga";
            default: return null;
        }
    }
    
}
