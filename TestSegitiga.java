/**
 * Created by nicun on 5/19/2015.
 */
public class TestSegitiga {
    public static void main(String[] args)
    {
        Segitiga bangun = new Segitiga();

        bangun.alas = 20;
        bangun.tinggi = 15;
        bangun.sisimiring = 10;

        bangun.PrintToScreen();

        System.out.println("Luas: " + bangun.hitungLuas());
        System.out.println("Keliling: " + bangun.hitungKeliling());

    }
}
