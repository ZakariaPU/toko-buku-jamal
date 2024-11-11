/*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package DAO;

import Model.Admin;
import Model.Buku;
import Model.KategoriBuku;
import Model.Keranjang;
import Model.Member;
import Model.Transaksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

///**
// *
// * @author bangz
// */
public class Dao {
    public static Connection con;
    public String URL  = "jdbc:ucanaccess://";
    String currentDir = System.getProperty("user.dir");   
//    public String PATH = currentDir + "/src/TokoBukuJamal.mdb";C:\Users\ASUS\OneDrive - Universitas Atma Jaya Yogyakarta\PBO project\DatabaseTokoBukuJamal\TokoBukuJamal.mdb
//    public static final String PATH = "C://Users//ASUS//OneDrive - Universitas Atma Jaya Yogyakarta//PBO project//DatabaseTokoBukuJamal//TokoBukuJamal.mdb";
  //  public static final String PATH = "//C:\\Users\\ASUS\\OneDrive - Universitas Atma Jaya Yogyakarta\\PBO project\\DatabaseTokoBukuJamal\\TokoBukuJamal.mdb";
   public String PATH = currentDir + "/src/TokoBukuJamal.mdb";
  //  public static final String PATH = "C://Users//bangz//Downloads//Bismillah2-20221207T040351Z-001//Bismillah2//TokoBukuJamal_2//src";

    public Connection makeConnection()
    {
        System.out.println("Opening Database...");
        try{
            con = DriverManager.getConnection(URL+PATH);
            System.out.println("Success (Opening Database)!");
            System.out.println(URL+PATH);
            System.out.println(currentDir);
        }catch(Exception e)
        {
            System.out.println("Error Opening Database...");
            System.out.println(e);
        }
        return  con;    
    }    
    
    public void closeConnection()
    {
        System.out.println("Closing Database...");
        try{
            con.close();
            System.out.println("Success (Closing Database)!!");
        }catch(Exception e)
        {
            System.out.println("Error Closing Database...");
            System.out.println(e);
        }
    }   
    
    //CRUDS Admin/Login
    public Admin searchAdmin(String username, String password)
    {     
        String sql = "SELECT * FROM Admin where Username = '"+ username +"' AND Password = '"+ password +"'";
        
        System.out.println("Searching Akun Admin");
        
        Admin as = null;

        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("Sukses Akses Database");
            if(rs != null)
            {   
                
                while(rs.next())
                {              
                   as = new Admin(
                            rs.getString("Username"),
                            rs.getString("Password"));     
                }
            }
            rs.close();
            statement.close();
                   }catch(Exception e)
        {
            System.out.println("Error searching Admin");
            System.out.println(e);
        }
        return as;
    }
    
    //CRUDS Member
     public void insertMember(Member m)
    {

        String sql = "INSERT INTO Member(id_member, nama_member, jenis_kelamin, no_hp, alamat) "
                + "VALUES ('" + m.getId_member() + "','" + m.getNama_member()+"','" + m.getJenis_kelamin()+"','"+m.getNo_hp()+"','"+m.getAlamat()+"')";
        System.out.println("Adding Member");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Adding " + result + " Member\n");
        }catch(Exception e)
        {
            System.out.println("Error Adding Member");
            System.out.println(e);
        }
    }
     
