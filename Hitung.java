import java.text.DecimalFormat;
import java.util.Scanner;

class Hitung {
    private static Scanner scn = new Scanner(System.in);
    private static Hitung hit = new Hitung();
    private static DecimalFormat formating = new DecimalFormat("#,###.00");

    public static void main(String[] args) {
        hit.rekursifPangkat();
        hit.hitungPangkat();
        hit.akarPangkat();
        hit.bungaRiba();
        scn.close();
    }

    void rekursifPangkat() {
        System.out.print("\nAngka: ");
        double x = scn.nextDouble();
        System.out.print("Pangkat: ");
        double n = scn.nextDouble();
        Pangkat pangkat = new Pangkat(x, n);
        System.out.println("Hasil pangkat Rekursif: " + pangkat.pangkat(x, n));
    }

    void hitungPangkat() {
        System.out.print("\nAngka : ");
        double y = scn.nextDouble();
        System.out.print("Pangkat : ");
        double z = scn.nextDouble();
        Pangkat pangkat = new Pangkat(y, z);
        System.out.println("Hasil Pangkat: " + pangkat.pangkat());
    }

    void akarPangkat() {
        System.out.print("\nAngka : ");
        double a = scn.nextDouble();
        System.out.print("Akar Pangkat : ");
        double b = scn.nextDouble();
        AkarPangkat akar = new AkarPangkat(a, b);
        System.out.println("Hasil akar Pangkat : " + akar.pangkat());
    }

    void bungaRiba() {
        System.out.print("\nModal : ");
        double modal = scn.nextDouble();
        System.out.print("Bunga : ");
        double bunga = scn.nextDouble();
        System.out.print("Lama : ");
        double lama = scn.nextDouble();
        riba interest = new riba(modal, bunga, lama);
        String hasil = formating.format(interest.pangkat());
        System.out.println("Besar Riba: " + hasil);
    }
}
