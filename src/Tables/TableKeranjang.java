/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import Model.Keranjang;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class TableKeranjang extends AbstractTableModel{
     private List<Keranjang> list;

    public TableKeranjang(List<Keranjang> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount(){
        return 5;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            
            case 0:
                return list.get(rowIndex).getBuku().getId_buku();
            case 1:
                return list.get(rowIndex).getBuku().getJudul_buku();
            case 2:
                return list.get(rowIndex).getBuku().getHarga_buku();
            case 3:
                return list.get(rowIndex).getJumlah_pesanan();
            case 4:
                return list.get(rowIndex).getHarga_total();
            default:
                return null;
        }
    }
   
    @Override
    public String getColumnName(int column) {
        switch (column) {
            
            case 0:
                return "Kode Buku";
            case 1:
                return "Judul Buku";
            case 2:
                return "Harga Buku";
            case 3:
                return "Jumlah Beli";
            case 4:
                return "Total";
            default:
                return null;
        }
    }
    
}