//      public void showMember()
//    {
//        String sql = "SELECT * FROM Member";
//        System.out.println("Mengambil data Member\n");
//        //List<Departemen> list = new ArrayList();
//        try{
//           Statement statement = con.createStatement();
//           ResultSet rs = statement.executeQuery(sql);
//           
//           if(rs != null)
//           {
//               while(rs.next())
//               {
//                   Member m = new Member(rs.getString("id_member"),rs.getString("nama_member"), rs.getString("no_hp"),rs.getString("jenis_kelamin"), rs.getString("alamat"));
//                   
//               }
//           }
//           rs.close();
//           statement.close();
//        }catch(Exception e)
//        {
//            System.out.println("Error reading data Member\n");
//        }
//       // return list;
//    }
      
      public List<Member> showMember(){
       
        String sql = "SELECT (id_member, nama_member, jenis_kelamin, no_hp, alamat) FROM Member";
        System.out.println("Mengambil data ...");
        
        List<Member> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()) {                    
                        Member m = new Member(
                              rs.getString("id_member"), 
                              rs.getString("nama_member"),  
                              rs.getString("jenis_kelamin"),
                              rs.getString("no_hp"), 
                              rs.getString("alamat"));
                    list.add(m);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading data member ...");
            System.out.println(e);
        }
        return list;
    }
        
      public void updateMember(Member m)
   {

       String sql = "UPDATE Member SET nama_member = '"+m.getNama_member() +"',no_hp = '"+m.getNo_hp()
               +"' WHERE id_member  = '" +m.getId_member()+ "'";
       System.out.println("Updating Member");
       try{
           Statement statement = con.createStatement();
           int result = statement.executeUpdate(sql);
           System.out.println("Edited " + result + "Member\n");
       }catch(Exception e)
       {
           System.out.println("Error editing Member");
           System.out.println(e);
       }
   }
      //Delete
   public void deleteMember(String id_mem)
   {

       String sql = "DELETE FROM Member WHERE id_member ='" + id_mem + "'";
       System.out.println("Deleting Member");
       
       try{
           Statement statement = con.createStatement();
           int result = statement.executeUpdate(sql);
           System.out.println("Success Deleting "+result+"Member\n");
       }catch(Exception e)
       {
           System.out.println("Error Deleting Member");
           System.out.println("Success Deleting Member");
       }
   }
   
    //Search
//   public Member searchMember(String id_mem)
//   {
//        String sql = "SELECT * FROM Member WHERE id_member ='" + id_mem + "' OR nama_member = '" + id_mem + "'";
//        System.out.println("Searching Member");
//         
//        Member m = null;
//        try{
//            Statement statement = con.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//            System.out.println("Searching "+id_mem+"\n");
//            if(rs != null)
//            {
//                while(rs.next())
//                {
//                    m = new Member(
//                            rs.getString("id_member"),
//                            rs.getString("nama_member"),
//                            rs.getString("no_hp"),
//                            rs.getString("jenis_kelamin"),
//                            rs.getString("alamat")
//                    );
//                }
//            }
//            rs.close();
//            statement.close();
//        }catch(Exception e)
//        {
//            System.out.println("Error searching data Member");
//            System.out.println(m);
//        }  
//        return m;
//    }
   
    public List<Member> searchMember(String q){
        
        String sql = "SELECT * FROM Member WHERE ("
                + "id_member LIKE '%"+q+"%'"
                + "OR nama_member LIKE '%"+q+"%'"
                + "OR no_hp LIKE '%"+q+"%'"
                + "OR jenis_kelamin LIKE '%"+q+"%'"
                + "OR alamat LIKE '%"+q+"%')";
        
        System.out.println("Searching Member...");
        
        List<Member> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    Member m = new Member(
                           rs.getString("id_member"),
                           rs.getString("nama_member"),
                           rs.getString("jenis_kelamin"),
                              rs.getString("no_hp"),
                           rs.getString("alamat")
                    );
                    list.add(m);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error Searching Member...");
            System.out.println(e);
        }
        return list;
    }
    
    //CRUDS Buku
