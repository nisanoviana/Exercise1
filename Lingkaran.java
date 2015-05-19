/**
 * Created by nicun on 5/19/2015.
 */
public class Lingkaran {

    int jari;
    int diameter;

    public void PrinttoScreen()
    {
        System.out.println("Jari-Jari: " + jari);
        System.out.println("diameter: " + diameter);

    }

    public void ChangeProperty(int jj, int db)
    {
        jari = jj;
        diameter = db;

    }

    public double hitungLuas()
    {
        double luas;
        luas = 22/7 * jari * jari;
        return luas;
    }

    public double hitungKeliling()
    {
        double keliling;
        keliling = 22/7 * diameter;
        return keliling;
    }
}
