/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Model.Member;
import java.util.List;
import Control.Controller;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Tables.TableMember;
/**
 *
 * @author ASUS
 */
public class MemberView extends javax.swing.JFrame {
    Controller C = new Controller();
    String action = null;
    String selectedId;
//    List<Member> listmem= new ArrayList<>(); 
    List<Member> listmem; 
    /**
     * Creates new form Member
     */
    public MemberView() {
        initComponents();
        setComponents(false);
//        Btn_Search.setEnabled(true);
        clearText();
        setRadioJenisKelamin(false);
        setEditDeleteBtn(false);
        showMember();
    }
    
     public void setComponents (boolean value) {
        
        InputIDMember.setEnabled(value);
        InputNamaMember.setEnabled(value);
        InputNoHanphone.setEnabled(value);
        InputAlamat.setEnabled(value);
//        Rb_Laki.setEnabled(value);
//        Rb_Perempuan.setEnabled(value);
//        Btn_AddMember.setEnabled(value);
        Btn_ResetMember.setEnabled(value);
//        Btn_DeleteMember.setEnabled(value);
//        Btn_Back.setEnabled(value);
       
    }
      public void setEditDeleteBtn(boolean value){
        Btn_UpdateMember.setEnabled(value);
        Btn_DeleteMember.setEnabled(value);
    }
    
    public void setRadioJenisKelamin(boolean value){
        Rb_Laki.setEnabled(value);
        Rb_Perempuan.setEnabled(value);
    }
    
    public void clearText(){
        InputIDMember.setText("");
        InputNamaMember.setText("");
        buttonGroup1.clearSelection();
        InputNoHanphone.setText("");
        InputAlamat.setText("");
        InputSearch.setText("");
    }
    
    public void showMember(){
        Tbl_Member.setModel(C.showDataMember(""));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        InputIDMember = new javax.swing.JTextField();
        InputNamaMember = new javax.swing.JTextField();
        Rb_Laki = new javax.swing.JRadioButton();
        Rb_Perempuan = new javax.swing.JRadioButton();
        InputNoHanphone = new javax.swing.JTextField();
        InputAlamat = new javax.swing.JTextField();
        Btn_AddMember = new javax.swing.JButton();
        Btn_ResetMember = new javax.swing.JButton();
        Btn_UpdateMember = new javax.swing.JButton();
        Btn_DeleteMember = new javax.swing.JButton();
        Btn_Back = new javax.swing.JButton();
        InputSearch = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tbl_Member = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Btn_Search = new javax.swing.JButton();
        Btn_SaveMember = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 237, 240));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setText("ID Member");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel5.setText("Nomor Handphone");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel6.setText("Alamat");

        InputIDMember.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        InputNamaMember.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        Rb_Laki.setBackground(new java.awt.Color(221, 237, 240));
        buttonGroup1.add(Rb_Laki);
        Rb_Laki.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Rb_Laki.setText("Laki-laki");
        Rb_Laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_LakiActionPerformed(evt);
            }
        });

        Rb_Perempuan.setBackground(new java.awt.Color(221, 237, 240));
        buttonGroup1.add(Rb_Perempuan);
        Rb_Perempuan.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        Rb_Perempuan.setText("Perempuan");
        Rb_Perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_PerempuanActionPerformed(evt);
            }
        });

        InputNoHanphone.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        InputAlamat.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        Btn_AddMember.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_AddMember.setText("Add");
        Btn_AddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AddMemberActionPerformed(evt);
            }
        });

        Btn_ResetMember.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_ResetMember.setText("Reset");
        Btn_ResetMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ResetMemberActionPerformed(evt);
            }
        });

        Btn_UpdateMember.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_UpdateMember.setText("Update");
        Btn_UpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UpdateMemberActionPerformed(evt);
            }
        });

        Btn_DeleteMember.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_DeleteMember.setText("Delete");
        Btn_DeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DeleteMemberActionPerformed(evt);
            }
        });

        Btn_Back.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_Back.setText("Back");
        Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BackActionPerformed(evt);
            }
        });

        InputSearch.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        Tbl_Member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Member", "Nama", "Jenis Kelamin", "No.Handphone", "Alamat"
            }
        ));
        Tbl_Member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_MemberMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tbl_Member);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/member-icon-1.png"))); // NOI18N
        jLabel1.setText("Data Member");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        Btn_Search.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_Search.setText("Search");
        Btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SearchActionPerformed(evt);
            }
        });

        Btn_SaveMember.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Btn_SaveMember.setText("Save");
        Btn_SaveMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SaveMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addGap(92, 92, 92))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(149, 149, 149))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(62, 62, 62))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(136, 136, 136)))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_AddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_ResetMember, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addGap(161, 161, 161)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_SaveMember, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addGap(576, 576, 576)
                        .addComponent(Btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn_UpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_DeleteMember, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InputIDMember)
                                    .addComponent(InputNamaMember))
                                .addGap(2, 2, 2))
                            .addComponent(InputAlamat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputNoHanphone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Rb_Laki, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addGap(36, 36, 36)
                                .addComponent(Rb_Perempuan, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn_Search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InputSearch))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(InputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                            .addComponent(InputNamaMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rb_Laki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Rb_Perempuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                            .addComponent(InputNoHanphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InputAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_AddMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_UpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_DeleteMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_SaveMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_ResetMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BackActionPerformed
        // TODO add your handling code here:
        HomeView H = new HomeView();
        this.dispose();
        H.setVisible(true);
    }//GEN-LAST:event_Btn_BackActionPerformed

    private void Btn_DeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DeleteMemberActionPerformed
        // TODO add your handling code here:
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data?","Konfirmasi", JOptionPane.YES_NO_OPTION);
        String idmb= InputIDMember.getText();
        switch(getAnswer){
            case 0:
            try{
                C.deleteMember(idmb);
                clearText();
                
                setComponents(false);
                setEditDeleteBtn(false);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            }catch (Exception e){
                System.out.println("Error : " + e.getMessage());
            }
            break;

            case 1:
                JOptionPane.showMessageDialog(null, "Data tidak jadi dihapus!");
            break;
        }
        showMember();
    }//GEN-LAST:event_Btn_DeleteMemberActionPerformed

    private void Btn_AddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AddMemberActionPerformed
        // TODO add your handling code here:
        
        setComponents(true);
        setRadioJenisKelamin(true);
        buttonGroup1.clearSelection();
        clearText();
        InputSearch.setText("");
        action = "Tambah";
        
    }//GEN-LAST:event_Btn_AddMemberActionPerformed

    private void Rb_LakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_LakiActionPerformed
        // TODO add your handling code here:
