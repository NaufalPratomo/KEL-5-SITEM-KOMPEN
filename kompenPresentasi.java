import java.util.Scanner;

public class kompenPresentasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        String nimMhs;
        String passMhs;
        String nama, kelas, semester;
        double kompen_s1 = 0, kompen_s2 = 0, kompen_s3 = 0, kompen_s4 = 0, kompen_s5 = 0, kompen_s6 = 0, kompen_s7 = 0,
        kompen_s8 = 0, poin_akhir = 0;

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

        // input semester
        System.out.print("Masukkan Semster : ");
        semester = input.nextLine();

        // switch case dan input per-semester
        switch (semester) {
            case "1":
                System.out.println("Anda memilih semester 1.");
                System.out.print("Masukkan Kompen Semester 1 : ");
                kompen_s1 = input.nextDouble() * 2;
                poin_akhir = kompen_s1 * 2;
                break;
            case "2":
                System.out.println("Anda memilih semester 2.");
                System.out.print("Masukkan Kompen Semester 1 : ");
                kompen_s1 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 2 : ");
                kompen_s2 = input.nextDouble() * 2;
                if ((kompen_s1 > 0) || (kompen_s2 > 0)) {
                    poin_akhir = kompen_s1 * 2 + kompen_s2 * 2;
                } else {
                    poin_akhir = kompen_s1 + kompen_s2;
                }
                break;
            case "3":
                System.out.println("Anda memilih semester 3.");
                System.out.print("Masukkan Kompen Semester 1 : ");
                kompen_s1 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 2 : ");
                kompen_s2 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 3 : ");
                kompen_s3 = input.nextDouble() * 2;
                if ((kompen_s1 > 0) || (kompen_s2 > 0) || (kompen_s3 > 0)) {
                    poin_akhir = kompen_s1 * 2 + kompen_s2 * 2 + kompen_s3 * 2;
                } else {
                    poin_akhir = kompen_s1 + kompen_s2 + kompen_s3;
                }
                break;
            case "4":
                System.out.println("Anda memilih semester 4.");
                System.out.print("Masukkan Kompen Semester 1 : ");
                kompen_s1 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 2 : ");
                kompen_s2 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 3 : ");
                kompen_s3 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 4 : ");
                kompen_s4 = input.nextDouble() * 2;
                if ((kompen_s1 > 0) || (kompen_s2 > 0) || (kompen_s3 > 0) || (kompen_s4 > 0)) {
                    poin_akhir = kompen_s1 * 2 + kompen_s2 * 2 + kompen_s3 * 2 + kompen_s4 * 2;
                } else {
                    poin_akhir = kompen_s1 + kompen_s2 + kompen_s3 + kompen_s4;
                }
                break;
            case "5":
                System.out.println("Anda memilih semester 5.");
                System.out.print("Masukkan Kompen Semester 1 : ");
                kompen_s1 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 2 : ");
                kompen_s2 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 3 : ");
                kompen_s3 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 4 : ");
                kompen_s4 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 5 : ");
                kompen_s5 = input.nextDouble() * 2;
                if ((kompen_s1 > 0) || (kompen_s2 > 0) || (kompen_s3 > 0) || (kompen_s4 > 0) || (kompen_s5 > 0)) {
                    poin_akhir = kompen_s1 * 2 + kompen_s2 * 2 + kompen_s3 * 2 + kompen_s4 * 2 + kompen_s5 * 2;
                } else {
                    poin_akhir = kompen_s1 + kompen_s2 + kompen_s3 + kompen_s4 + kompen_s5;
                }
                break;
            case "6":
                System.out.println("Anda memilih semester 6.");
                System.out.print("Masukkan Kompen Semester 1 : ");
                kompen_s1 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 2 : ");
                kompen_s2 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 3 : ");
                kompen_s3 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 4 : ");
                kompen_s4 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 5 : ");
                kompen_s5 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 6 : ");
                kompen_s6 = input.nextDouble() * 2;
                if ((kompen_s1 > 0) || (kompen_s2 > 0) || (kompen_s3 > 0) || (kompen_s4 > 0) || (kompen_s5 > 0)
                        || (kompen_s6 > 0)) {
                    poin_akhir = kompen_s1 * 2 + kompen_s2 * 2 + kompen_s3 * 2 + kompen_s4 * 2 + kompen_s5 * 2
                            + kompen_s6 * 2;
                } else {
                    poin_akhir = kompen_s1 + kompen_s2 + kompen_s3 + kompen_s4 + kompen_s5 + kompen_s6;
                }
                break;
            case "7":
                System.out.println("Anda memilih semester 7.");
                System.out.print("Masukkan Kompen Semester 1 : ");
                kompen_s1 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 2 : ");
                kompen_s2 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 3 : ");
                kompen_s3 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 4 : ");
                kompen_s4 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 5 : ");
                kompen_s5 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 6 : ");
                kompen_s6 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 7 : ");
                kompen_s7 = input.nextDouble() * 2;
                if ((kompen_s1 > 0) || (kompen_s2 > 0) || (kompen_s3 > 0) || (kompen_s4 > 0) || (kompen_s5 > 0)
                        || (kompen_s6 > 0) || (kompen_s7 > 0)) {
                    poin_akhir = kompen_s1 * 2 + kompen_s2 * 2 + kompen_s3 * 2 + kompen_s4 * 2 + kompen_s5 * 2
                            + kompen_s6 * 2 + kompen_s7 * 2;
                } else {
                    poin_akhir = kompen_s1 + kompen_s2 + kompen_s3 + kompen_s4 + kompen_s5 + kompen_s6 + kompen_s7;
                }
                break;
            case "8":
                System.out.print("Anda memilih semester 8.");
                System.out.print("Masukkan Kompen Semester 1 : ");
                kompen_s1 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 2 : ");
                kompen_s2 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 3 : ");
                kompen_s3 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 4 : ");
                kompen_s4 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 5 : ");
                kompen_s5 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 6 : ");
                kompen_s6 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 7 : ");
                kompen_s7 = input.nextDouble() * 2;
                System.out.print("Masukkan Kompen Semester 8 : ");
                kompen_s8 = input.nextDouble() * 2;
                if ((kompen_s1 > 0) || (kompen_s2 > 0) || (kompen_s3 > 0) || (kompen_s4 > 0) || (kompen_s5 > 0)
                        || (kompen_s6 > 0) || (kompen_s7 > 0) || (kompen_s8 > 0)) {
                    poin_akhir = kompen_s1 * 2 + kompen_s2 * 2 + kompen_s3 * 2 + kompen_s4 * 2 + kompen_s5 * 2
                            + kompen_s6 * 2 + kompen_s7 * 2 + kompen_s8 * 2;
                } else {
                    poin_akhir = kompen_s1 + kompen_s2 + kompen_s3 + kompen_s4 + kompen_s5 + kompen_s6 + kompen_s7
                            + kompen_s8;
                }
                break;
        }

        // Hasil akhir
        System.out.println(nama + " dengan NIM " + nimMhs + " kelas " + kelas + " semester " + semester
                + " memiliki nilai kompen akhir " + poin_akhir);

        // Close the Scanner
        input.close();
    }
}
