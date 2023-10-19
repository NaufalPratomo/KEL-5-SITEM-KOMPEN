import java.util.Scanner;

public class tryofmine {

    // clear screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        String nimMhs;
        String passMhs = "";
        String nama, kelas;
        int semester;
        double poin_akhir = 0;

        // Input NIM dan Password(Login)
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
        clearScreen();

        // Input data mahasiswa
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = input.nextLine();
        clearScreen();

        // Menu
        Boolean sistemKompen = true;
        int menu;
        do {
            System.out.println("\nList Menu [" + nama + "]: ");
            System.out.println("0. Keluar Program ");
            System.out.println("1. Perhitungan Kompen Mahasiswa: ");
            System.out.print("\n Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();
            clearScreen();
            switch (menu) {
                case 0:
                    sistemKompen = false;
                    break;
                case 1:
                    // Input semester(pilih semester)
                    System.out.print("Perhitungan Kompen Mahasiswa");
                    System.out.print("Masukkan Semester (1-8): ");
                    semester = input.nextInt();

                    // Input kompen sesuai semester
                    double kompenSemester = 0;

                    for (int i = 1; i <= semester; i++) {
                        System.out.println("Anda memilih semester " + i + ".");
                        System.out.print("Masukkan Kompen Semester " + i + " : ");
                        double kompen = input.nextDouble() * 4;
                        kompenSemester += kompen;
                    }

                    poin_akhir = kompenSemester;

                    // Hasil akhir
                    System.out.println(nama + " dengan NIM " + nimMhs + " kelas " + kelas + " semester " + semester
                            + " memiliki nilai kompen akhir " + poin_akhir);

            }
        } while (sistemKompen);
        System.out.println("\n\nTerimakasih :D");

        // Close the Scanner
        input.close();
    }
}