//        jenis_kelamin = "Laki-laki";
        
    }//GEN-LAST:event_Rb_LakiActionPerformed

    private void Rb_PerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_PerempuanActionPerformed
        // TODO add your handling code here:
//        jenis_kelamin = "Perempuan";
    }//GEN-LAST:event_Rb_PerempuanActionPerformed

    private void Btn_ResetMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResetMemberActionPerformed
        // TODO add your handling code here:
//        setComponents(false);
        clearText();
//        setEditDeleteBtn(false);
    }//GEN-LAST:event_Btn_ResetMemberActionPerformed

    private void Btn_SaveMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SaveMemberActionPerformed
        // TODO add your handling code here:
        try{

            String jenisKelamin = "";

            if(Rb_Laki.isSelected()==true){
                jenisKelamin = "Laki-laki";
            } else if(Rb_Perempuan.isSelected()==true){
                jenisKelamin = "Perempuan";
            }
//            Member m =new Member();
            Member m = new Member(InputIDMember.getText(), InputNamaMember.getText(),jenisKelamin, InputNoHanphone.getText(), InputAlamat.getText() );
            C.setMember(InputIDMember.getText(), InputNamaMember.getText(), jenisKelamin, InputNoHanphone.getText(), InputAlamat.getText());

            if(action.equals("Tambah")){
                C.insertMember(m);
                JOptionPane.showMessageDialog(null, "Data berhasil ditambah!");
            } else {
               C.updateMember(m);
                JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
            }
  
            clearText();
           
            setComponents(false);
            setRadioJenisKelamin(false);
            buttonGroup1.clearSelection();
            setEditDeleteBtn(false);
            
            showMember();
     }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Harap isi data dengan benar!");
        }
    }//GEN-LAST:event_Btn_SaveMemberActionPerformed

    private void Btn_UpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UpdateMemberActionPerformed
        // TODO add your handling code here:
        setComponents(true);
        setRadioJenisKelamin(true);
        action = "Update";
        showMember();
        
    }//GEN-LAST:event_Btn_UpdateMemberActionPerformed

    private void Tbl_MemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_MemberMouseClicked
        // TODO add your handling code here:
        int indexMember= -1;
        setEditDeleteBtn(true); //u can edit n delete when click particular row
        setComponents(false);
        setRadioJenisKelamin(false);
        
        buttonGroup1.clearSelection();
        
        int clickedRow = Tbl_Member.getSelectedRow();
        TableModel tableModel = Tbl_Member.getModel();
        
        InputIDMember.setText(tableModel.getValueAt(clickedRow,0).toString());
        InputNamaMember.setText(tableModel.getValueAt(clickedRow, 1).toString());
        InputNoHanphone.setText(tableModel.getValueAt(clickedRow, 3).toString());
        InputAlamat.setText(tableModel.getValueAt(clickedRow, 4).toString());
        
        String selectedJenisKelamin = tableModel.getValueAt(clickedRow, 2).toString();
        switch(selectedJenisKelamin){
            case "Laki-laki":
                Rb_Laki.setSelected(true);
                break;
            case "Perempuan":
                Rb_Perempuan.setSelected(true);
                break;
        }
    }//GEN-LAST:event_Tbl_MemberMouseClicked

    private void Btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SearchActionPerformed
        // TODO add your handling code here:
        setEditDeleteBtn(false);
        setComponents(false);
        
        try{
            TableMember member = C.showDataMember(InputSearch.getText());
            if(member.getRowCount()== 0){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showMessageDialog(null, "Data member tidak ditemukan");
            } else {
                Tbl_Member.setModel(member);
            }
        }catch(Exception e){
            System.out.println("error : " + e.getMessage());
        }
    }//GEN-LAST:event_Btn_SearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberView().setVisible(true);
            }
        });
    }
//    int Row = 0;
//    static Object Column[] = {"id_member", "nama_member", "jenis_kelamin", "no_hp",  "alamat"};
//    DefaultTableModel tbl = new DefaultTableModel(Column,Row);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_AddMember;
    private javax.swing.JButton Btn_Back;
    private javax.swing.JButton Btn_DeleteMember;
    private javax.swing.JButton Btn_ResetMember;
    private javax.swing.JButton Btn_SaveMember;
    private javax.swing.JButton Btn_Search;
    private javax.swing.JButton Btn_UpdateMember;
    private javax.swing.JTextField InputAlamat;
    private javax.swing.JTextField InputIDMember;
    private javax.swing.JTextField InputNamaMember;
    private javax.swing.JTextField InputNoHanphone;
    private javax.swing.JTextField InputSearch;
    private javax.swing.JRadioButton Rb_Laki;
    private javax.swing.JRadioButton Rb_Perempuan;
    private javax.swing.JTable Tbl_Member;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
