///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Model;
//import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import Model.Admin;
//import Model.Buku;
//import Model.KategoriBuku;
//import Model.Member;
//import Model.Transaksi;
//
//
///**
// *
// * @author bangz
// */
//public class Main {
//
//    /**
//     * @param args the command line arguments
//     */
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////    Scanner Scan = new Scanner(System.in);
//    
//    public static void main(String[] args) throws IOException {
//       int pilMenu;
//       String IDMember,namaMember, jenisKelamin, noHP, alamat;
//       
//       //Kategori
//        String id_kategori, namakategori;
//       
//       //Controller
//       Admin admin = new Admin();
//       KategoriBuku kategori = new KategoriBuku();
//       Buku buku = new Buku();
//       Member mem = new Member();
//       
////       login();
//            do{  
//            System.out.println("=======================================");
//            System.out.println("========= TOKO BUKU JAMAL ==========");
//            System.out.println("====================================");
//            System.out.println("=== 1. INSERT Data Member       ========");
//            System.out.println("=== 2. UPDATE Data Member       ========");
//            System.out.println("=== 3. DELETE Data Member       ========");
//            System.out.println("=== 4. SHOW Data Member         ========");
//            System.out.println("=== 5. INSERT Data Kategori ========");
//            System.out.println("=== 6. INSERT Data Buku ========");
//            System.out.println("=== 7. UPDATE Data Buku   ========");
//            System.out.println("=== 8. DELETE Data Buku   ========");
//            System.out.println("=== 9. SHOW Data Buku   ========");
//            System.out.println("=== 10. SHOW Data Buku By Kategori ====");
//            System.out.println("=== 0. Exit                    ========");
//            System.out.print("Pilihan Menu : "); pilMenu =  Integer.parseInt(br.readLine());
//            switch(pilMenu)
//            {
//                case 1 :
//                    System.out.println("============ INSERT MEMBER ==================");
//                    System.out.println("Masukan ID Member     : "); IDMember = br.readLine();
//                    System.out.println("Masukan Nama Member   : "); namaMember = br.readLine();
//                    System.out.println("Masukan Jenis Kelamin : "); jenisKelamin = br.readLine();
//                    System.out.println("Masukan No HP         : "); noHP = br.readLine();
//                    System.out.println("Masukan Alamat        :  "); alamat = br.readLine();
//                    mem = new Member(IDMember,namaMember, jenisKelamin, noHP, alamat);
//                    System.out.println("=======================================");
//                    mem.addMember(mem);
//                    break;
////                case 2 :
////                    System.out.println("============ UPDATE MEMBER ===================");
////                    System.out.println("Masukan ID Member Yang ingin diUpdate : "); IDMember = br.readLine();
////                    System.out.println("Data Baru : ");
////                    System.out.println("Masukan Nama Member   : "); namaMember = br.readLine();
////                    System.out.println("Masukan Jenis Kelamin :  "); jenisKelamin = br.readLine();
////                    System.out.println("Masukan No HP         : "); noHP = br.readLine();
////                    System.out.println("Masukan Alamat        :  "); alamat = br.readLine();
////                   
////                    break;
////                case 3 :
////                    System.out.println("============ DELETE MEMBER ==================");
////                    System.out.println("Masukan ID Member yang ingin diDelete : "); IDMember = br.readLine();
////                   
////                    member.showMember();
////                    break;
//                case 4 :
//                    System.out.println("============= SHOW DATA MEMBER==============");
//                    mem.showMember();
//                    System.out.println("=======================================");
//                    break;
////                case 5 :
////                    System.out.println("============ INSERT KARYAWAN ==================");
////                    System.out.println("Masukan kode karyawan : "); kode = br.readLine();
////                    System.out.println("Masukan Nama  : "); namaKaryawan = br.readLine();
////                    System.out.println("Masukan Departemen : "); namaDepartemen = br.readLine();
////                    System.out.println("=======================================");
////                    departemen = control.searchDepartemen(namaDepartemen); 
////                    karyawan = new Karyawan(kode,namaKaryawan , departemen);
////                    control.insertKaryawan(karyawan);
////                    control.showKaryawan();
////                    break;
//                    case 0 :
//                
//                    System.out.println("Program akan keluar"); 
//                    break; 
//                
//                default :
//                    System.out.println("Inputan yang dimasukan salah, silahkan menginputkan ulang"); 
//                    break;
////    
//    }
////    static void login()  throws IOException
////    {
////        String username, password;
////        do{
////            System.out.println("Username : "); username = br.readLine();
////            System.out.println("Password : "); password = br.readLine();
////            if(!username.equalsIgnoreCase("admin") && !password.equalsIgnoreCase("admin"))
////            {
////                System.out.println("Admin tidak ditemukan!!");
////            }
////            else{
////                System.out.println("Login success!");
////            }
////        }while(!username.equalsIgnoreCase("admin") && !password.equalsIgnoreCase("admin"));
////    }
//    
//}while(pilMenu!=0);
//    
//            }
//}
//            
