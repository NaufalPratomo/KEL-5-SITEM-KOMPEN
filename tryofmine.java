import java.util.Scanner;

public class tryofmine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        String nimMhs;
        String passMhs = "1";
        String nama, kelas, semester;
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

        // Input semester
        System.out.print("Masukkan Semester (1-8): ");
        semester = input.nextLine();

        // Input kompen sesuai semester
        double kompenSum = 0;

        for (int i = 1; i <= Integer.parseInt(semester); i++) {
            System.out.println("Anda memilih semester " + i + ".");
            System.out.print("Masukkan Kompen Semester " + i + " : ");
            double kompen = input.nextDouble() * 4;
            kompenSum += kompen;
        }

        poin_akhir = kompenSum;

        // Hasil akhir
        System.out.println(nama + " dengan NIM " + nimMhs + " kelas " + kelas + " semester " + semester
                + " memiliki nilai kompen akhir " + poin_akhir);

        // Close the Scanner
        input.close();
    }
}
