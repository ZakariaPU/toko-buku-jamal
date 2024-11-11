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
public class Member {
    private String id_member, nama_member, jenis_kelamin, no_hp, alamat;
    private int counter;
     
   

    public Member() {
    }

    public Member(String id_member, String nama_member, String jenis_kelamin, String no_hp, String alamat) {
        this.id_member = id_member;
        this.nama_member = nama_member;
        this.jenis_kelamin = jenis_kelamin;
        this.no_hp = no_hp;
        this.alamat = alamat;
        
    }
    public int getCounter() {
        return counter;
    }
    /**
     * @return the id_member
     */
    public String getId_member() {
        return id_member;
    }

    /**
     * @param id_member the id_member to set
     */
    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    /**
     * @return the nama_member
     */
    public String getNama_member() {
        return nama_member;
    }

    /**
     * @param nama_member the nama_member to set
     */
    public void setNama_member(String nama_member) {
        this.nama_member = nama_member;
    }

    /**
     * @return the jenis_kelamin
     */
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    /**
     * @return the no_hp
     */
    public String getNo_hp() {
        return no_hp;
    }

    /**
     * @param no_hp the no_hp to set
     */
    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
  
    
//    public String showMember(){
//    
//         return "ID Member      : "+getId_member() + "\n" +
//                "Nama           : "+getNama_member() + "\n" +
//                "Jenis Kelamin  : "+getJenis_kelamin() + "\n" +
//                "No HP          : "+getNo_hp() + "\n" +
//                "Alamat         : "+getAlamat();
//    }
    
    public void showMember(){
        System.out.println("Member ke      : "+counter);
        System.out.println("ID Member      : "+getId_member());
        System.out.println("Nama           : "+getNama_member());
        System.out.println("Jenis Kelamin  : "+getJenis_kelamin());
        System.out.println("No HP          : "+getNo_hp());
        System.out.println("Alamat         : "+getAlamat());
        
//        System.out.println(">List Member :");
//        for(int i=0; i<counter; i++){
//            getMember()[i].showMember();
//        }
    }
//    
//    public void addMember(Member member){
//        
//        getMember()[counter]= member;
//        counter++;
//    }
    
    
}
