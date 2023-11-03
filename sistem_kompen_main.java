import java.util.Scanner;

public class sistem_kompen_main{

    // Clear the screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaration
        String nimMhs;
        String passMhs;
        String nama, kelas;
        int semester;
        double poin_akhir = 0;

        // Array for login data (NIM and password)
        String[] loginData = {
            "2341720075", "1", 
            "2341720212", "1", 
            "2341720218", "1", 
            "2341720016", "1",
            "1", "1"
        };

        System.out.println("===== Menghitung Nilai Kompen Mahasiswa =====\n");
        
        boolean loginSukses = false;
        while (!loginSukses) {
            System.out.print("Masukkan NIM: ");
            nimMhs = input.nextLine();
            System.out.print("Masukkan Password: ");
            passMhs = input.nextLine();
            
            boolean found = false;
            for (int i = 0; i < loginData.length; i += 2) {
                if (nimMhs.equals(loginData[i]) && passMhs.equals(loginData[i + 1])) {
                    found = true;
                    loginSukses = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("NIM atau Password salah. Coba lagi.");
            }
        }
        clearScreen(); // Clear the screen

        // Input student data
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = input.nextLine();
        clearScreen(); // Clear the screen

        // Menu
        boolean sistemKompen = true;
        int menu;
        do {
            System.out.println("\nSelamat datang " + nama + ", Silahkan pilih menu: ");
            System.out.println("0. Keluar Program");
            System.out.println("1. Perhitungan Kompen Mahasiswa");
            System.out.println("2. List Kompen Pada Kelas "+ kelas);
            System.out.print("\nPilih menu: ");
            menu = input.nextInt();
            input.nextLine();
            clearScreen(); // Clear the screen
            switch (menu) {
                case 0:
                    sistemKompen = false;
                    break;
                case 1:
                    // Input semester (pilih semester)
                    System.out.print("Perhitungan Kompen Mahasiswa");
                    System.out.print("Masukkan Semester (1-8): ");
                    semester = input.nextInt();

                    // Input kompen sesuai semester
                    double kompenSemester = 0;

                    for (int i = 1; i <= semester; i++) {
                        System.out.println("Anda memilih semester " + i + ".");
                        System.out.print("Masukkan Kompen Semester " + i + ": ");
                        double kompen = input.nextDouble() * 2;
                        kompenSemester += kompen;
                    }

                    poin_akhir = kompenSemester;

                    // Hasil akhir
                    System.out.println(nama + " kelas " + kelas + " semester " + semester
                        + " memiliki nilai kompen akhir " + poin_akhir);
                case 2:
                    //List Kompen Setiap Mahasiswa Pada Kelas yang Diinputkan
                    String[][] kompenMhs = {
                        {"Nama", "S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8"},
                        {"Nopal", "2", "1", "3"},
                        {"Faishal", "2", "1", "3"},
                        {"Dhanisa", "2", "1", "3"},
                        {"Valen", "2", "1", "3"},
                    };
                    // Cetak array 2D ke dalam format tabel
                    for (int i = 0; i < kompenMhs.length; i++) {
                        for (int j = 0; j < kompenMhs[i].length; j++) {
                            System.out.print(kompenMhs[i][j] + "\t");
                        }
                        System.out.println();
                    }
                }


        } while (sistemKompen);
        System.out.println("\n\nTerima kasih :D");

        // Close the Scanner
        input.close();
    }
}