//    public void insertBuku(Buku b)
//    {
//        String sql = "INSERT INTO Buku (id_buku, judul_buku, id_kategori)"
//                + "VALUES ('"+b.getId_buku()+"','"+b.getJudul_buku()+"','"+b.getPenerbit_buku()+"','"+b.getPengarang_buku()+"','"+b.getKategori_buku()+"','"+b.getTahun_terbit()+"','"+b.getHarga_buku()++"')";
//        System.out.println("Adding Buku");
//        try{
//            Statement statement = con.createStatement();
//            int result = statement.executeUpdate(sql);
//            System.out.println("Adding " + result + " Buku\n");            
//        }catch(Exception e)
//        {
//            System.out.println("Error Adding Buku");
//            System.out.println(e);
//        }
//    }
    
        public void insertBuku(Buku b){
            
        String sql = "INSERT INTO Buku b "
                + "VALUES ('"+b.getId_buku() + "','" + b.getJudul_buku() + "','" + b.getPenulis_buku()+  "','" + b.getPenerbit_buku() +  "','" +b.getTahun_terbit() +"','" + b.getStok() + "','" + b.getHarga_buku()+ "','" + b.getKategori_buku().getId_kategori()+ "')";
        
        System.out.println("Adding Buku...");
        
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Buku");System.out.println(b.getId_buku());
            statement.close();        } catch (Exception e){
            System.out.println("Error adding Buku...");
            System.out.println(e);
        }
    }
    
//    public void showBuku()
//    {
//        String sql = "SELECT * FROM Buku";
//        System.out.println("Mengambil data Buku\n");
//        try{
//           Statement statement = con.createStatement();
//           ResultSet rs = statement.executeQuery(sql);
//           
//           if(rs != null)
//           {
//               while(rs.next())
//               {
//                   Buku B = new Buku(rs.getString("id_buku"), rs.getString("judul_buku"), rs.getString("penerbit_buku"), rs.getString("pengarang_buku"),rs.getInt("tahun_terbit"), rs.getString("kategori_buku"), rs.getFloat("hatga_buku"));
//                   KategoriBuku KB = new KategoriBuku(rs.getString("id_buku"), rs.getString("judul_buku");
//                   buku.showBuku();
//               }
//           }
//           rs.close();
//           statement.close();
//        }catch(Exception e)
//        {
//            System.out.println("Error reading data Buku\n");
//            System.out.println(e);
//        }
//    }
    
    public void updateBuku(Buku b)
    {

//       String sql = "UPDATE Buku SET judul_buku = '"+b.getJudul_buku()+
//               "',"+"id_kategori = '"+b.getKategori_buku().getId_kategori()+"'WHERE id_buku = '"+
//               b.getId_buku()+"'";
//        
//        String sql = "UPDATE detail_menu SET nama_menu = '" + m.getNama_menu() + "',"
//                + "deskripsi_menu = '" + m.getDeskripsi_menu() + "',"
//                + "kategori = '" + m.getKategori()+ "',"
//                + "harga_menu = '" + m.getHarga_menu()+ "' "
//                + "WHERE id = "+m.getId()+"";
                
        String sql = "UPDATE Buku SET judul_buku = '" + b.getJudul_buku()+ 
               "',penulis_buku = '" + b.getPenulis_buku() + "',"
                + "penerbit_buku = '" + b.getPenerbit_buku()+ "',"
                + "tahun_terbit = '" + b.getTahun_terbit()+ "',"
                + "stok = '" + b.getStok()+ "',"
                + "harga_buku = '"+ b.getHarga_buku()+ "',"
                + "id_kategori = '" + b.getKategori_buku().getId_kategori()+ "'WHERE id_buku = '"+b.getId_buku()+"'";
       System.out.println("Updating Buku");
       try{
           Statement statement = con.createStatement();
           int result = statement.executeUpdate(sql);
           System.out.println("Edited " + result + "Buku\n");
       }catch(Exception e)
       {
           System.out.println("Error editing Buku");
           System.out.println(e);
       }
    }
    
    public void deleteBuku(String IdBuk)
    {

       String sql = "DELETE FROM Buku WHERE id_buku='"+IdBuk+"'";
        System.out.println("Deleting Buku");
       try{
           Statement statement = con.createStatement();
           int result = statement.executeUpdate(sql);
           System.out.println("Success Delete"+result+"Buku\n");
           statement.close();

       }catch(Exception e)
       {
           System.out.println("Error Deleting Buku");
           System.out.println(e);
       }
    }
    
