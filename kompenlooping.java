import java.util.Scanner;

public class kompenlooping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        String nimMhs;
        String passMhs = "1";
        String nama;
        String kelas;
        double poin_akhir = 0;

        // Input NIM dan Password
        System.out.println("===== Menghitung Nilai Kompen Mahasiswa =====\n");
        do {
            System.out.print("Masukkan NIM : ");
            nimMhs = input.nextLine();
            System.out.print("Masukkan Password : ");
            passMhs = input.nextLine();
            if (!nimMhs.equals(passMhs)) {
                System.out.println("NIM atau Password salah. Coba lagi.");
            }
        } while (!nimMhs.equals(passMhs));

        // Input data mahasiswa
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = input.nextLine();

        // Input kompen per semester (pake looping)
        double[] kompen = new double[8];
        for (int i = 0; i < kompen.length; i++) {
            System.out.print("Kompen Semester " + (i + 1) + " : ");
            kompen[i] = input.nextDouble();
            if (kompen[i] > 0) {
                double kompenGanda = kompen[i] * 2;
                if (i < kompen.length - 1) {
                    kompen[i + 1] += kompenGanda;
                }
                poin_akhir += kompenGanda;
            }
        }

        // Hasil akhir
        poin_akhir = kompen[7];
        System.out.println(nama + " dengan NIM " + nimMhs + " kelas " + kelas + " memiliki nilai kompen akhir " + poin_akhir);


        // Close the Scanner
        input.close();
    }
}
