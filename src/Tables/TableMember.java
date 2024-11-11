/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import Model.Member;

/**
 *
 * @author ASUS
 */
public class TableMember extends AbstractTableModel{
     private List<Member> list;

    public TableMember(List<Member> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount(){
        return 5;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId_member();
            case 1:
                return list.get(rowIndex).getNama_member();
            case 2:
                return list.get(rowIndex).getJenis_kelamin();
            case 3:
                return list.get(rowIndex).getNo_hp();
            case 4:
                return list.get(rowIndex).getAlamat();
            default:
                return null;
                       
        }   
    }
    
     public String getColumnName(int column){
        switch(column){
            case 0: return "ID Member";
            case 1: return "Nama Member";
            case 2: return "Jenis Kelamin";
            case 3: return "No HP";
            case 4: return "Alamat";
            default: return null;
        }
    }
}