//       public Buku searchBuku(String Id)
//   {
//        String sql="SELECT * FROM Buku WHERE kodeBuku ='"+Id+"'"; 
//        System.out.println("Searching Buku");
//        
//        Buku B = new Buku();
//        try{
//            Statement statement = con.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//            System.out.println("Searching "+Id+"\n");
//            if(rs != null)
//            {
//                while(rs.next())
//                {
//                    KategoriBuku K = new KategoriBuku(rs.getString("id_kategori"), rs.getString("kategori"))Integer.parseInt(rs.getString("tahun_terbit"));
//                    B = new Buku(rs.getString("id_buku"), rs.getString("judul_buku"), rs.getString("penerbit_buku"), rs.getString("pengarang_buku"),rs.getInt("tahun_terbit"), rs.getString("kategori_buku"), rs.getFloat("hatga_buku"),K);
//                    B.showBuku();
//                }
//            }
//            rs.close();
//            statement.close();
//        }catch(Exception e)
//        {
//            System.out.println("Error searching data  Buku");
//            System.out.println(e);
//        }  
//        return B;
//    }
    
    public List<Buku> searchBuku(String query){
       
//         String sql = "SELECT * FROM Buku b INNER JOIN KategoriBuku kb ON b.id_kategori = kb.id_kategori";
        String sql = "SELECT * FROM Buku b INNER JOIN KategoriBuku kb ON b.id_kategori = kb.id_kategori WHERE("
                + "b.id_buku LIKE '%"+query+"%'"
                + "OR b.judul_buku LIKE '%"+query+"%'"
                + "OR b.penulis_buku LIKE '%"+query+"%'"
                + "OR b.penerbit_buku LIKE '%"+query+"%'"
                + "OR b.tahun_terbit LIKE '%"+query+"%'"
                + "OR b.stok LIKE '%"+query+"%'"
                + "OR b.harga_buku LIKE '%"+query+"%'"
                + "OR kb.kategori LIKE '%"+query+"%')";
        
        System.out.println("Searching Menu...");
        
        List<Buku> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    KategoriBuku kb = new KategoriBuku(
                            rs.getString("id_kategori"),
                            rs.getString("kategori")
                    );
                    Buku b = new Buku(
                            rs.getString("id_buku"),
                            rs.getString("judul_buku"),
                            rs.getString("penulis_buku"),
                            rs.getString("penerbit_buku"),
                            Integer.parseInt(rs.getString("tahun_terbit")),
                            Integer.parseInt(rs.getString("stok")),
                            Integer.parseInt(rs.getString("harga_buku")), 
                            kb
                    );
                    list.add(b);
                      System.out.println(b.getKategori_buku().getKategori());
                }
            }
          
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error Searching Buku...");
            System.out.println(e);
        }
       
        return list;
    }
       
