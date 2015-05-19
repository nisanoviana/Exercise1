/**
 * Created by nicun on 5/19/2015.
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Annisa Noviana",18);
        mhs.CetakBiodata();

        System.out.println();

        mhs.setUmur(19);
        mhs.CetakBiodata();
    }
}
