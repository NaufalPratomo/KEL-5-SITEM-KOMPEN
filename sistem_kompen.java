import java.util.Scanner;

public class sistem_kompen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        String nimMhs = "1";
        String passMhs = "1";
        String nama;
        String kelas;
        double kompen_s1, kompen_s2, kompen_s3, kompen_s4, kompen_s5, kompen_s6, kompen_s7, kompen_s8, poin_akhir;

        // Input NIM dan Password
        System.out.println("===== Menghitung Nilai Kompen Mahasiswa =====\n");

            System.out.print("Masukkan NIM: ");
            nimMhs = input.nextLine();
            System.out.print("Masukkan Password: ");
            String enteredPassword = input.nextLine();

            //if else nim and pass
            if (nimMhs.equals(passMhs)) {
                if (enteredPassword.equals(passMhs)) {
                    System.out.println("Login berhasil");
                } else {
                    System.out.println("Password salah. Coba lagi.");
                    return;
                }
            } else {
                System.out.println("NIM salah. Coba lagi.");
                return;
            }

        // Input data mahasiswa
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = input.nextLine();

        // Input kompen per semester
        System.out.print("Kompen Semester 1 (jam) : ");
        kompen_s1 = input.nextDouble() * 2;
        System.out.print("Kompen Semester 2 (jam)  : ");
        kompen_s2 = input.nextDouble() * 2;
        System.out.print("Kompen Semester 3 (jam)  : ");
        kompen_s3 = input.nextDouble() * 2;
        System.out.print("Kompen Semester 4 (jam) : ");
        kompen_s4 = input.nextDouble() * 2;
        System.out.print("Kompen Semester 5 (jam) : ");
        kompen_s5 = input.nextDouble() * 2;
        System.out.print("Kompen Semester 6 (jam) : ");
        kompen_s6 = input.nextDouble() * 2;
        System.out.print("Kompen Semester 7 (jam) : ");
        kompen_s7 = input.nextDouble() * 2;
        System.out.print("Kompen Semester 8 (jam) : ");
        kompen_s8 = input.nextDouble() * 2;

        // If else kompen
        if (kompen_s1 > 0 || kompen_s2 > 0 || kompen_s3 > 0 || kompen_s4 > 0 || kompen_s5 > 0 || kompen_s6 > 0 || kompen_s7 > 0 || kompen_s8 > 0) {
            poin_akhir = kompen_s1 * 2 + kompen_s2 * 2 + kompen_s3 * 2 + kompen_s4 * 2 + kompen_s5 * 2 + kompen_s6 * 2 + kompen_s7 * 2 + kompen_s8 * 2;
        } else {
            poin_akhir = kompen_s1 + kompen_s2 + kompen_s3 + kompen_s4 + kompen_s5 + kompen_s6 + kompen_s7 + kompen_s8;
        }

        // Hasil akhir
        System.out.println(nama + " dengan NIM " + nimMhs + " kelas " + kelas + " memiliki nilai kompen akhir " + poin_akhir);
        
    }
}
