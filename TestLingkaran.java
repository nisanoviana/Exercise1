/**
 * Created by nicun on 5/19/2015.
 */
public class TestLingkaran {
    public static void main(String[] args)
    {
        Lingkaran bangun = new Lingkaran();

        bangun.jari= 7;
        bangun.diameter= 14;

        bangun.PrinttoScreen();

        System.out.println("Luas: " + bangun.hitungLuas());
        System.out.println("Keliling: " + bangun.hitungKeliling());
    }
}
