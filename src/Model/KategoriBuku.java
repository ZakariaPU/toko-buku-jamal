package Model;

public class KategoriBuku{
    private String id_kategori;
    private String kategori;

    public KategoriBuku() {
    }
    
    public KategoriBuku(String id_kategori, String kategori) {
        this.id_kategori = id_kategori;
        this.kategori = kategori;
    }
      @Override
    public String toString(){
        return kategori;
    }
      
    public String getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(String id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
     public String showKategori()
    {
        return  "--------------------------------\n"+
                "ID Kategori   : "+id_kategori+"\n"+
                "Kategori      : "+kategori;
        
    }
    
}
