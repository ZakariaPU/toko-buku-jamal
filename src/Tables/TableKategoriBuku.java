/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import Model.KategoriBuku;
import View.TambahKategoriView;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class TableKategoriBuku extends AbstractTableModel {
    private List<KategoriBuku> list;
    
    public TableKategoriBuku(List<KategoriBuku> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount(){
        return 2;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId_kategori();
            case 1:
                return list.get(rowIndex).getKategori();
            default:
                return null; 
        }
    }
  
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id_kategori";
            case 1:
                return "kategori";
            default:
                return null;
        }
    }
    
}
