import java.util.Scanner;

public class HitungGaji {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] arrayGaji = {5000000, 6500000, 9500000};
        double[] arrayLembur = {0.30, 0.32, 0.34, 0.36, 0,38};

        // Deklarasi
        String golongan;
        int jamLembur;
        double gajiPokok = 0;
        double gajiLembur = 0;
        double persentaseLembur = 0;
        double totalPenghasilan = 0;

        // inputan user
        System.out.println("Masukan Golongan karyawan A, B atau C?");
        golongan = input.nextLine();

        System.out.println("Masukan jam Lembur");
        jamLembur = input.nextInt();

        // Hitung penghasilan berdasarkna golongan
        if (golongan.equalsIgnoreCase("A")) {
            gajiPokok = arrayGaji[0];
        } else if (golongan.equalsIgnoreCase("B")) {
            gajiPokok = arrayGaji[1];
        } else if (golongan.equalsIgnoreCase("C")) {
            gajiPokok = arrayGaji[2];
        } else {
            System.out.println("Golongan tidak valid");
            System.exit(0);
        }

        // Hitung penghasilan berdasarkna jam lembur
        if (jamLembur == 1) {
            persentaseLembur = arrayLembur[0];
        } else if (jamLembur == 2) {
            persentaseLembur = arrayLembur[1];
        } else if (jamLembur == 3) {
            persentaseLembur = arrayLembur[2];
        } else if (jamLembur == 4) {
            persentaseLembur = arrayLembur[3];
        } else if (jamLembur == 5) {
            persentaseLembur = arrayLembur[4];
        } else {
            persentaseLembur = 0.0;
        }

        // Menghitung Gaji
        gajiLembur = gajiPokok * persentaseLembur;
        totalPenghasilan = gajiPokok + gajiLembur;

        // output
        System.out.println("=========================");
        System.out.println("MENGHITUNG TOTAL PENGHASILAN");
        System.out.println("Golongan Karyawan : " + golongan);
        System.out.println("Jam Lembur      :" + jamLembur);
        System.out.printf("Gaji Pokok    : Rp %.0f\n", gajiPokok);
        System.out.printf("Gaji Lembur : Rp %.0f\n", gajiLembur);
        System.out.println("=============================");
        System.out.printf("TOTAL PENGHASILAN : Rp %.0f\n", totalPenghasilan);
        System.out.println("==========================");

        input.close();
    }
}