/**
 * Created by nicun on 5/19/2015.
 */
public class Segitiga {
    int alas;
    int tinggi;
    int sisimiring;

    public void PrintToScreen()
    {
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisimiring: " + sisimiring);

    }

    public  void ChangeProperty(int a, int t, int simir)
    {
        alas = a;
        tinggi = t;
        sisimiring = simir;
    }

    public double hitungLuas()
    {
        double luas;
        luas = ((0.5) * alas * tinggi);
        return luas;
    }

    public int hitungKeliling()
    {
        int keliling;
        keliling = (alas + sisimiring + sisimiring);
        return keliling;
    }
}