//    public void searchBukuByKategoriBuku(String Id)
//    {
//   
//        String sql = "SELECT Buku.id_bukuBuku, buku.id_buku, Buku.id_ketegori AS Buku_id_kategori, KategoriBuku.id_kategori AS KategoriBuku+id_kategori\n"+
//                "FROM KategoriBuku INNER JOIN Buku ON KategoriBuku.[id_kateogori] = Buku.[id_kategori] ='"+Id+"'";
//        System.out.println("Searching Buku By KategoriBuku");
//        
//        Buku B = new Buku();
//        KategoriBuku K = new KategoriBuku ;
//
//        try{
//            Statement statement = Con.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//            if(rs !=null)
//            {
//                while(rs.next())
//                {
//                    K = new KategoriBuku(rs.getString("id_kategori"),rs.getString("kategori"),Integer.parseInt(rs.getString("tahun_terbit")));
//                    B = new Buku (rs.getString("kodeBuku"), rs.getString("namBuku"), D);
//                    B.showBuku();
//                }
//            }
//        rs.close();
//        statement.close();
//        }catch(Exception e)
//        {
//            System.out.println("Error searching data Buku By KategoriBuku   ");
//            System.out.println(e);
//        }  
//    }
    
    
    //CRUDS Kategori Buku
     public void addKategori(KategoriBuku KB){
        String sql = "INSERT into KategoriBuku(id_kategori, kategori) VALUES"
                +"('" + KB.getId_kategori()+"','"+ KB.getKategori()+"')";
        System.out.println("Adding Kategori Buku");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Adding " + result + " Kategori Buku\n");            
        }catch(Exception e)
        {
            System.out.println("Error Adding Kategori Buku");
            System.out.println(e);
        }       
    }
     
    public List<Buku> showBuku()
    {
        String sql = "SELECT [KategoriBuku].id_kategori AS [KategoriBuku_id_kategori], [KategoriBuku].kategori, Buku.id_buku, Buku.judul_buku, Buku.penerbit_buku, Buku.pengarang_buku, Buku.tahun_terbit, Buku.kategori_buku, Buku.harga_buku, Buku.id_kategori AS Buku_id_kategori\n" +
                "FROM [KategoriBuku] INNER JOIN Buku ON [KategoriBuku].[id_kategori] = Buku.[id_kategori]";
        //ganti sql

        System.out.println("Mengambil data Kategori Buku\n");
        List<Buku> list = new ArrayList();
        try{
           Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery(sql);
           
           if(rs != null)
           {
               while(rs.next())
               {
                   KategoriBuku kb = new KategoriBuku(
                            rs.getString("id_kategori"),
                            rs.getString("kategori")
                    );
                   
                   Buku B = new Buku(
                           rs.getString("id_buku"), 
                           rs.getString("judul_buku"), 
                           rs.getString("penulis_buku"),
                           rs.getString("penerbit_buku"),
                          
                           Integer.parseInt(rs.getString("tahun_terbit")), 
                            // rs.getString("kategori_buku")atau dihilangkan saja ?>> di data base panggil id_kategori saja
                           Integer.parseInt(rs.getString("stok")), 
                           Integer.parseInt(rs.getString("harga_buku")),
                           kb
                           );
                   
               }
           }
           rs.close();
           statement.close();
        }catch(Exception e)
        {
            System.out.println("Error reading data Kategori Buku\n");
        }
        return list;
    }
    
    //show kategori: pake list sama
     public List<KategoriBuku> showKategoriBuku()
    {
        String sql = "SELECT * FROM KategoriBuku";

        System.out.println("Mengambil data Buku\n");
        List<KategoriBuku> list = new ArrayList();
        
        try{
           Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery(sql);
           
           if(rs != null)
           {
               while(rs.next())
               {
                   KategoriBuku KB = new KategoriBuku(
                            rs.getString("id_kategori"),
                            rs.getString("kategori")
                    );
                   
               }
           }
           rs.close();
           statement.close();
        }catch(Exception e)
        {
            System.out.println("Error reading data Kategori Buku\n");
        }
        return list;
    }
    
    public List<KategoriBuku> showKategoriBukuComboBox() {
        
        String sql = "SELECT * FROM KategoriBuku";
            
        System.out.println("Mengambil data Kategori Buku...");
        List<KategoriBuku> list = new ArrayList();
        KategoriBuku KB = null;

        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs != null) {
                while (rs.next()) {
                    KB = new KategoriBuku(
                            rs.getString("id_kategori"),
                            rs.getString("kategori")
                    );
                    KB.getId_kategori();
                    System.out.println(KB.getId_kategori());
                    list.add(KB);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        return list;
    }   
     public List<Buku> showbukucombo() {
        
        String sql = "SELECT * FROM Buku b INNER JOIN KategoriBuku kb ON b.id_kategori = kb.id_kategori";
            
        System.out.println("Mengambil data Buku...");
        List<Buku> list = new ArrayList();
//        KategoriBuku KB = null;
// Buku B = null;
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs != null) {
                while (rs.next()) {
                     KategoriBuku kb = new KategoriBuku(
                            rs.getString("id_kategori"),
                            rs.getString("kategori")
                    );
                   
                   Buku B = new Buku(
                           rs.getString("id_buku"), 
                           rs.getString("judul_buku"), 
                           rs.getString("penulis_buku"),
                           rs.getString("penerbit_buku"),
                          
                           Integer.parseInt(rs.getString("tahun_terbit")), 
                            // rs.getString("kategori_buku")atau dihilangkan saja ?>> di data base panggil id_kategori saja
                           Integer.parseInt(rs.getString("stok")), 
                           Integer.parseInt(rs.getString("harga_buku")),
                           kb
                           );
                    System.out.println( B.getHarga_buku()); 
                    list.add(B);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        return list;
    }   
    
//    public KategoriBuku searchKategori(String kode)
//   {
//        String sql = "SELECT KategoriBuku.id_kategori, KategoriBuku.kategori,"
//                  + " Buku.kategori_buku FROM Buku INNER JOIN "
//                  + " KategoriBuku ON Buku.[id_kategori] = Buku.[id_kategori]"
//                  + " WHERE kategori = '"+ kode +"'" ;
//        System.out.println("Searching Kategori Buku");
//        Buku B = null;
//        KategoriBuku KB = null;
//        try{
//            Statement statement = con.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//            System.out.println("Searching "+kode+"\n");
//            if(rs != null)
//            {
//                while(rs.next())
//                {
//                    KB = new KategoriBuku(
//                            rs.getString("id_kategori"),
//                            rs.getString("kategori")
//                    );
//                     
//                    B = new Buku(
//                            rs.getString("id_buku"), 
//                            rs.getString("judul_buku"), 
//                            rs.getString("penerbit_buku"), 
//                            rs.getString("penulis_buku"), 
//                            KB,
//                            Integer.parseInt(rs.getString("tahun_terbit")), 
////                            rs.getString("kategori_buku"), >> perlu atau tidak? atau langsung panggil obejk kb saja?
//                            Integer.parseInt(rs.getString("stok")), 
//                            Integer.parseInt(rs.getString("harga_buku"))
////                            rs.getString("id_kategori") >> perlu atau 
//                           );
//                }
//            }
//            rs.close();
//            statement.close();
//        }catch(Exception e)
//        {
//            System.out.println("Error searching data ");
//            System.out.println(KB);
//        }  
//        return KB;
//    }
    
     public List<KategoriBuku> searchKategoriBuku(String q){
 
        // sql
        String sql = "SELECT * FROM KategoriBuku WHERE ("
                + "id_kategori LIKE '%"+q+"%'"
                + "OR kategori LIKE '%"+q+"%')";
        
        System.out.println("Searching Kategori Buku...");
        
        List<KategoriBuku> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    KategoriBuku KB = new KategoriBuku(
                            rs.getString("id_kategori"),
                            rs.getString("kategori")
                    );
                    
                    list.add(KB);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error Searching Kategori Buku...");
            System.out.println(e);
        }
        return list;
    }
     
     //keranjang
      public List<Keranjang> AddKeranjang(String q){
 
        // sql
//        String sql = "SELECT * FROM KategoriBuku WHERE ("
//                + "id_kategori LIKE '%"+q+"%'"
//                + "OR kategori LIKE '%"+q+"%')";
        
//        System.out.println("Searching Kategori Buku...");
        
        List<Keranjang> list = new ArrayList<>();
        
//        try{
//            Statement statement = con.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//            
//            if(rs != null){
//                while(rs.next()){
//                    KategoriBuku KB = new KategoriBuku(
//                            rs.getString("id_kategori"),
//                            rs.getString("kategori")
//                    );
//                    
//                    list.add(KB);
//                }
//            }
//            rs.close();
//            statement.close();
//        }catch(Exception e){
//            System.out.println("Error Searching Kategori Buku...");
//            System.out.println(e);
//        }
        return list;
    }
    
    
    //CRUDS Transaksi
    
    public void insertTransaksi(Transaksi T){
        
        
        String sql = " INSERT INTO Transaksi(id_pesanan,id_menu,jumlah_pesanan,harga_total) "
                + "VALUES (" + T.getKode_transaksi()+","+ T.getTanggal_transaksi()+","+T.getTotal_harga()+","+T.getTotal_buku()+","+T.getTotal_bayar()+","+T.getDiskon()+",";
        
        System.out.println("Adding Detail Pesanan...");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result +" detail pesanan");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding ...");
            System.out.println(e);
        }
        
    }
    
    public void insertDetailTransaksi(String id_transaksi, String id_buku){
        
        
        String sql = " INSERT INTO DetailTransaksi(id_transaksi, id_buku) "
                + "VALUES ("+id_transaksi+", "+id_buku+")";
        
        System.out.println("Adding Detail Pesanan...");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result +" detail pesanan");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding ...");
            System.out.println(e);
        }
        
    }
    
    public void clearKeranjang(){
        String sql = " TRUNCATE Keranjang";
        
        System.out.println("Adding Detail Pesanan...");
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result +" detail pesanan");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding ...");
            System.out.println(e);
        }
        
        
    }
    
    public List<Transaksi> showTransaksi()
    {
        String sql = "SELECT Transaksi.[id_transaksi], Transaksi.[total_harga], Transaksi.[tanggal_transaksi], Transaksi.[total_buku], Transaksi.[diskon], Transaksi.[id_buku], Transaksi.[id_member], Transaksi.[Username]\n" +
                    "FROM Transaksi;";
        

        System.out.println("Mengambil data Transaksi\n");
        List<Transaksi> Trans = new ArrayList();
        try{
           Statement statement = con.createStatement();
           ResultSet rs = statement.executeQuery(sql);
           
           if(rs != null)
           {
               while(rs.next())
               {
                   Transaksi T = new Transaksi(
                            rs.getString("id_transaksi"),
                            rs.getDouble("total_harga"),
                            rs.getDouble("total_bayar"),
                            rs.getString("tanggal_transaksi"),
                            rs.getInt("total_buku"),
                           rs.getDouble("diskon")
                    );
                 
//                   Buku B = new Buku(
//                           rs.getString("id_buku"), 
//                           rs.getString("judul_buku"), 
//                           rs.getString("penerbit_buku"),
//                           rs.getString("penulis_buku"),
//                           KB,
//                           Integer.parseInt(rs.getString("tahun_terbit")), 
//                            // rs.getString("kategori_buku")atau dihilangkan saja ?>> di data base panggil id_kategori saja
//                           Integer.parseInt(rs.getString("stok")), 
//                           Integer.parseInt(rs.getString("harga_buku"))
//                           );
                   
               }
           }
           rs.close();
           statement.close();
        }catch(Exception e)
        {
            System.out.println("Error reading data Kategori Buku\n");
        }
        return Trans;
    } 
    
    public void ShowNota()
    {
//        String sql = "SELECT * FROM Nota";
//        System.out.println("Mengambil data Nota\n");
//        //List<Departemen> list = new ArrayList();
//        try{
//           Statement statement = con.createStatement();
//           ResultSet rs = statement.executeQuery(sql);
//           
//           if(rs != null)
//           {
//               while(rs.next())
//               {
//                   Member m = new Member(rs.getString("id_member"),rs.getString("nama_member"), rs.getString("no_hp"),rs.getString("jenis_kelamin"), rs.getString("alamat"));
//                   
//               }
//           }
//           rs.close();
//           statement.close();
//        }catch(Exception e)
//        {
//            System.out.println("Error reading data Member\n");
//        }
//       // return list;
    }
}
