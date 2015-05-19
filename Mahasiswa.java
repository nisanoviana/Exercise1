import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by nicun on 5/19/2015.
 */
public class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String n, int a){
        nama = n;
        umur = a;
    }

    public void CetakBiodata(){
        System.out.println("=== BIODATA ===");
        System.out.println("Nama Mahasiswa = " +nama);
        System.out.println("Umur Mahasiswa = " +umur);
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String n){
        this.nama = n;
    }

    public int getUmur(){
        return umur;
    }

    public void setUmur(int a){
        this.umur = a;
    }
}